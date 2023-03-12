package com.example.bintesttask

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.example.bintesttask.data.BankRepository
import com.example.bintesttask.data.BankService
import com.example.bintesttask.data.ProvideResource
import com.example.bintesttask.presentation.DispatchersList
import com.example.bintesttask.presentation.MainViewModel
import com.example.bintesttask.presentation.UiMapper
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class App : Application() {

    lateinit var viewModel: MainViewModel

    override fun onCreate() {
        super.onCreate()
        viewModel = MainViewModel(
            UiMapper.Base(),
            DispatchersList.Base(),
            BankRepository.Base(
                Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl("https://lookup.binlist.net")
                    .build()
                    .create(BankService::class.java),
                ProvideResource.Base(this)
            ),
            MutableLiveData()
        )
    }
}