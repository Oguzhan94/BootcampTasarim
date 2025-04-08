package com.example.bootcamptasarim.ui.screens.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.bootcamptasarim.ui.screens.LoginPage
import com.example.bootcamptasarim.ui.screens.MainPage
import com.example.bootcamptasarim.ui.screens.RegisterPage

@Composable
fun NavGraph() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Login
    ) {

        composable<Screen.Login> {

            LoginPage { name ->
                navController.navigate(Screen.Main(name))
            }
        }

        composable<Screen.Register> {

            RegisterPage {
                navController.navigate(Screen.Login)
            }
        }

        composable<Screen.Main> {
            val route: Screen.Main = it.toRoute()
            MainPage(name = route.name)
        }


    }

}