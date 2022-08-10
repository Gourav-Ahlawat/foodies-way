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
import androidx.core.content.ContextCompat.startActivity
import com.example.page_number_01.databinding.ActivityUserLogInPageBinding
import com.google.firebase.auth.FirebaseAuth

class UserLogInPage : AppCompatActivity() {

    private lateinit var binding: ActivityUserLogInPageBinding
    private lateinit var actionBar: ActionBar
    private lateinit var progressDailog: ProgressDialog
    private lateinit var firebaseAuth: FirebaseAuth
    private var email=""
    private var password=""



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityUserLogInPageBinding.inflate(layoutInflater)

        setContentView(binding.root)

//        binding = ActivityUserLogInPageBinding.inflate(layoutInflater)


        actionBar= supportActionBar!!
        actionBar.title="SIGN IN"

        progressDailog= ProgressDialog(this)
        progressDailog.setTitle("Please Wait")
        progressDailog.setMessage("Signing In...")
        progressDailog.setCanceledOnTouchOutside(false)

// to do something
        firebaseAuth=FirebaseAuth.getInstance()
       // checkUser()

        binding.signInButton.setOnClickListener{
            startActivity(Intent(this,UserSignInPage::class.java))
        }


        binding.signInButton.setOnClickListener {
            validateData()

        }









        val textview: TextView = findViewById(R.id._text_view_sign_up)
        textview.setOnClickListener{
            val intent = Intent(this,UserSignInPage::class.java)
            startActivity(intent)
        }

//        val button: Button = findViewById(R.id.sign_in_button)
//        button.setOnClickListener{
//            val intent1 = Intent(this,Scroll_view_restaurant_near_by_location::class.java)
//            startActivity(intent1)
//        }




    }

    private fun validateData() {
        //email=binding.email
        email = binding.UserLoginViewEditText.text.toString().trim()
        password =binding.etPassword.text.toString().trim()

        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches())
        {
            binding.UserLoginViewEditText.error = "Invalid User name"

        }

        else if(TextUtils.isEmpty(password))
        {
            binding.etPassword.error="Please enter password"
        }
        else{
            firebaseLogin()
        }

    }
//    private fun getRoot(){
//
//    }
    private fun firebaseLogin() {
        progressDailog.show()
        firebaseAuth.signInWithEmailAndPassword(email , password).addOnSuccessListener {
            progressDailog.dismiss()
            val firebaseUser= firebaseAuth.currentUser
            val email = firebaseUser!!.email
            Toast.makeText(this,"LoggedIn as $email",Toast.LENGTH_SHORT).show()


            startActivity(Intent(this,Scroll_view_restaurant_near_by_location::class.java))
            finish()


        }.addOnFailureListener{e->
            progressDailog.dismiss()
            Toast.makeText(this,"Login failed due to ${e.message}",Toast.LENGTH_SHORT).show()
        }

    }

    private fun checkUser() {
        val firebaseUser= firebaseAuth.currentUser
        if(firebaseUser!=null) startActivity(Intent(this,PageNumber02::class.java))
        finish()
    }
}