package com.example.mintmarketplace.View.ui.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.mintmarketplace.R
import com.example.mintmarketplace.databinding.ActivityMainBinding

class login:AppCompatActivity() {
    //lateinit var binding: ActivityMainBinding
    lateinit var signupbutton:Button
    lateinit var loginbutton:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // binding= ActivityMainBinding.inflate(layoutInflater)
       // setContentView(binding.root)
        setContentView(R.layout.activity_login)
        signupbutton= findViewById(R.id.signup)
        loginbutton= findViewById(R.id.login)

        signupbutton.setOnClickListener {
            startActivity(Intent(this,SignupActivity::class.java))
        }
        loginbutton.setOnClickListener {
            startActivity(Intent(this,HomeActivity::class.java))
        }
    }
}