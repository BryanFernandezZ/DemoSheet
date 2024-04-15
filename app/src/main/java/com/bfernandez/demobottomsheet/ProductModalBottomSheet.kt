package com.bfernandez.demobottomsheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bfernandez.demobottomsheet.databinding.ProductModalLayoutBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class ProductModalBottomSheet : BottomSheetDialogFragment() {

    //TODO: THIS FRAGMENT SHOULD QUERY ORDER INGREDIENTS TO ADD OR REMOVE
    private lateinit var binding: ProductModalLayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = ProductModalLayoutBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    companion object {
        const val TAG = "ProductModalBottomSheet"
    }
}