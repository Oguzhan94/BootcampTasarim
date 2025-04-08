package com.example.bootcamptasarim.ui.screens.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun CustomTextField(placeholderText: String = "", onValueChange: (String) -> Unit) {
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        value = text,
        onValueChange = {
            text = it
            onValueChange(it)
        },
        placeholder = { Text(placeholderText) },
        modifier = Modifier
            .fillMaxWidth()
    )
}

@Composable
fun CustomButton(buttonName: String, onClick: (Boolean) -> Unit) {
    Button(
        onClick = {
            onClick(true)
        },
        modifier = Modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(5.dp)
    ) {
        Text(
            text = buttonName,
            style = TextStyle(Color.White),
        )
    }
}

@Composable
fun OtherLoginMethod(imagePath: Int) {
    Image(
        painter = painterResource(imagePath),
        contentDescription = "",
        modifier = Modifier
            .size(40.dp)
            .clip(CircleShape),
        contentScale = ContentScale.Fit
    )
}

@Composable
fun H1Title(text: String) {
    Text(
        fontSize = 35.sp,
        fontWeight = FontWeight.ExtraBold,
        text = text
    )
}

@Composable
fun H2Title(text: String) {
    Text(
        fontSize = 25.sp,
        fontWeight = FontWeight.SemiBold,
        text = text
    )
}

@Composable
fun Footer(text1: String, text2: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        Text(
            text = text1
        )
        Text(
            text = text2,
            style = TextStyle(Color.Blue),
            modifier = Modifier.padding(start = 5.dp),
        )
    }
}