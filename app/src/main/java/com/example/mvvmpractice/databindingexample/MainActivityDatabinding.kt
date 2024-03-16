package com.example.mvvmpractice.databindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.mvvmpractice.R
import com.example.mvvmpractice.databinding.ActivityMainDatabindingBinding

class MainActivityDatabinding : AppCompatActivity() {
    lateinit var binding: ActivityMainDatabindingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main_databinding)
        val quoteObj = Quote("Do, or do not. There is no try.","Yoda")
        binding.quote = quoteObj
        
    }
}