package com.learning.talentprogrammadvanced.Ch_29_Retrofit.network

import com.google.gson.JsonElement
import com.learning.talentprogrammadvanced.Ch_29_Retrofit.model.PostItem
import com.learning.talentprogrammadvanced.Ch_29_Retrofit.model.PostModel
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface APIService {
    @GET(END_POINT)
    suspend fun getPosts(): Response<List<PostItem>>
}