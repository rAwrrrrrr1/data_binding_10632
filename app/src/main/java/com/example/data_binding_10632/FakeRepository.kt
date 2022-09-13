package com.example.data_binding_10632

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlin.random.Random

object FakeRepository {
    private val fruitNames: List<String> = listOf(
        "Apel","Mangga","Pisang","Anggur","Stroberri",
        "Jambu","Raspberi","Bambu","Kiwi","Pir"
    )

    private val _currentRandomFrutiName = MutableLiveData<String>()
    val currentRandomFruitName: LiveData<String>
        get() = _currentRandomFrutiName

    init{
        _currentRandomFrutiName.value = fruitNames.first()
    }

    fun getRandomfruitName():String{
        val random = Random.nextInt(fruitNames.size)
        return fruitNames[random]
    }

    fun changeCurrentRandomFruitName(){
        _currentRandomFrutiName.value = getRandomfruitName()
    }

}