package com.example.contact

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ViewContactActivity : AppCompatActivity() {
//    lateinit var tvname:TextView
//    lateinit var tvemail:TextView
//    lateinit var tvphoneNumber: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_contact)
        var nameIntent=intent.getStringExtra("name")
        var emailIntent=intent.getStringExtra("email")
        var phoneIntent=intent.getStringExtra("phoneNumber")
//        picasso.get()load(imageIntent).into(imageperson)

        var name=findViewById<TextView>(R.id.tvname)
        var email=findViewById<TextView>(R.id.tvemail)
        var phone=findViewById<TextView>(R.id.tvphoneNumber)

        name.text=nameIntent
        email.text=emailIntent
        phone.text=phoneIntent


        }


    }
