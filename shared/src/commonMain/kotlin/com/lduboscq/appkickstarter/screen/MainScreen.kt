package com.lduboscq.appkickstarter.screen

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import cafe.adriel.voyager.core.screen.Screen
import com.lduboscq.appkickstarter.main.Banner
import com.lduboscq.appkickstarter.ui.MyBottomBar
import com.lduboscq.appkickstarter.ui.MyTopBar


internal class MainScreen : Screen {
    @Composable
    override fun Content() {
        val interactionSource = remember { MutableInteractionSource() }
        val isPressed by interactionSource.collectIsPressedAsState()
        Scaffold(
            topBar = {
                MyTopBar()
            },
            bottomBar = {
                MyBottomBar()
                        },
        ) {
            Banner()
        }
    }
}
