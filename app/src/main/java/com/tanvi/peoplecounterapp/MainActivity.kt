package com.tanvi.peoplecounterapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var c=0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnClickMe = findViewById<Button>(R.id.mybutton)
        val tvMyTextView = findViewById<TextView>(R.id.textView2)
        var counter = findViewById<TextView>(R.id.textView)
        btnClickMe.setOnClickListener {
            c++;
            btnClickMe.text = "i am developer!"
            tvMyTextView.text = "yes you are"
            counter.text = "$c"

        }

    }
}