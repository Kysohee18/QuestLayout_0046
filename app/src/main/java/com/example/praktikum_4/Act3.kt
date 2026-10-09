package com.example.praktikum_4

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ActivitasPertama(modifier: Modifier) {
    Column(
        modifier = Modifier.padding(top = 100.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            StringResource("Teknologi Informasi"),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            stringResource("Universitas Muhammadiyah Yogyakarta"),
            fontSize = 22.sp,
        )


    }
}

@Composable
fun StringResource(x0: String) {
    TODO("Not yet implemented")
}