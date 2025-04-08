package com.example.bootcamptasarim.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bootcamptasarim.R
import com.example.bootcamptasarim.ui.screens.widgets.CustomButton
import com.example.bootcamptasarim.ui.screens.widgets.CustomTextField
import com.example.bootcamptasarim.ui.screens.widgets.Footer
import com.example.bootcamptasarim.ui.screens.widgets.H1Title
import com.example.bootcamptasarim.ui.screens.widgets.H2Title
import com.example.bootcamptasarim.ui.screens.widgets.OtherLoginMethod

@Composable
fun LoginPage(
    onNavigateToMain: (String) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(start = 25.dp, end = 25.dp),
    ) {
        LoginContent { name ->
            onNavigateToMain(name)
        }
    }
}

@Composable
fun LoginContent(onNavigateToMain: (String) -> Unit) {

    val buttonState = remember { mutableStateOf(false) }

    var textValue1 by remember { mutableStateOf("") }
    var textValue2 by remember { mutableStateOf("") }

    val name = textValue1
    if (buttonState.value) {
        onNavigateToMain(name)
        buttonState.value = false
        println("email: $textValue1")
        println("pw: $textValue2")
    }

    Spacer(Modifier.height(50.dp))

    H1Title("Lets Sign you in")

    Spacer(Modifier.height(20.dp))

    H2Title("Welcome Back ,")

    H2Title("You have been missed")

    Spacer(Modifier.height(45.dp))

    CustomTextField("Email ,phone & username") {
        textValue1 = it
    }

    Spacer(Modifier.height(10.dp))

    CustomTextField("Password") {
        textValue2 = it
    }

    Spacer(Modifier.height(15.dp))

    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.TopEnd
    ) {
        Text(
            fontSize = 15.sp,
            fontWeight = FontWeight.Medium,
            text = "Forgot Password ?"
        )
    }

    Spacer(Modifier.height(25.dp))

    CustomButton("Sign in") { state ->
        buttonState.value = state
    }

    Spacer(Modifier.height(25.dp))

    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        HorizontalDivider(
            modifier = Modifier
                .weight(0.5f)
        )

        Text(
            fontSize = 15.sp,
            fontWeight = FontWeight.Medium,
            text = "or",
            modifier = Modifier.padding(horizontal = 5.dp)
        )
        HorizontalDivider(
            modifier = Modifier
                .weight(0.5f)
        )
    }

    Spacer(Modifier.height(25.dp))

    Box(
        modifier = Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier
                .width(140.dp),
            horizontalArrangement = Arrangement.SpaceAround

        ) {
            OtherLoginMethod(R.drawable.google)
            OtherLoginMethod(R.drawable.facebook)
            OtherLoginMethod(R.drawable.apple)
        }
    }

    Spacer(Modifier.height(25.dp))

    Footer(text1 = "Don't have an account ?", text2 = "Register now")

}
