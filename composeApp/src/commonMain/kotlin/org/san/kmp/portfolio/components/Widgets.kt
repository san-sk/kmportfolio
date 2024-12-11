package org.san.kmp.portfolio.components

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.sp

@Composable
fun MarqueeText(modifier: Modifier = Modifier, text: String) {
    val textWidth = remember { mutableStateOf(0f) }
    val parentWidth = remember { mutableStateOf(0f) }
    val offsetX = remember { Animatable(0f) }

    // Infinite marquee animation
    LaunchedEffect(textWidth.value, parentWidth.value) {
        if (textWidth.value > parentWidth.value) {
            offsetX.snapTo(0f)
            offsetX.animateTo(
                targetValue = -(textWidth.value - parentWidth.value),
                animationSpec = infiniteRepeatable(
                    animation = tween(2000, easing = LinearEasing),
                    repeatMode = RepeatMode.Reverse
                )
            )
        }
    }

    Box(
        modifier = modifier
            .fillMaxWidth()
            .onGloballyPositioned {
                parentWidth.value = it.size.width.toFloat()
            }
            .clipToBounds() // Ensures text doesn't overflow the box
    ) {
        Text(
            text = text,
            style = TextStyle(
                brush = Brush.linearGradient(
                    colors = listOf(Color.Blue, Color.Red)
                ),
                fontSize = 20.sp
            ),
            modifier = Modifier
                .offset { IntOffset(offsetX.value.toInt(), 0) }
                .onGloballyPositioned {
                    textWidth.value = it.size.width.toFloat()
                }
        )
    }
}

