package com.example.page_number_01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Review_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review_page)

        val subm:Button = findViewById(R.id.button2)
        subm.setOnClickListener {
            Toast.makeText(this, "Thanks for your review", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this,Scroll_view_restaurant_near_by_location::class.java))
        }

    }
}