package com.example.koinjunittestviewmodels.base.implementation

import androidx.lifecycle.MutableLiveData
import com.example.koinjunittestviewmodels.base.ICommand


abstract class BaseCommand : ICommand {

    var executable: MutableLiveData<Boolean> = MutableLiveData()

    init {
        executable.value = true
    }


    override fun isEnabled(): MutableLiveData<Boolean> = executable
}