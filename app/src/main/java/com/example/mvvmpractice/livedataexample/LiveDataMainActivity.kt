package com.example.mvvmpractice.livedataexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmpractice.R
import com.example.mvvmpractice.databinding.ActivityLiveDataMainBinding
import com.example.mvvmpractice.databinding.ActivityMainDatabindingBinding

class LiveDataMainActivity : AppCompatActivity() {
    lateinit var binding: ActivityLiveDataMainBinding
    lateinit var mainViewModel: MainViewModel
//    private val factsTextview : TextView
//        get() = findViewById(R.id.factsTextView)
//
//    private val btnUpdate: Button
//        get() = findViewById(R.id.btnUpdate)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_live_data_main)
//        setContentView(R.layout.activity_live_data_main)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        mainViewModel.factLiveData.observe(this, Observer {
            binding.factsTextView.text = it
            Log.d("TAG", "onCreate: "+it)
        })
        binding.mainViewModel = mainViewModel


//        btnUpdate.setOnClickListener {
//            mainViewModel.updateLiveData()
//        }
    }
}