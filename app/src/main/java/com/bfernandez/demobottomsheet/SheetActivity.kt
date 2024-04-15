package com.bfernandez.demobottomsheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.recyclerview.widget.GridLayoutManager
import com.bfernandez.demobottomsheet.adapter.ProductItemDecorator
import com.bfernandez.demobottomsheet.adapter.ProductsAdapter
import com.bfernandez.demobottomsheet.databinding.ActivityMainBinding
import com.bfernandez.demobottomsheet.databinding.ActivitySheetBinding

class SheetActivity : AppCompatActivity() {

    companion object {
        val products: List<Product> = DataProvider.DATA_LIST
    }

    private lateinit var binding: ActivitySheetBinding
    private lateinit var productsAdapter: ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySheetBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUI()
    }

    private fun initUI() {
        initBottomSheet()
        initProducts()
    }

    private fun initBottomSheet() {
        val modalBottomSheet = ProductModalBottomSheet()
        modalBottomSheet.show(supportFragmentManager, ProductModalBottomSheet.TAG)
    }

    private fun initProducts() {
//        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,
//            products.map { it.description }
//        )
//        binding.productsDropdownItems.setAdapter(adapter)
        //  TODO: RECYCLER VIEW
        binding.productsRecycler.addItemDecoration(ProductItemDecorator(2, 50, false))

        productsAdapter = ProductsAdapter(this, products)
        binding.productsRecycler.layoutManager = GridLayoutManager(this, 2)
        binding.productsRecycler.adapter = productsAdapter
    }
}