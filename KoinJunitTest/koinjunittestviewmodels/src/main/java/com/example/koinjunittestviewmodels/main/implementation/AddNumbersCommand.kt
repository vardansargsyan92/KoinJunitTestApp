package com.example.koinjunittestviewmodels.main.implementation

import com.example.koinjunittestviewmodels.base.implementation.BaseCommand

class AddNumbersCommand(private val viewModel: MainViewModel) : BaseCommand() {
    override fun execute(obj: Any?) {
        var paramOne: Int = viewModel.ParamOne.value!!
        var paramTwo: Int = viewModel.ParamTwo.value!!
        viewModel.result.postValue(paramOne + paramTwo)
    }

}