package com.lduboscq.appkickstarter.main

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.ExperimentalResourceApi

//Exercise 3.1
@Composable
@OptIn(ExperimentalResourceApi::class)
fun Banner1() {

    @Composable
    fun GreetingImage(modifier: Modifier = Modifier) {
//    val image = painterResource(R.drawable.android_image)
    }

//    Row (modifier=Modifier.padding(24.dp).fillMaxSize(),
//    verticalAlignment = Alignment.CenterVertically,
//    horizontalArrangement = Arrangement.Center) {
//        Column {
//            Text("Hello $name",
//            modifier = Modifier.border(BorderStroke(3.dp, Color.Red)))
//            Spacer(modifier = Modifier.height(20.dp).width(20.dp))
//            Text("Welcome to my App",
//            color=Color.Blue,
//            fontSize = FontStyle.Italic,
//            letterSpacing = TextUnit.Sp(30)
//            )
//            Row {
//                Text("How deep?")
//                Column {
//                    Text("So deep")
//                    Row {
//                        Text("Very deep")
//                    }
//                }
//                Column {
//                    Text("Oh so deep")
//                }
//            }
//        }
//        Spacer(modifier = Modifier.height(20.dp).width(20.dp))
//        Column {
//            Text("Main column 2")
//            Row {
//                Text("Secondary row 1")
//            }
//        }
//    }
}

//Exercise 3.2
@Composable
@OptIn(ExperimentalResourceApi::class)
fun Banner2() {
    Column (
        modifier= Modifier.padding(24.dp).fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
//        Image(
//            painterResource("ic_task_completed.png"), null
//        )
        Text ("All tasks completed", modifier= Modifier.padding(top=24.dp,bottom=8.dp))
        Text("Nice work!", fontSize = 16.sp, fontWeight = FontWeight.Bold)
    }
}

@Composable
fun App() {
    Banner2()

}

//    MaterialTheme {
//        fun greeting(name: String="Unknown", age:Int=10): String {
//            val message = "Hello $name, you are now $age old"
//            println (message)
//            return message
//        }
//        fun dance(danceMove: String="NoDance", openPosition:Boolean=true): String {
//            val danceDescription = "This dance is called $danceMove and $openPosition"
//            return danceDescription
//        }
//
//        fun sing(singName: String="NoSing", note:String="NoNote"): String {
//            val songDescription = "This song is $singName and it starts on a $note"
//            return songDescription
//        }
//
//        val option = 7
//        val result = when(option) {
//            1-> "Choice 1"
//            2-> "Choice 2"
//            3-> "Choice 3"
//            else-> "Invalid Choice"
//        }
//
//        fun rangeTest() {
//            for (x in 1..10) {
//                println("Range #$x")
//            }
//        }
//
//        fun repeatTest() {
//            repeat(5) {index ->
//                println("Repeat $index")
//            }
//        }
//
//        fun funcProgrammingOps() {
//            val list = listOf(1,2,3,4,5)
//            val selectedList = list.filter{it < 5}
//        }
//
//        var musicianText by remember { mutableStateOf("Find a musician!") }
//        var showImage by remember { mutableStateOf(false) }
//        var singerText by remember { mutableStateOf("Find a singer!")}
//
//        var testText by remember { mutableStateOf(sing("Fly Me to the Moon","A")) }
//        val lambdaTest = {name:String -> println(name)}
//
//        open class Musician(var name:String,var instrument:String,var experience:Int) {
//            fun play() {
//                println("Boop Boop da Doop")
//            }
//        }
//        class Singer(name:String,instrument:String,experience:Int,var language:String): Musician(name,instrument,experience) {
//            fun sing() {
//                println("La la la la la")
//            }
//        }
//
//        val jimmyPage = Musician("Jimmy Page", "Guitar",10)
//        val chuckBerry = Musician(name = "Chuck Berry","Guitar", 9)
//        val listOfMusicians = arrayOf(jimmyPage, chuckBerry)
//
//        val garettHotte = Singer("Garett Hotte", "Voice",3, "French")
//        val michaelJackson = Singer("Michael Jackson", "Voice", 10, "English")
//        val listOfSingers = arrayOf(garettHotte, michaelJackson)
//
//        val randomNumberMusician = Random.nextInt(0, listOfMusicians.size)
//        val randomNumberSinger = Random.nextInt(0, listOfSingers.size)
//
//        fun onClickMusician() {
//            val chosenMusician = listOfMusicians[randomNumberMusician]
//            println(chosenMusician.name)
//            println(chosenMusician.instrument)
//            println(chosenMusician.play())
//        }
//        fun onClickSinger() {
//            val chosenSinger = listOfSingers[randomNumberSinger]
//            println(chosenSinger.name)
//            println(chosenSinger.sing())
//        }
//
//        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
//            Button(onClick = { onClickMusician() }) {
//                Text(musicianText)
//            }
//            Button(onClick = { onClickSinger() }) {
//                Text(singerText)
//            }
//            AnimatedVisibility(showImage) {
//                Image(
//                    painterResource("compose-multiplatform.xml"),
//                    null
//                )
//            }
//        }
//    }