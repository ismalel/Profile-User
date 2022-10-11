package com.ingenio.profileuser.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {

    private const val SRC_URL = "https://d1qb2nb5cznatu.cloudfront.net/"

    fun getRetrofit() : Retrofit {
        return Retrofit.Builder()
            .baseUrl(SRC_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}