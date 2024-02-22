package com.example.learning

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val userName = intent.getStringExtra("USER")
        val textView = findViewById<TextView>(R.id.tvOffer)
        val message = "$userName, You will get free access to all content for one month"

        textView.text = message



    }
}