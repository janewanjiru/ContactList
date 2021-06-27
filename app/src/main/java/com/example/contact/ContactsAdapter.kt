package com.example.contact

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ContactsAdapter(var contacts:List<Contacts>,var context: Context):RecyclerView.Adapter<ContactViewHolder>() {
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
        Picasso
            .get()
            .load(currentContacts.imageUrl)
            .placeholder(R.drawable.image1)
            .into(holder.imgContact)

        holder.cvContact.setOnClickListener{
            var intent=Intent(context,ViewContactActivity::class.java)

            intent.putExtra("name",currentContacts.personName)
            intent.putExtra("Email",currentContacts.personEmail)
            intent.putExtra("phoneNumber",currentContacts.personPhoneNumber)
            intent.putExtra("image",currentContacts.imageUrl)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)
        }

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
    var imgContact=itemView.findViewById<ImageView>(R.id.imgContacts)
    var cvContact=itemView.findViewById<CardView>(R.id.cvContacts)
}