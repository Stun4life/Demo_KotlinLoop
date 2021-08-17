package com.example.demokotlinloop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCount.setOnClickListener {
            for (i in 1..5){
                Log.d("MainActivity", "$i")
            }
            var a = 1;
            while (a < 6) {
                Log.d("MainActivity2", "$a")
                a++
            }
        }
        btnLetter.setOnClickListener {
            val word = etInput.text.toString()

            for (letter in word){
                Log.d("MainActivity3", "$letter")
            }
        }

    }
}