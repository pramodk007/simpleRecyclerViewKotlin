package com.example.retrofitsongapi;

import android.content.Context;
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

import java.util.ArrayList;

class AnimalAdapter(val items : ArrayList<String>, val context: Context) :
    RecyclerView.Adapter<AnimalAdapter.MyViewHolder>() {

    class MyViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
       val txt_animal:TextView = itemView.findViewById(R.id.tv_animal_type)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(context).inflate(R.layout.animal_list_item, parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.txt_animal.text = items.get(position)
    }

    override fun getItemCount(): Int = items.size;
}


