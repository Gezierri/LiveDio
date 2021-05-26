package com.example.livedio

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvList: RecyclerView
    private var adapter = MenuItemAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setItemsLista()
        iniciaView()
    }

    private fun iniciaView(){
        rvList = findViewById(R.id.recycler_view)
        rvList.adapter = adapter
        rvList.layoutManager = GridLayoutManager(this, 2)
    }

    private fun setItemsLista() {
        adapter.setItensList(
            arrayListOf(
                MenuItemModel(
                    "cartões"
                ),
                MenuItemModel(
                    "meus comprovantes"
                ),
                MenuItemModel(
                    "investimentos"
                ),
                MenuItemModel(
                    "portabilidade de salário"
                ),
                MenuItemModel(
                    "cartões"
                ),
                MenuItemModel(
                    "meus comprovantes"
                ),
                MenuItemModel(
                    "investimentos"
                ),
                MenuItemModel(
                    "portabilidade de salário"
                ),
                MenuItemModel(
                    "cartões"
                ),
                MenuItemModel(
                    "meus comprovantes"
                ),
                MenuItemModel(
                    "investimentos"
                ),
            )
        )
    }

}