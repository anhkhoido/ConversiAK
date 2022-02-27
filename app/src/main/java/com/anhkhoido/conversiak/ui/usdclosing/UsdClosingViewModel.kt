package com.anhkhoido.conversiak.ui.usdclosing

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UsdClosingViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is the Fragment for the closing value of the American dollar"
    }
    val text: LiveData<String> = _text
}