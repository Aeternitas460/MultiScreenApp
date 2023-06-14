package com.lduboscq.appkickstarter.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.primarySurface
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopBar() {
    TopAppBar(title = {
        Text(
            text = "Your Kitchen",
            Modifier.fillMaxWidth().background(Color.Yellow),
            fontSize = 24.sp,
            textAlign = TextAlign.Center
        )
    },

        navigationIcon = {
            //Back icon button with an onClick listener
            IconButton(onClick = {/* Go back to previous page*/ }) {
                Icon(Icons.Filled.ArrowBack, "Back Icon")
            }
        }, actions = {
            //Back icon button with an onClick listener
            IconButton(onClick = {/* Share ingredients*/ }) {
                Icon(Icons.Filled.Share, "Share Icon")
            }
            //Back icon button with an onClick listener
            IconButton(onClick = {/* Open app settings page*/ }) {
                Icon(Icons.Filled.Settings, "Settings Icon")
            }
        })
}