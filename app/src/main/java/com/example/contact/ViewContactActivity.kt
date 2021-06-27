package com.example.contact

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ViewContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_contact)
        var nameIntent=intent.getStringExtra("personName")
        var emailIntent=intent.getStringExtra("personEmail")
        var phoneIntent=intent.getStringExtra("personPhoneNumber")

        var name=findViewById<TextView>(R.id.tvname)
        var email=findViewById<TextView>(R.id.tvemail)
        var phone=findViewById<TextView>(R.id.tvphoneNumber)

        name.text=nameIntent
        email.text=emailIntent
        phone.text=phoneIntent


        }


    }
