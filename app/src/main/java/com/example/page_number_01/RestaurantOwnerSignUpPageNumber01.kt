package com.example.page_number_01

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import com.example.page_number_01.databinding.ActivityRestaurantOwnerSignUpPageNumber01Binding
import com.example.page_number_01.databinding.ActivityUserLogInPageBinding
import com.google.firebase.auth.FirebaseAuth

class RestaurantOwnerSignUpPageNumber01 : AppCompatActivity() {

    // for binding
    private lateinit var binding: ActivityRestaurantOwnerSignUpPageNumber01Binding

    // actionBar
    private lateinit var actionBar: ActionBar

    // for progressDialog
    private lateinit var progressDialog: ProgressDialog

    // for firebase Auth
    private lateinit var firebaseAuth: FirebaseAuth
    private var email=""
    private var password=""





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityRestaurantOwnerSignUpPageNumber01Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configure action bar, enable back button
        actionBar= supportActionBar!!
        actionBar.title="SIGN IN"

        // configure Progress Dialog
        progressDialog= ProgressDialog(this)
        progressDialog.setTitle("Please Wait")
        progressDialog.setMessage("Signing In...")
        progressDialog.setCanceledOnTouchOutside(false)

        // init firebaseAuth
        firebaseAuth=FirebaseAuth.getInstance()
        // checkUser()

        // handle click begin sign up
        binding.ButtonForSignUp.setOnClickListener {
            // validate data
            validataData()
        }




//        val nextbutton: Button =findViewById(R.id.Button_for_next)
//        nextbutton.setOnClickListener{
//            val intent = Intent(this,RestaurantOwnerSignUpPageNumber02::class.java)
//            startActivity(intent)
//        }

    }

    private fun validataData() {
         // get data
        email=binding.EditViewForEmail.text.toString().trim()
        password=binding.EditViewForPassword.text.toString().trim()

        // validate data
        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches())
        {   // invalid email format
            binding.EditViewForEmail.error="Invalid email format"
        }

        else if(TextUtils.isEmpty(password))
        {  // password is not entered
            binding.EditViewForPassword.error="Please enter the Password"

        }
        else if (password.length<6)
        {
            // password length is less than 6
            binding.EditViewForPassword.error="Password must have at least 6 characters long"
        }
        else {
            // data is valid, continue signing up
            firebaseSignUp()
        }
    }

    private fun firebaseSignUp() {


        // for progress Dialog
        progressDialog.show()

        // create account
        firebaseAuth.createUserWithEmailAndPassword(email,password)

            .addOnSuccessListener {
                // sign up successful
                progressDialog.dismiss()

                // get current user
            val firebaseUser = firebaseAuth.currentUser
            val email= firebaseUser!!.email

            Toast.makeText(this,"Account Created for $email", Toast.LENGTH_SHORT).show()

             // going back to login page
            startActivity(Intent(this,RestaurantOwnerLoginPage::class.java))
            finish()
            }



            .addOnFailureListener { e->
                // sign up failure
                progressDialog.dismiss()
                Toast.makeText(this,"SignUp Failed due to ${e.message}", Toast.LENGTH_SHORT).show()

            }

    }
}