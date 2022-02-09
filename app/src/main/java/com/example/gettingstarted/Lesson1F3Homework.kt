package com.example.gettingstarted

import android.annotation.SuppressLint
import android.content.res.ColorStateList
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Lesson1F3Homework : AppCompatActivity() {
    @SuppressLint("NewApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lesson_1f3_homework)

        val btnToast = findViewById<Button>(R.id.toast_BT_L1F3HOM)
        val btnCount = findViewById<Button>(R.id.count_BT_L1F3HOM)
        val btnReset = findViewById<Button>(R.id.zero_BT_L1F3HOM)
        val showCount = findViewById<TextView>(R.id.show_count_TV_L1F3HOM)
        var tempCount = 1

        btnToast.setOnClickListener {
            Toast.makeText(this, "Berhasil dengan no ${showCount.text}", Toast.LENGTH_SHORT).show()
        }

        btnCount.setOnClickListener {
            showCount.text = (tempCount++).toString()
            btnReset.backgroundTintList =
                ColorStateList.valueOf(resources.getColor(R.color.purple_700, theme))
            btnCount.backgroundTintList =
                ColorStateList.valueOf(resources.getColor(R.color.teal_200, theme))
        }

        btnReset.setOnClickListener {
            tempCount = 1
            showCount.text = 0.toString()
            btnReset.backgroundTintList =
                ColorStateList.valueOf(resources.getColor(R.color.grey, theme))
            btnCount.backgroundTintList =
                ColorStateList.valueOf(resources.getColor(R.color.purple_500, theme))
        }
    }
}