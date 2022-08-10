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
import androidx.core.content.ContextCompat.startActivity
import com.example.page_number_01.databinding.ActivityUserSignInPageBinding
import com.google.firebase.auth.FirebaseAuth

class UserSignInPage : AppCompatActivity() {

    private lateinit var binding: ActivityUserSignInPageBinding
    private lateinit var actionBar: ActionBar
    private lateinit var progressDailog:ProgressDialog
    private lateinit var firebaseAuth: FirebaseAuth
    private var email=""
    private var password=""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding=ActivityUserSignInPageBinding.inflate(layoutInflater)
        setContentView(binding.root)


//       binding=ActivityUserSignInPageBinding.inflate(layoutInflater)


        actionBar=supportActionBar!!
        actionBar.title="Sign Up"
        actionBar.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayShowHomeEnabled(true)




        progressDailog= ProgressDialog(this)
        progressDailog.setTitle("Please Wait")
        progressDailog.setMessage("Signing In...")
        progressDailog.setCanceledOnTouchOutside(false)



        firebaseAuth=FirebaseAuth.getInstance()

        binding.ButtonForSignUp.setOnClickListener {
            validateData()
        }




//        val button: Button = findViewById(R.id.Button_for_sign_up)
//        button.setOnClickListener{
//            val intent1 = Intent(this,UserLogInPage::class.java)
//            startActivity(intent1)
//        }

    }



    private fun validateData() {

        email=binding.EditViewForEmail.text.toString().trim()
        password=binding.EditViewForPassword.text.toString().trim()


        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches())
        {
            binding.EditViewForEmail.error="Invalid email format"
        }

        else if(TextUtils.isEmpty(password))
        {
            binding.EditViewForPassword.error="Please enter the Password"

        }
        else {
            firebaseSignUp()
        }




    }

    private fun firebaseSignUp() {
        progressDailog.show()

        firebaseAuth.createUserWithEmailAndPassword(email,password).addOnSuccessListener {
            val firebaseUser = firebaseAuth.currentUser
            val email= firebaseUser!!.email

            Toast.makeText(this,"Account Created for $email",Toast.LENGTH_SHORT).show()

            startActivity(Intent(this,UserLogInPage::class.java))
            finish()

        }
            .addOnFailureListener { e->
                progressDailog.dismiss()
                Toast.makeText(this,"SignUp Failed due to ${e.message}",Toast.LENGTH_SHORT).show()

            }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}