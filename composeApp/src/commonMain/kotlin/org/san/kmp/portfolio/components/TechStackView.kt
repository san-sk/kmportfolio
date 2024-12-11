package org.san.kmp.portfolio.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil3.compose.SubcomposeAsyncImage

@Composable
fun TechStackView(modifier: Modifier = Modifier, skills: List<String>) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            modifier = Modifier.padding(15.dp),
            text = "My Tech Stack",
            style = MaterialTheme.typography.h6
        )

        LazyHorizontalGrid(
            rows = GridCells.Fixed(2),
            modifier = modifier.height(140.dp).fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {

            items(skills) { skill ->
                SubcomposeAsyncImage(
                    model = "https://raw.githubusercontent.com/devicons/devicon/v2.16.0/icons/$skill/$skill-original.svg",
                    contentDescription = skill,
                    modifier = Modifier.size(100.dp).padding(10.dp).clip(RectangleShape),
                    loading = {
                        CircularProgressIndicator(modifier = Modifier.size(20.dp))
                    },
                    error = {
                        Text(
                            text = skill,
                            modifier = Modifier
                                .width(100.dp) // Constrain width
                                .padding(4.dp),
                            textAlign = TextAlign.Center, // Center text
                            maxLines = 1, // Limit to a single line
                            overflow = TextOverflow.Ellipsis // Ellipsize text if it's too long
                        )
                    }
                )
            }
        }
    }


}