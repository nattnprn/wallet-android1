package com.example.mywallet.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel :ViewModel(){
    private val test: MutableLiveData<String> = MutableLiveData<String>().apply { postValue("this is view-model") }
    val test = LiveData<String>
    get = _test

}