package com.example.urbanhouse.retrofit

import com.example.urbanhouse.models.LoginRequest
import com.example.urbanhouse.models.LoginResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiInterface {

    @POST("auth/login")
    fun loginApi(@Body loginRequest: LoginRequest): Call<LoginResponse>
}