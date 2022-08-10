package com.example.page_number_01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Menu_after_clicking_button01_number_02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_after_clicking_button01_number02)

        val abc :ImageView=findViewById(R.id.forward_page_2)
        abc.setOnClickListener {
            val intent= Intent(this,Menu_after_clicking_button01_number_03::class.java)
            startActivity(intent)

        }

        val def :ImageView=findViewById(R.id.backward_page_2)
        def.setOnClickListener {
            val intent1= Intent(this,Menu_after_clicking_button_01::class.java)
            startActivity(intent1)

        }
    }
}