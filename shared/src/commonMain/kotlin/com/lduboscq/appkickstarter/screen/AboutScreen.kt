package com.lduboscq.appkickstarter.screen

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import cafe.adriel.voyager.core.screen.Screen
import com.lduboscq.appkickstarter.main.Banner
import com.lduboscq.appkickstarter.main.BannerAbout
import com.lduboscq.appkickstarter.ui.MyBottomBar
import com.lduboscq.appkickstarter.ui.MyTopBar


internal class AboutScreen: Screen {
    @Composable
    override fun Content() {
        val interactionSource = remember { MutableInteractionSource() }
        Scaffold(
            topBar = { MyTopBar() },
            bottomBar = { MyBottomBar() },
        ) {
            Column {
                BannerAbout()
            }
        }
    }
}