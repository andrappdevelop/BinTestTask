package com.example.bintesttask.data

import android.content.Context

interface ProvideResource {

    fun string(id: Int): String

    class Base(private val context: Context) : ProvideResource {
        override fun string(id: Int): String {
            return context.getString(id)
        }
    }
}