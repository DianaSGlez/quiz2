package com.example.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var btntrue : Button
    private lateinit var btnfalse : Button
    private lateinit var btnnext : Button

    private  val questionBank = listOf(
        Question(R.string.question_1, true),
        Question(R.string.question_2, false),
        Question(R.string.question_3, true))

    private var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btntrue = findViewById(R.id.btn_true)
        btnfalse = findViewById(R.id.btn_false)
        btnnext = findViewById(R.id.btn_next)

        btntrue.setOnClickListener { view: View ->
            Toast.makeText(
                this,
                "Respuesta Correcta",
                Toast.LENGTH_SHORT).show()
        }
        btnfalse.setOnClickListener { view: View ->
            Toast.makeText(
                this,
                "Respuesta Incorrecta!",
                Toast.LENGTH_SHORT).show()
        }
    }
}