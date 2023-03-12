package com.example.bintesttask.presentation

import com.example.bintesttask.data.BinCloud

interface UiMapper {

    fun mapSuccess(cloud: BinCloud): UiState

    fun mapError(message: String): UiState

    class Base : UiMapper {

        override fun mapSuccess(cloud: BinCloud): UiState {
            val result = cloud.toString()
            return UiState.Success(result)
        }

        override fun mapError(message: String) = UiState.Error(message)
    }
}