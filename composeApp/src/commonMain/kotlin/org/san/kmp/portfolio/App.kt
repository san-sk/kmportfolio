package org.san.kmp.portfolio

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.san.kmp.portfolio.navigation.PortfolioNavigation

@Composable
@Preview
fun App() {
    MaterialTheme {
        PortfolioNavigation()
    }
}