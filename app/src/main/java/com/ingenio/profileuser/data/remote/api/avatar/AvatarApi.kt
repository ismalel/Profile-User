package com.ingenio.profileuser.data.remote.api.avatar

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.*

interface AvatarApi {

    @GET("users/{id}")
    suspend fun getAvatar(@Path("id") id: String) : Response<ResponseBody>
}