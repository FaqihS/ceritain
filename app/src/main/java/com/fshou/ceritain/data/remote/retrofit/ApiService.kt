package com.fshou.ceritain.data.remote.retrofit

import com.fshou.ceritain.data.remote.response.DetailStoryResponse
import com.fshou.ceritain.data.remote.response.LoginResponse
import com.fshou.ceritain.data.remote.response.Response
import com.fshou.ceritain.data.remote.response.StoriesResponse
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part
import retrofit2.http.Path

interface ApiService {

    @FormUrlEncoded
    @POST("register")
    suspend fun register(
        @Field("name") name: String,
        @Field("email") email: String,
        @Field("password") password: String
    ): Response

    @FormUrlEncoded
    @POST("login")
    suspend fun login(
        @Field("email") email: String,
        @Field("password") password: String
    ): LoginResponse

    @POST("stories")
    suspend fun postStory(
        // Todo: Post Story
    )

    @Multipart
    @POST("stories/guest")
    suspend fun postStoryAsGuest(
        @Part file: MultipartBody.Part,
        @Part("description") description: RequestBody,

        // Todo:
    )

    @GET("stories")
    suspend fun getStories(
        @Header("Authorization") bearerToken: String
    ): StoriesResponse

    @GET("stories/{id}")
    suspend fun getDetailStory(
        @Path("id") id: String
    ): DetailStoryResponse

}