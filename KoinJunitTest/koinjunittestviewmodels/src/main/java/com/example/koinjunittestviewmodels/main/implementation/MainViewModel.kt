package com.example.koinjunittestviewmodels.main.implementation

import androidx.lifecycle.MutableLiveData
import com.example.koinjunittestviewmodels.base.ICommand
import com.example.koinjunittestviewmodels.main.IMainViewModel


class MainViewModel : IMainViewModel {

    override var ParamOne: MutableLiveData<Int> = MutableLiveData(2)

    override var ParamTwo: MutableLiveData<Int> = MutableLiveData(3)

    override var result: MutableLiveData<Int> = MutableLiveData(5)

    override val AddCommand: ICommand = AddNumbersCommand(this)
}

