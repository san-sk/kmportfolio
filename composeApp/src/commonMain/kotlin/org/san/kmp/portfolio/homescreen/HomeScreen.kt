package org.san.kmp.portfolio.homescreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import org.san.kmp.portfolio.components.ContactView
import org.san.kmp.portfolio.components.ExperienceView
import org.san.kmp.portfolio.components.ProfileHeaderView
import org.san.kmp.portfolio.components.ProjectsView
import org.san.kmp.portfolio.components.TechStackView
import org.san.kmp.portfolio.data.Contact
import org.san.kmp.portfolio.data.Project
import org.san.kmp.portfolio.data.Work

@Composable
fun HomeScreen(modifier: Modifier = Modifier, navController: NavController) {

    val mobileDeveloperTechStack = remember {
        listOf(
            "kotlin",
            "java",
            "javascript",
            "android",
            "flutter",
            "react",
            "firebase",
            "github",
            "nodejs",
            "sqlite",
            "figma"
        )
    }


    LazyColumn(
        modifier = modifier.fillMaxSize().background(Color.White),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            ProfileHeaderView(
                name = "Hi, My Name is San",
                description = "I Build Things for Mobile & Web...."
            )

            TechStackView(
                modifier = Modifier.background(Color.Transparent).padding(5.dp),
                skills = mobileDeveloperTechStack
            )
        }

        item {
            ProjectsView(projects = Project.getSampleData(), navController = navController)
        }

        item {
            ExperienceView(experience = Work.getSampleData())
        }

       /* item {
            Column(
                modifier = Modifier.fillMaxWidth().height(220.dp).background(Color(0x0FFEDF7FA))
                    .padding(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(text = "Recent Posts", style = MaterialTheme.typography.subtitle1)
                LazyRow(
                    Modifier.fillMaxWidth().height(200.dp).padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    items(Blog.getSampleData()) {
                        BlogCard(blog = it)
                    }
                }
            }
        }*/

        item {
            ContactView(contact = Contact.getSampleData())
        }
    }
}