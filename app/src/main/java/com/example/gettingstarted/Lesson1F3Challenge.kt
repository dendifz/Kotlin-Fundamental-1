package com.example.gettingstarted

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Lesson1F3Challenge : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lesson_1f3_challenge)

        val btnToast = findViewById<Button>(R.id.toast_BT_L1F3CHA)
        val btnCount = findViewById<Button>(R.id.count_BT_L1F3CHA)
        val txtCount = findViewById<TextView>(R.id.show_count_TV_L1F3CHA)
        var tempCount = 1

        btnToast.setOnClickListener {
            Toast.makeText(this, "Berhasil dengan no ${txtCount.text}", Toast.LENGTH_SHORT).show()
        }

        btnCount.setOnClickListener{
            txtCount.text = (tempCount++).toString()
        }
    }
}