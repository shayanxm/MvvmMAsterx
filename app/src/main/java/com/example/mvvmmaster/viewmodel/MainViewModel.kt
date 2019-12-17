package com.example.mvvmmaster.viewmodel

import androidx.databinding.ObservableField
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel() : ViewModel() {
    private val enterNameLiveData=MutableLiveData<String>()
    fun getLiveData():LiveData<String> = enterNameLiveData
var title=ObservableField<String>("n")
    var nameEntered=""
    var unUsualTxt=""
    var buttonTxt=""
    var resultText=""
fun justCreateATest( titlex :String){
    title.set(titlex)
}
}