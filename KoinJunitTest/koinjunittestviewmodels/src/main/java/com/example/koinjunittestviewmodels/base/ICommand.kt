package com.example.koinjunittestviewmodels.base

import androidx.lifecycle.MutableLiveData

interface ICommand {

    fun isEnabled(): MutableLiveData<Boolean>

    fun execute(obj: Any? = null)
}