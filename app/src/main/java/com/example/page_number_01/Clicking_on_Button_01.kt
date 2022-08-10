package com.example.page_number_01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Clicking_on_Button_01 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clicking_on_button01)

        val imageButton:ImageButton = findViewById(R.id.menu_image_button)
        imageButton.setOnClickListener{
            val intent=Intent(this,Menu_after_clicking_button_01::class.java)
            startActivity(intent)
        }

        val button: Button =findViewById(R.id.book_now_button)
        button.setOnClickListener {
            val intent1= Intent(this,booking_page_for_button_01::class.java)
            startActivity(intent1)
        }
    }
}