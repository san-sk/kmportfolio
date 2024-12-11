package org.san.kmp.portfolio.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.SubcomposeAsyncImage
import org.san.kmp.portfolio.data.Work


@Composable
fun ExperienceView(modifier: Modifier = Modifier, experience: List<Work>) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            modifier = Modifier.padding(15.dp),
            text = "Experience",
            style = MaterialTheme.typography.h6
        )

        LazyVerticalGrid(
            horizontalArrangement = Arrangement.Center,
            columns = GridCells.Fixed(1),
            modifier = modifier.height(600.dp).fillMaxWidth()
        ) {

            items(experience) { work ->
                ExperienceCard(
                    modifier = Modifier.height(120.dp).padding().fillMaxWidth(), work = work
                )

            }

        }
    }
}

@Composable
fun ExperienceCard(modifier: Modifier = Modifier, work: Work) {

    Column(modifier = modifier.padding(5.dp)) {
        Row(
            modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            SubcomposeAsyncImage(contentScale = ContentScale.FillBounds,
                model = work.link,
                contentDescription = work.name,
                modifier = Modifier.weight(0.25f).background(work.colorCodes[1], CircleShape).clip(CircleShape),
                loading = {
                    CircularProgressIndicator(modifier = Modifier.fillMaxSize())
                },
                error = {
                    Box(
                        modifier = Modifier.background(
                                brush = Brush.linearGradient(
                                    colors = work.colorCodes,        //Gradient colors
                                    start = Offset(0f, 0f),    //Start position
                                    end = Offset(1000f, 1000f) //End position
                                )
                            )
                    ) {
                        Text(
                            modifier = Modifier.fillMaxSize().padding(top = 34.dp),
                            text = work.name.first().toString().uppercase(),
                            color = Color.White,
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                fontSize = 35.sp,
                                fontWeight = FontWeight.Bold,
                                fontFamily = FontFamily.Cursive
                            ),
                        )
                    }
                })
            Column(Modifier.padding(10.dp).weight(0.75f).fillMaxSize()) {
                Text(text = work.role, style = MaterialTheme.typography.subtitle1)

                Row(
                    horizontalArrangement = Arrangement.Start,
                ) {
                    Text(text = work.name, style = MaterialTheme.typography.subtitle2)
                    Text(" | ")
                    Text(
                        text = work.date, style = MaterialTheme.typography.body1
                    )
                }
                Text(text = work.description, style = MaterialTheme.typography.body2, maxLines = 2)
            }

        }

    }

}