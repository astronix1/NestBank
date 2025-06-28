package com.example.nestbank

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            BottomNavigationBar(navController = navController)
        }
    ) { padding ->
        NavHost(
            navController = navController,
            startDestination = "homescreen",
            modifier = Modifier.padding(padding)
        ) {
            composable("homescreen") { HomeScreen(navController) }
            composable("wallet") { WalletScreen() }
            composable("notifications") { NotificationScreen() }
            composable("account") { AccountScreen() }
            composable("business") { BusinessScreen() }
            composable("analytics") { AnalyticsScreen() }
            composable("transactions") { TransactionsScreen() }
        }
    }
}
