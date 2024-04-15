package com.bfernandez.demobottomsheet.adapter

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.bfernandez.demobottomsheet.Product
import com.bfernandez.demobottomsheet.databinding.ItemProductBinding

class ProductsViewHolder(val binding: ItemProductBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun render(context: Context, product: Product) {
        binding.txvProductName.text = product.description
        binding.txvProductDescription.text = product.price.toString()
    }
}