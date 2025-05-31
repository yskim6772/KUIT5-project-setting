package com.konkuk.kuitprojectsetting.presentation.navigation

sealed class Route(
    val route: String
) {
    data object Home: Route(route = "home")

    data object Diary: Route(route = "diary")

    data object My: Route(route = "my")
}