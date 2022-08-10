package com.example.page_number_01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class conformational_message_for_button_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conformational_message_for_button1)

        val okay:Button = findViewById(R.id.redirect_to_home)
        okay.setOnClickListener {
            val intent = Intent(this,Scroll_view_restaurant_near_by_location::class.java)
            startActivity(intent)
        }
    }
}