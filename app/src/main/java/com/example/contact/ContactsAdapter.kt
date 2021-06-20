package com.example.contact

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactsAdapter(var contacts:List<Contacts>):RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.contact_list_item,parent,false)
        return ContactViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContacts=contacts.get(position)
        holder.tvName.text=currentContacts.personName
        holder.tvPhoneNumber.text=currentContacts.personPhoneNumber
        holder.tvEmail.text=currentContacts.personEmail
        holder.tvcontact.text=currentContacts.myContactList
    }

    override fun getItemCount(): Int {
        return contacts.size
    }

}
class  ContactViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvPhoneNumber=itemView.findViewById<TextView>(R.id.tvName)
    var tvEmail=itemView.findViewById<TextView>(R.id.tvName)
    var tvcontact=itemView.findViewById<TextView>(R.id.tvContact)
}