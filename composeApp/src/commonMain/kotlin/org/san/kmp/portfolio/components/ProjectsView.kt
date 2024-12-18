package org.san.kmp.portfolio.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil3.compose.SubcomposeAsyncImage
import org.san.kmp.portfolio.data.Project

@Composable
fun ProjectsView(modifier: Modifier = Modifier, projects: List<Project>, navController: NavController) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
    ) {

        Text(
            modifier = Modifier.padding(15.dp),
            text = "Projects",
            style = MaterialTheme.typography.h6
        )

        LazyHorizontalGrid(
            horizontalArrangement = Arrangement.Center,
            rows = GridCells.Fixed(1), modifier = modifier.fillMaxWidth().height(300.dp)
        ) {

            items(projects) { project ->
                ProjectItem(modifier = Modifier.size(250.dp), project = project) {
                    navController.navigate("project_details/${project.name}")
                }
            }

        }
    }
}

@Composable
fun ProjectItem(modifier: Modifier = Modifier, project: Project, onClick: () -> Unit) {

    Card(modifier = modifier.padding(4.dp).clickable {
        onClick()
    }, elevation = 4.dp, shape = RoundedCornerShape(8.dp)) {

        Column {
            SubcomposeAsyncImage(
                contentScale = ContentScale.FillBounds,
                model = project.imageLink,
                contentDescription = project.name,
                modifier = Modifier.height(140.dp),
                loading = {
                    CircularProgressIndicator(modifier = Modifier.size(20.dp))
                },
                error = {
                    Box(
                        modifier = Modifier
                            .height(140.dp).fillMaxWidth()
                            .background(
                                brush = Brush.linearGradient(
                                    colors = project.colorCodes,        //Gradient colors
                                    start = Offset(0f, 0f),    //Start position
                                    end = Offset(1000f, 1000f) //End position
                                )
                            )
                    )
                }
            )
            Column(Modifier.padding(10.dp)) {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = project.name,
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold
                    ),
                    textAlign = TextAlign.Center
                )

                Text(
                    modifier = Modifier.padding(vertical = 5.dp),
                    text = project.description, style = MaterialTheme.typography.body2, maxLines = 3
                )

                Text(
                    modifier = Modifier.padding(vertical = 2.dp),
                    text = "Tags: ${project.tags.joinToString(", ")}",
                    style = TextStyle(
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Light,
                        fontStyle = FontStyle.Normal
                    ),
                )

                Row(
                    modifier = Modifier.padding(vertical = 2.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    //Text(text = project.date, style = MaterialTheme.typography.overline)
                    Text(
                        text = project.workLink,
                        style = MaterialTheme.typography.overline,
                        maxLines = 1
                    )

                }
            }
        }
    }

}
