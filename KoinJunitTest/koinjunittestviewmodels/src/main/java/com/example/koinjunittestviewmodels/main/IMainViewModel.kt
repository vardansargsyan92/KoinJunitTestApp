package com.example.koinjunittestviewmodels.main

import androidx.lifecycle.MutableLiveData
import com.example.koinjunittestviewmodels.base.ICommand


interface IMainViewModel {

    var ParamOne: MutableLiveData<Int>

    var ParamTwo: MutableLiveData<Int>

    var result: MutableLiveData<Int>

    val AddCommand: ICommand
}