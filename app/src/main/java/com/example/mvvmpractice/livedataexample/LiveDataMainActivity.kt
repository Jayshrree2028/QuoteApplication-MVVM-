package com.example.mvvmpractice.livedataexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmpractice.R

class LiveDataMainActivity : AppCompatActivity() {
    lateinit var mainViewModel: MainViewModel
    private val factsTextview : TextView
        get() = findViewById(R.id.factsTextView)

    private val btnUpdate: Button
        get() = findViewById(R.id.btnUpdate)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data_main)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        mainViewModel.factLiveData.observe(this, Observer {
            factsTextview.text = it
            Log.d("TAG", "onCreate: "+it)
        })

        btnUpdate.setOnClickListener {
            mainViewModel.updateLiveData()
        }
    }
}