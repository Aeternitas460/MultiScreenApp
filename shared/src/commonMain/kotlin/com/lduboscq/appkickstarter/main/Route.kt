package com.lduboscq.appkickstarter.main

import cafe.adriel.voyager.core.screen.Screen
import com.lduboscq.appkickstarter.screen.AboutScreen
import com.lduboscq.appkickstarter.screen.ContactScreen
import com.lduboscq.appkickstarter.screen.MainScreen

sealed class Route {
    object Home : Route()
    object About : Route()
    object Contact : Route()
}

fun screenRouter(screen: Route) : Screen {
    return when (screen) {
        is Route.Home -> MainScreen()

        is Route.About -> AboutScreen()

        is Route.Contact -> ContactScreen()
    }
}