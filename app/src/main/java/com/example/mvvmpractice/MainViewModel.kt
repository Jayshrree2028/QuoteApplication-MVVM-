package com.example.mvvmpractice

import android.view.View
import androidx.lifecycle.ViewModel

class MainViewModel(val counter: Int):ViewModel() {
    var count : Int =counter
    fun increment(v: View){
        count++
    }
}