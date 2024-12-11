package org.san.kmp.portfolio.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Warning
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import coil3.compose.SubcomposeAsyncImage
import org.san.kmp.portfolio.data.Contact

@Composable
fun ContactView(modifier: Modifier = Modifier, contact: List<Contact>) {

    Column(
        modifier = modifier
            .fillMaxWidth()
            .wrapContentSize()
            .background(Color(0x0FFEDF7FA))
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Contact", style = MaterialTheme.typography.h6)
        LazyRow(
            Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            items(contact) { c ->
                SubcomposeAsyncImage(contentScale = ContentScale.FillBounds,
                    model = c.icon,
                    contentDescription = c.name,
                    modifier = Modifier.padding(10.dp).size(50.dp).padding(10.dp),
                    loading = {
                        CircularProgressIndicator(modifier = Modifier.fillMaxSize())
                    },
                    error = {
                        Text(
                            modifier = Modifier.fillMaxSize(),
                            text = c.name,
                            color = Color.Black,
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                fontSize = 12.sp,
                                fontWeight = FontWeight.SemiBold,
                                fontFamily = FontFamily.Monospace
                            ),
                            maxLines = 1,
                        )
                    })
            }
        }
        Text(text = "Copyright © 2024 San", style = MaterialTheme.typography.overline)
    }
}
