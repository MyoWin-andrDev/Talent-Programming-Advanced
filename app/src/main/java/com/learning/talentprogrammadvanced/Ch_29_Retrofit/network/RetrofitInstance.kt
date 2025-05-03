package com.learning.talentprogrammadvanced.Ch_29_Retrofit.network

import com.learning.talentprogrammadvanced.Ch_29_Retrofit.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    fun getInstance() : Retrofit =
    Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        }