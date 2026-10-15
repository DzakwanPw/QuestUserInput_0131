package com.example.pampertemuan5

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier

@Composable
fun FormDataDiri(modifier: Modifier){
    //variabel-variabel untuk mengingat nilai masukan dari keyboard
    var textNama by remember {mutableStateOf(value = "")}
}