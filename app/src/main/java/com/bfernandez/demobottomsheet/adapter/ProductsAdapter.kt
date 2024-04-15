package com.bfernandez.demobottomsheet.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bfernandez.demobottomsheet.Product
import com.bfernandez.demobottomsheet.databinding.ItemProductBinding

class ProductsAdapter(
    private val context: Context,
    private val productList: List<Product>,
) : RecyclerView.Adapter<ProductsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemProductBinding.inflate(inflater, parent, false)
        return ProductsViewHolder(binding)
    }

    override fun getItemCount(): Int = productList.size

    override fun onBindViewHolder(holder: ProductsViewHolder, position: Int) {
        holder.render(context, productList[position])
    }
}