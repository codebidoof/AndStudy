package com.example.phillipvm

import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Color
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel


class ContactsViewModel(
    val helloWorld: String
): ViewModel() {
    //ViewModel은 Compose 함수가 아니니까 remember 필요 없음
    var backgroundColor by mutableStateOf(Color.White)
    private set //외부에서 읽을 순 있지만 값을 바꿀 순 없도록

    fun changeBackgroundColor() { //이 메서드 호출을 통해서만 값을 바꿀 수 있도록 한다.
        backgroundColor = Color.Red
    }
}