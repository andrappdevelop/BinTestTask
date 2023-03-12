package com.example.bintesttask.data

import com.example.bintesttask.presentation.UiMapper
import com.example.bintesttask.presentation.UiState

interface DataResult {

    fun map(mapper: UiMapper): UiState

    data class Success(private val cloud: BinCloud) : DataResult {
        override fun map(mapper: UiMapper): UiState {
            return mapper.mapSuccess(cloud)
        }
    }

    data class Error(private val message: String) : DataResult {
        override fun map(mapper: UiMapper): UiState {
            return mapper.mapError(message)
        }
    }
}