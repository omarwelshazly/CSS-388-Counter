package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.TextView

import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var clickCount = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val add_one_button = findViewById(R.id.add_one_button) as Button

        val counter_view = findViewById(R.id.counter_view) as TextView


        add_one_button.setOnClickListener {
           //Toast.makeText(this@MainActivity, variableName, Toast.LENGTH_SHORT).show()
            clickCount++
            counter_view.setText(clickCount.toString() );
        }
    }
}