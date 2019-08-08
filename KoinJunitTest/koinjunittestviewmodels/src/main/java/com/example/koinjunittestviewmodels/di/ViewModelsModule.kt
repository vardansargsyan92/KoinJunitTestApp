package com.example.koinjunittestviewmodels.di

import com.example.koinjunittestviewmodels.main.IMainViewModel
import com.example.koinjunittestviewmodels.main.implementation.MainViewModel
import org.koin.dsl.module

val viewModelsModule = module {

    single <IMainViewModel>{ MainViewModel()  }
}