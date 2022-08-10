package com.example.page_number_01

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.ActionBar
import com.example.page_number_01.databinding.ActivityUserLogInPageBinding
import com.google.firebase.auth.FirebaseAuth
import java.time.OffsetDateTime

class MainActivity : AppCompatActivity() {





    private lateinit var image: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


     setContentView(R.layout.activity_main)





      image = findViewById(R.id.image_view)
        image.alpha = 0f
        image.animate().setDuration(5000).alpha(1f).withEndAction{
            val intent = Intent(this,PageNumber02::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
        }



    }


}

