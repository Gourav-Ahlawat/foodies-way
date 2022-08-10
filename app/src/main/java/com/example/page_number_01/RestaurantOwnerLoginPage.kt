package com.example.page_number_01

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import com.example.page_number_01.databinding.ActivityRestaurantOwnerLoginPageBinding
import com.google.firebase.auth.FirebaseAuth

class RestaurantOwnerLoginPage : AppCompatActivity() {

    // view_binding
    private lateinit var binding:ActivityRestaurantOwnerLoginPageBinding

    // Action Bar
    private lateinit var actionBar: ActionBar

    // Progress Dialog
    private lateinit var progressDialog: ProgressDialog
    // Firebase Auth
    private lateinit var firebaseAuth: FirebaseAuth

    private var email=""
    private var password=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRestaurantOwnerLoginPageBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // configure actionBar
        actionBar=supportActionBar!!
        actionBar.title="Login"

        // configure progress Dialog
        progressDialog = ProgressDialog(this)
        progressDialog.setTitle("Please wait")
        progressDialog.setMessage("Signing In...")
        progressDialog.setCanceledOnTouchOutside(false)

        // init firebase Auth
        firebaseAuth= FirebaseAuth.getInstance()
       // checkUser()

        // handle click, begin login
        binding.signInButton.setOnClickListener {
            // before logging in, validate data
            validateData()

        }

        // handle click, open register activity
        binding.textViewSignUpForOwner.setOnClickListener{
            startActivity(Intent(this,RestaurantOwnerSignUpPageNumber01::class.java))
        }

//        val button: TextView = findViewById(R.id._text_view_sign_up)
//        button.setOnClickListener{
//            val intent= Intent(this,RestaurantOwnerSignUpPageNumber01::class.java)
//            startActivity(intent)
//        }
    }

    private fun validateData() {
        // get data
        email=binding.UserLoginViewEditText.text.toString().trim()
        password=binding.etPassword.text.toString().trim()

        // validate data
        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {    // invalid email format
            binding.UserLoginViewEditText.error = "Invalid User name"
        }

        else if(TextUtils.isEmpty(password))
        {   // no password entered
            binding.etPassword.error="Please enter password"
        }
        else{
            // valid credentials, begin login
            firebaseLogin()
        }

    }

    private fun firebaseLogin() {
        // show progress
        progressDialog.show()
        firebaseAuth.signInWithEmailAndPassword(email , password)

            .addOnSuccessListener {
                // login successful
            progressDialog.dismiss()

                // get User information
            val firebaseUser= firebaseAuth.currentUser
            val email = firebaseUser!!.email
            Toast.makeText(this,"LoggedIn as $email", Toast.LENGTH_SHORT).show()

               // to move on next page
            startActivity(Intent(this,Just_for_fun::class.java))
            finish()
            }

            .addOnFailureListener{e->
                // login failed
            progressDialog.dismiss()
            Toast.makeText(this,"Login failed due to ${e.message}", Toast.LENGTH_SHORT).show()
        }
    }

    private fun checkUser() {
        // if user is already logged in then go to profile page
        // get current user
        val firebaseUser = firebaseAuth.currentUser

        if(firebaseUser!=null)
            // user is already logged in
            startActivity(Intent(this,Just_for_fun::class.java))

        finish()

    }
}