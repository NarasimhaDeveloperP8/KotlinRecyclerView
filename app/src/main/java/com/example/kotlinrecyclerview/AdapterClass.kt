package com.example.kotlinrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterClass (val userList: ArrayList<UserModel>) :
    RecyclerView.Adapter<AdapterClass.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.item_layout,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val  user:UserModel = userList[position]
        holder?.title?.text = user.name
        holder?.description?.text = user.Description
    }

    override fun getItemCount(): Int {
      return userList.size
    }
    class ViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {

        val  title = itemView.findViewById<TextView>(R.id.title_id)
        val  description = itemView.findViewById<TextView>(R.id.description_id)
    }
}