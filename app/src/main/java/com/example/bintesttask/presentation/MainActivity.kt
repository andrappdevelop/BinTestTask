package com.example.bintesttask.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bintesttask.App
import com.example.bintesttask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val viewModel = (application as App).viewModel

        binding.searchButton.setOnClickListener {
            viewModel.fetch(binding.inputEditText.text.toString())
        }
        viewModel.liveData.observe(this) {
            it.show(binding.progressLayout, binding.textView, binding.searchButton)
        }
    }
}