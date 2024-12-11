package org.san.kmp.portfolio.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextMotion
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImagePainter
import coil3.compose.SubcomposeAsyncImage
import coil3.compose.SubcomposeAsyncImageContent

@Composable
fun ProfileHeaderView(modifier: Modifier = Modifier, name: String, description: String) {

    Box {

        Row(
            modifier = modifier.fillMaxWidth().background(Color.White).padding(10.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {

                SubcomposeAsyncImage(
                    model = "https://pics.craiyon.com/2023-11-26/oMNPpACzTtO5OVERUZwh3Q.webp",
                    modifier = Modifier.size(124.dp).padding(10.dp).clip(CircleShape),
                    contentDescription = ""
                ) {
                    val state by painter.state.collectAsState()
                    if (state is AsyncImagePainter.State.Success) {
                        SubcomposeAsyncImageContent()
                    } else {
                        CircularProgressIndicator()
                    }
                }

                Text(
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp, vertical = 5.dp),
                    text = name,
                    fontFamily = FontFamily.SansSerif,
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        brush = Brush.linearGradient(
                            colors = listOf(Color.Blue, Color.Red)
                        ),
                        fontSize = 20.sp,
                        textMotion = TextMotion.Animated,
                        fontWeight = FontWeight.Bold
                    )
                )

                Text(
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp, vertical = 5.dp),
                    text = description,
                     style = TextStyle(
                        fontSize = 16.sp,
                        textMotion = TextMotion.Animated,
                                fontWeight = FontWeight.Medium
                    ),
                    fontFamily = FontFamily.Serif,
                    textAlign = TextAlign.Center,
                    maxLines = 2
                )

               /* Button(shape = MaterialTheme.shapes.small,
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFFF6464)),
                    onClick = {}) {
                    Text(
                        modifier = Modifier.wrapContentSize().padding(5.dp),
                        text = "Download",
                        style = MaterialTheme.typography.button,
                        textAlign = TextAlign.End,
                        color = Color.White
                    )
                }*/
            }

        }

        /*IconButton(modifier = Modifier.padding(20.dp), onClick = {}) {
            Icon(Icons.Default.Menu,"menu")
        }*/
    }
}
