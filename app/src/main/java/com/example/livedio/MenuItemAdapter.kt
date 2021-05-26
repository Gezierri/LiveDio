package com.example.livedio

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MenuItemAdapter : RecyclerView.Adapter<MenuItemAdapter.MyViewHolder>() {

    private var menuLista = mutableListOf<MenuItemModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_row, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(menuLista[position])
    }

    override fun getItemCount(): Int = menuLista.size

    fun setItensList(list: List<MenuItemModel>) {
        menuLista.clear()
        menuLista.addAll(list)
    }

    class MyViewHolder(itemAdapter: View) : RecyclerView.ViewHolder(itemAdapter) {
        private val txtTitle by lazy {
            itemAdapter.findViewById<TextView>(R.id.text_view_title)
        }
        fun bind(menuItemModel: MenuItemModel) {
            txtTitle.text = menuItemModel.titulo
        }
    }
}


