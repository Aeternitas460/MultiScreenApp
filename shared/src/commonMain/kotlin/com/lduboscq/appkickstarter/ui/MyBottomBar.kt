package com.lduboscq.appkickstarter.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.lduboscq.appkickstarter.main.Route
import com.lduboscq.appkickstarter.main.screenRouter
import com.lduboscq.appkickstarter.screen.AboutScreen
import com.lduboscq.appkickstarter.screen.ContactScreen
import com.lduboscq.appkickstarter.screen.MainScreen

@Composable
fun MyBottomBar() {
    val navigator = LocalNavigator.currentOrThrow
    BottomAppBar {
        Button(
            onClick = { navigator.push(MainScreen()) },
            modifier = Modifier.padding(end = 8.dp)
        ) { Text("Home") }
        Button(
            onClick = { navigator.push(AboutScreen()) },
            modifier = Modifier.padding(horizontal = 8.dp)
        ) { Text("About Us") }
        Button(
            onClick = { navigator.push(ContactScreen()) },
            modifier = Modifier.padding(start = 8.dp)
        ) { Text("Contact Us") }
    }
}