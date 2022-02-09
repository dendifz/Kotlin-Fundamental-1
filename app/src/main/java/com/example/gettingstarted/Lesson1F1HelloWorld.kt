package com.example.gettingstarted

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class Lesson1F1HelloWorld : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lesson_1f1_helloworld)

        Log.d("MainActivity", "Hello World");
    }
}