package com.example.guias
import retrofit2.Call
import retrofit2.http.GET

interface EndPointApi {
    @GET(ConstantsRestApi.POSTS)
    fun getAllPost(): Call<List<Post>>
}