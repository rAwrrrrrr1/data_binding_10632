package com.example.data_binding_10632

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val currentRandomFruitName: LiveData<String>
        get() = FakeRepository.currentRandomFruitName

    fun onChangeRandomFruitClick () = FakeRepository.changeCurrentRandomFruitName()

    val editTextContent = MutableLiveData<String>()

    private val _displayEditTextContent = MutableLiveData<String>()
    val displayedEditTextContent: LiveData<String>
        get() = _displayEditTextContent

    fun onDisplayEditTextContentClick(){
        _displayEditTextContent.value = editTextContent.value
    }

    fun onSelectedRandomEditTextFruti(){
        editTextContent.value = FakeRepository.getRandomfruitName()
    }

}