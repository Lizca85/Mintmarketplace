package com.example.mintmarketplace.View.ui.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mintmarketplace.R

class RecoveryActivity: AppCompatActivity() {

    lateinit var recoverybutton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_recovery)
        recoverybutton= findViewById(R.id.recovery)

        recoverybutton.setOnClickListener {
            startActivity(Intent(this,login::class.java))
        }
    }
}