package com.example.koinjunittestviewmodeltests

import com.example.koinjunittestviewmodels.di.viewModelsModule
import com.example.koinjunittestviewmodels.main.IMainViewModel
import org.junit.After
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.test.KoinTest
import org.koin.test.inject

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest : KoinTest {

    private val viewModel by inject<IMainViewModel>()

    @Before
    fun before() {
        startKoin {
            modules(viewModelsModule)
        }
    }

    @After
    fun after() {
        stopKoin()
    }

    @Test
    fun addition_isCorrect() {


        viewModel.ParamOne.postValue(5)
        viewModel.ParamTwo.postValue(5)
        viewModel.AddCommand.execute()
        assertEquals(10, viewModel.result)
    }
}
