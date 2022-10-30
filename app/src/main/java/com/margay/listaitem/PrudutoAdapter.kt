package com.margay.listaitem

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.margay.listaitem.model.Produto

class PrudutoAdapter(private val context: Context, private val list: MutableList<Produto>) :
    RecyclerView.Adapter<PrudutoAdapter.ProdutoViewHolder>() {


    //    cria visualização da lista
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {
        val itemList = LayoutInflater.from(context).inflate(R.layout.lista_item, parent, false)
        return ProdutoViewHolder(itemList)
    }

    //    exibe lista
    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {
        holder.image.setImageResource(list[position].image)
        holder.nomeProduto.text = list[position].nomeProduto
        holder.descricao.text = list[position].description
        holder.preco.text = list[position].precoProduto
    }

    override fun getItemCount(): Int {
       return list.size
    }

    //classe interna
    inner class ProdutoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.imageId)
        val nomeProduto: TextView = itemView.findViewById(R.id.nomeProduto)
        val descricao: TextView = itemView.findViewById(R.id.description)
        val preco: TextView = itemView.findViewById(R.id.preco)
    }
}