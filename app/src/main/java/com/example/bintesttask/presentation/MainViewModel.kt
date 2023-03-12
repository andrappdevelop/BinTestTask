package com.example.bintesttask.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bintesttask.data.BankRepository
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel(
    private val uiMapper: UiMapper,
    private val dispatchersList: DispatchersList,
    private val repository: BankRepository,
    val liveData: MutableLiveData<UiState>
) : ViewModel() {

    fun fetch(input: String) {
        liveData.value = UiState.Loading
        viewModelScope.launch(dispatchersList.io()) {
            val result = repository.fetch(input).map(uiMapper)
            withContext(dispatchersList.ui()) {
                liveData.value = result
            }
        }
    }
}