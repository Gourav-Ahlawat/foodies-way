package com.example.page_number_01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class final_msg_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final_msg_screen)

        val gob:Button = findViewById(R.id.go_back)
        gob.setOnClickListener {
            startActivity(Intent(this,Scroll_view_restaurant_near_by_location::class.java))
        }
    }
}