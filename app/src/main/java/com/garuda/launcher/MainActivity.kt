package com.garuda.launcher

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val text = TextView(this)
        text.text = "Welcome to GarudaX Launcher 🚀"
        text.textSize = 24f

        setContentView(text)
    }
}
