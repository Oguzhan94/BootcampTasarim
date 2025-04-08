package com.example.bootcamptasarim.ui.screens.navigation

import kotlinx.serialization.Serializable

sealed class Screen {

    @Serializable
    data object Login : Screen()

    @Serializable
    data object Register : Screen()

    @Serializable
    data class Main(val name: String) : Screen()
}