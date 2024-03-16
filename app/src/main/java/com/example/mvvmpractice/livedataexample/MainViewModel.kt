package com.example.mvvmpractice.livedataexample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    val factLiveData = MutableLiveData<String>("fff")

    fun updateLiveData(){
        factLiveData.value = "Another Fact"
    }
}