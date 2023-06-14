package com.lduboscq.appkickstarter.screen

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import cafe.adriel.voyager.core.screen.Screen
import com.lduboscq.appkickstarter.main.Banner
import com.lduboscq.appkickstarter.main.BannerContact
import com.lduboscq.appkickstarter.ui.MyBottomBar
import com.lduboscq.appkickstarter.ui.MyTopBar
import org.jetbrains.compose.resources.ExperimentalResourceApi

internal class ContactScreen: Screen {
    @OptIn(ExperimentalResourceApi::class, ExperimentalMaterial3Api::class)
    @Composable
    override fun Content() {
        val interactionSource = remember { MutableInteractionSource() }
        Scaffold(
            topBar = { MyTopBar() },
            bottomBar = { MyBottomBar() },
        ) {
            BannerContact()
        }
    }
}