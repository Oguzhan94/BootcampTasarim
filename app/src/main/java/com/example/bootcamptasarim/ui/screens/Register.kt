package com.example.bootcamptasarim.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.bootcamptasarim.ui.screens.widgets.CustomButton
import com.example.bootcamptasarim.ui.screens.widgets.CustomTextField
import com.example.bootcamptasarim.ui.screens.widgets.Footer
import com.example.bootcamptasarim.ui.screens.widgets.H1Title
import com.example.bootcamptasarim.ui.screens.widgets.H2Title

@Composable
fun RegisterPage(
    onButtonClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(start = 25.dp, end = 25.dp),
    ) {
        RegisterContent {
            onButtonClick()
        }
    }
}

@Composable
fun RegisterContent(onButtonClick: () -> Unit) {

    var textValue1 by remember { mutableStateOf("") }
    var buttonState by remember { mutableStateOf(false) }

    Spacer(Modifier.height(50.dp))

    H1Title("Lets Register")

    Spacer(Modifier.height(5.dp))

    H1Title("Account")
    Spacer(Modifier.height(20.dp))

    H2Title("Hello user ,you have")
    H2Title("a grateful journey")

    Spacer(Modifier.height(20.dp))

    CustomTextField("Name") {
        textValue1 = it
    }

    Spacer(Modifier.height(10.dp))

    CustomTextField("Business Name") {
        textValue1 = it
    }

    Spacer(Modifier.height(10.dp))

    CustomTextField("Phone") {
        textValue1 = it
    }

    Spacer(Modifier.height(10.dp))

    CustomTextField("Email") {
        textValue1 = it
    }

    Spacer(Modifier.height(10.dp))

    CustomTextField("Password") {
        textValue1 = it
    }

    Spacer(Modifier.height(10.dp))

    CustomButton("Sign Up") {
        buttonState = it
        onButtonClick()
    }

    Spacer(Modifier.height(20.dp))

    Footer(text1 = "Already have an account ?", text2 = "Login")
}
