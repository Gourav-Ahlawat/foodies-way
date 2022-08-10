package com.example.page_number_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class booking_details_revisited : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking_details_revisited)

        // for getting the name from user
       var name_response:TextView=findViewById(R.id.TV_for_name_response)
        val user_name = intent.getStringExtra("username")
        name_response.text=user_name

        // for getting the phone number from user
        val phone_number_response:TextView=findViewById(R.id.TV_for_phone_number_response)
        val user_phone_number=intent.getStringExtra("userphonenumber")
        phone_number_response.text=user_phone_number

        // for getting the number of seat from user
        val number_of_persons_response:TextView=findViewById(R.id.TV_for_number_of_seats_response)
        val number_of_persons=intent.getStringExtra("number_of_persons")
        number_of_persons_response.text=number_of_persons

        // for getting time
        val time_for_user_response:TextView=findViewById(R.id.TV_for_time_of_booking_response)
        val time=intent.getStringExtra("time")
        time_for_user_response.text=time

        // for getting date
        val date_for_user_response:TextView=findViewById(R.id.TV_for_date_of_booking_response)
        val date=intent.getStringExtra("date")
        date_for_user_response.text=date

    }

}