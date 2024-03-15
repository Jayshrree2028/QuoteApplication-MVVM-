package com.example.mvvmpractice.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmpractice.R

class MainActivity : AppCompatActivity() {

    lateinit var mainViewModel: MainViewModel
    lateinit var txtView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel = ViewModelProvider(this, MainViewModelFactory(10)).get(MainViewModel::class.java)
        txtView = findViewById(R.id.txtCounter)
        setText()

    }
    fun increment(v:View){
        mainViewModel.increment(v)
        setText()

    }
    fun setText(){
        txtView.text=mainViewModel.count.toString()
    }
}