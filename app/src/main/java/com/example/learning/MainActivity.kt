package com.example.learning

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val greetingsFromAndroid= findViewById<TextView>(R.id.tvtextview)
        val typeYour = findViewById<EditText>(R.id.tvname)
        val buttonAndroid = findViewById<Button>(R.id.buttonandroid)
        val offersBtn = findViewById<Button>(R.id.btnoffers)
        var enteredName= ""

        buttonAndroid.setOnClickListener(){
             enteredName = typeYour.text.toString()

            if (enteredName== "") {
                offersBtn.visibility =  INVISIBLE
                greetingsFromAndroid.text =""
                Toast.makeText(this@MainActivity,"Please enter your name",Toast.LENGTH_SHORT).show()

            }else{
                val message = "Your name is $enteredName"
                greetingsFromAndroid.text = message
                typeYour.text.clear()
                offersBtn.visibility = VISIBLE

            }

        }
        offersBtn.setOnClickListener(){
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("USER",enteredName)
            startActivity(intent)
        }



    }
}