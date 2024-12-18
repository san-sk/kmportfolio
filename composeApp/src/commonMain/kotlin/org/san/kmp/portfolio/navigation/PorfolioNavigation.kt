package org.san.kmp.portfolio.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.san.kmp.portfolio.data.Project
import org.san.kmp.portfolio.homescreen.HomeScreen
import org.san.kmp.portfolio.homescreen.ProjectDetailsScreen

@Composable
fun PortfolioNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home",) {
        composable("home") { HomeScreen(navController = navController) }
        composable("project_details/{projectName}") { backStackEntry ->
            val itemId = backStackEntry.arguments?.getString("projectName") ?: ""
            ProjectDetailsScreen(
                project = Project.getSampleData().firstOrNull { it.name == itemId}!!,
                navController = navController
            )
        }
    }
}