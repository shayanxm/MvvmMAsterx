package com.example.mvvmmaster.viewmodel

import androidx.databinding.ObservableField
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvmmaster.model.Repository

class MainViewModel() : ViewModel() {
    private val enterNameLiveData=MutableLiveData<String>()
    fun getLiveData():LiveData<String> = enterNameLiveData
var title=ObservableField<String>("n")
    var nameEntered=""
    var unUsualTxt=""
    var buttonTxt=""
    var resultText=ObservableField<String>("n")
fun justCreateATest( titlex :String){
    title.set(titlex)
}
    fun showEnteredName(){
       resultText.set( Repository.enteredNameList.value.toString())
    }

}