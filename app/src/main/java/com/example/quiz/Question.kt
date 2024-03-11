package com.example.quiz

/*class Question {
}*/
import androidx.annotation.StringRes
data class Question (@StringRes val textRes: Int, val answer:Boolean)