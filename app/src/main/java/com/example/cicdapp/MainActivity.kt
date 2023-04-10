package com.example.cicdapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton = findViewById<Button>(R.id.myButton)
        myButton.setOnClickListener {
            val resultTextView = findViewById<TextView>(R.id.resultTextView)
            resultTextView.text = getString(R.string.txtTest)
        }
    }
}