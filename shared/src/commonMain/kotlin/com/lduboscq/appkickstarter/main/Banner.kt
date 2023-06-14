package com.lduboscq.appkickstarter.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.lduboscq.appkickstarter.screen.AboutScreen
import com.lduboscq.appkickstarter.screen.AllScreens
import com.lduboscq.appkickstarter.ui.Image
import org.jetbrains.compose.resources.ExperimentalResourceApi

@Composable
@OptIn(ExperimentalResourceApi::class)
fun Banner(
) {
    val navigator = LocalNavigator.currentOrThrow
    Column {
        Row {
//            Image(painterResource("android_image.png"), null)
        }
        Row {
            Text("Jetpack Compose tutorial", fontSize = 24.sp, modifier = Modifier.padding(16.dp))
        }
        Row {
            Text(
                "Jetpack Compose is a modern toolkit for building native Android UI. " +
                        "Compose simplifies and accelerates UI development on Android with less code, " +
                        "powerful tools, and intuitive Kotlin APIs.",
                modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                textAlign = TextAlign.Justify
            )
        }
        Row {
            Text(
                "In this tutorial, you build a simple UI component with declarative functions. " +
                        "You call Compose functions to say what elements you want and the Compose " +
                        "compiler does the rest. Compose is built around Composable functions. These " +
                        "functions let you define your app\\'s UI programmatically because they let " +
                        "you describe how it should look and provide data dependencies, rather than " +
                        "focus on the process of the UI\\'s construction, such as initializing an " +
                        "element and then attaching it to a parent. To create a Composable function, " +
                        "you add the @Composable annotation to the function name.",
                modifier = Modifier.padding(16.dp), textAlign = TextAlign.Justify
            )
            Image(
                url="https://en.wikipedia.org/wiki/Cat#/media/File:Felis_catus-cat_on_snow.jpg",
                contentDescription="It's a cat!",
            )
        }
        Row {
        }
        Row {

        }
    }
}