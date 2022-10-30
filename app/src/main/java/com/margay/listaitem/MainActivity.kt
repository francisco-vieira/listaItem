package com.margay.listaitem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.margay.listaitem.model.Produto

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        supportActionBar!!.hide()// remover barra de ação

        val recycleViewItem = findViewById<RecyclerView>(R.id.list_item) //recupera item
        recycleViewItem.layoutManager = LinearLayoutManager(this) // define direção
        recycleViewItem.setHasFixedSize(true) // maior desempenho da na lista

//        configurar adapter

        val list: MutableList<Produto> = mutableListOf()
        val produtoAdapter = PrudutoAdapter(this, list)
        recycleViewItem.adapter = produtoAdapter

//        list produto
        val pr0 = Produto(
            R.drawable.item_1,
            "Produto Ciclano e mais um",
            "Produto Cilano é um produto top das galáxias que ajuda você ser alguém",
            "125.59")
        list.add(pr0)

        val pr1 = Produto(
            R.drawable.item_1,
            "Produto Mais você",
            "Produto que dispensa apresentação. Ele é você",
            "35.75")
        list.add(pr1)

        val pr2 = Produto(
            R.drawable.item_1,
            "Beltrano Bom demais",
            "A descrição produto te deixa com muita bondade",
            "25.59")
        list.add(pr2)

        val pr3 = Produto(
            R.drawable.item_1,
            "Produto de teste",
            "Esse produto é um produto de teste que precisa ser validado para poder ser implementado. UM produto que vai fazer dirença no sequencia de programação",
            "25.59")
        list.add(pr3)

        val pr4 = Produto(
            R.drawable.item_1,
            "Produto de teste",
            "Descrição de teste produto",
            "25.59")
        list.add(pr4)


    }
}