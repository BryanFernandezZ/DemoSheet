package com.bfernandez.demobottomsheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bfernandez.demobottomsheet.databinding.ActivityMainBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var init = true
    private var currentState = BottomSheetBehavior.STATE_COLLAPSED

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUI()
    }

    private fun initUI() {
        initBottomSheet()
        initButtons()
    }

    private fun initBottomSheet() {
        changeSheetState(currentState)
    }

    private fun initButtons() {
        binding.btnToggle.setOnClickListener { toggleSheet() }
    }

    private fun changeSheetState(sheetState: Int) {
        BottomSheetBehavior.from(binding.sheetLayout).apply {
            if (init) {
                peekHeight = 0
                init = false
            }
            state = sheetState
        }
    }

    private fun toggleSheet() {
        currentState = if (currentState == BottomSheetBehavior.STATE_COLLAPSED)
            BottomSheetBehavior.STATE_EXPANDED
        else BottomSheetBehavior.STATE_COLLAPSED
        changeSheetState(currentState)
    }
}