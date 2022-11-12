package com.example.mintmarketplace.View.ui.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mintmarketplace.R


class login:AppCompatActivity() {
    //lateinit var binding: ActivityMainBinding
    lateinit var signuptext:TextView
    lateinit var loginbutton:Button
    lateinit var recoverytext:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // binding= ActivityMainBinding.inflate(layoutInflater)
       // setContentView(binding.root)
        setContentView(R.layout.activity_login)
        signuptext= findViewById(R.id.signup)
        loginbutton= findViewById(R.id.login)
        recoverytext= findViewById(R.id.recovery)

        signuptext.setOnClickListener {
            startActivity(Intent(this,SignupActivity::class.java))
        }
        recoverytext.setOnClickListener {
            startActivity(Intent(this,RecoveryActivity::class.java))
        }
        loginbutton.setOnClickListener {
            startActivity(Intent(this,HomeActivity::class.java))
        }
    }
}