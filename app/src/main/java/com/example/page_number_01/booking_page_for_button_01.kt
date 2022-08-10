package com.example.page_number_01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class booking_page_for_button_01 : AppCompatActivity() {

    private lateinit var nameforuser : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking_page_for_button01)
        val confirm = findViewById<Button>(R.id.confirm_booking_button)
        confirm.setOnClickListener{



        nameforuser=findViewById(R.id.booker_name)
        val phone_number_for_user: EditText=findViewById(R.id.Booker_phone_number)
        val number_of_persons_for_user:EditText=findViewById(R.id.Persons_coming)
        val time_for_user: EditText=findViewById(R.id.time_of_booking)
        val date_for_user: EditText=findViewById(R.id.date_of_booking)



            val intent= Intent(this,booking_details_revisited::class.java)
                .putExtra("username",nameforuser.text.toString())
                .putExtra("userphonenumber",phone_number_for_user.text.toString())
                .putExtra("number_of_persons",number_of_persons_for_user.text.toString())
                .putExtra("time",time_for_user.text.toString())
                .putExtra("date",date_for_user.text.toString())

            startActivity(intent)
        }


        val cancel:Button=findViewById(R.id.cancel_booking)
        cancel.setOnClickListener {
            val intent1=Intent(this,Scroll_view_restaurant_near_by_location::class.java)
            startActivity(intent1)
        }




    }
}