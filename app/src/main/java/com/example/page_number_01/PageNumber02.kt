package com.example.page_number_01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.inflate
import android.widget.Button
import androidx.appcompat.resources.Compatibility.Api21Impl.inflate
import androidx.core.content.res.ColorStateListInflaterCompat.inflate
import androidx.core.graphics.drawable.DrawableCompat.inflate

class PageNumber02 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_number02)

//        binding = PageNumber02.inflate(layoutInflater)
//        setContentView(binding.root)

    val userloginbutton: Button = findViewById(R.id.Login_as_user_button)
        userloginbutton.setOnClickListener {
            val intent = Intent(this,UserLogInPage::class.java)
            startActivity(intent)
        }

    val restaurantOwnerLoginPagebutton: Button = findViewById(R.id.Login_as_restraunt_owner_button)
        restaurantOwnerLoginPagebutton.setOnClickListener{
            val intent1= Intent(this,RestaurantOwnerLoginPage :: class.java)
            startActivity(intent1)
        }

    }
}