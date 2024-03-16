package com.example.mvvmpractice.livedataexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
     private val factLiveDataObject = MutableLiveData<String>("fff")
     val factLiveData : LiveData<String>
         get() = factLiveDataObject

    fun updateLiveData(){
        factLiveDataObject.value = "Another Fact"
    }
}