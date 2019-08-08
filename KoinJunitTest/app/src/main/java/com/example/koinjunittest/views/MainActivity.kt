package com.example.koinjunittest.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.koinjunittest.R
import com.example.koinjunittest.databinding.ActivityMainBinding
import com.example.koinjunittestviewmodels.main.IMainViewModel
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {


    private val viewModel: IMainViewModel by inject()

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

    }


}
