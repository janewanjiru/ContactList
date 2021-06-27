package com.example.contact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)
        var rvContacts=findViewById<RecyclerView>(R.id.rvContacts)

        var contactList= listOf(
            Contacts("Jane's Contact","Jane Kairu","0705895365","kairuwanjirujane@gmail.com","https://cutt.ly/xmeXLtp"),
            Contacts("Gracious' Contact","Gracious karuki","0785643222","karukigracious@gmail.com","https://cutt.ly/ameX8G1"),
            Contacts("Kelvin's Contact","Kelvin Kibito","01789567899","kelvinkibito@gmail.com","https://cutt.ly/CmeCwpX"),
            Contacts("Joy's Contact ","Joy Wanjiru","0705895365","wanjirujoy@gmail.com","https://cutt.ly/RmeCim2"),
            Contacts("Sarah Contact","karuki Sarah","0780983134","karukisarah@gmail.com","https://cutt.ly/vmeCapr"),
            Contacts("Hilston Contact","Hilston Kibito","0116547887","hilstonkibito@gmail.com","https://cutt.ly/UmeCdYi"),

        )
        var contactAdapter=ContactsAdapter(contactList,baseContext)
        rvContacts.layoutManager=LinearLayoutManager(baseContext)
        rvContacts.adapter=contactAdapter
    }
    }
