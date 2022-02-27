package com.anhkhoido.conversiak.ui.conversion

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ConversionViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is the Fragment for currency conversion"
    }
    val text: LiveData<String> = _text
}