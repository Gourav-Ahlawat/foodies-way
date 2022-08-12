package com.example.page_number_01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Scroll_view_restaurant_near_by_location : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scroll_view_restaurant_near_by_location)

        // for button_01
        val button01: Button = findViewById(R.id.button_01)
        button01.setOnClickListener{
            val intent1 = Intent(this,Clicking_on_Button_01::class.java)
            startActivity(intent1)
        }

        // for button_02
        val button02: Button = findViewById(R.id.button_02)
        button02.setOnClickListener{
            val intent2 = Intent(this,Clicking_on_Button_02::class.java)
            startActivity(intent2)
        }

        // for button_03
        val button03: Button=findViewById(R.id.button_03)
        button03.setOnClickListener{
        val intent3=Intent(this,Clicking_on_Button_03::class.java)
            startActivity(intent3)}

        // for button_04
        val button04: Button = findViewById(R.id.button_04)
        button04.setOnClickListener{
            val intent4 = Intent(this,Clicking_on_Button_04::class.java)
            startActivity(intent4)
        }

        // for button_05
        val button05: Button = findViewById(R.id.button_05)
        button05.setOnClickListener{
            val intent5 = Intent(this,Clicking_on_Button_05::class.java)
            startActivity(intent5)
        }
        // for button_06
        val button06: Button = findViewById(R.id.button_06)
        button06.setOnClickListener{
            val intent6 = Intent(this,Clicking_on_Button_06::class.java)
            startActivity(intent6)
        }

        // for button_07
        val button07: Button = findViewById(R.id.button_07)
        button07.setOnClickListener{
            val intent7 = Intent(this,Clicking_on_Button_07::class.java)
            startActivity(intent7)
        }

        // for button_08
        val button08: Button = findViewById(R.id.button_08)
        button08.setOnClickListener{
            val intent8 = Intent(this,Clicking_on_Button_08::class.java)
            startActivity(intent8)
        }

        // for button_09
        val button09: Button = findViewById(R.id.button_09)
        button09.setOnClickListener{
            val intent9 = Intent(this,Clicking_on_Button_09::class.java)
            startActivity(intent9)
        }

        // for button_10
        val button10: Button = findViewById(R.id.button_10)
        button10.setOnClickListener{
            val intent10 = Intent(this,Clicking_on_Button_10::class.java)
            startActivity(intent10)
        }

        // for button_11
        val button11: Button = findViewById(R.id.button_11)
        button11.setOnClickListener{
            val intent11 = Intent(this,Clicking_on_Button_11::class.java)
            startActivity(intent11)
        }

        // for button_12
        val button12: Button = findViewById(R.id.button_12)
        button12.setOnClickListener{
            val intent12 = Intent(this,Clicking_on_Button_12::class.java)
            startActivity(intent12)
        }
    }
}