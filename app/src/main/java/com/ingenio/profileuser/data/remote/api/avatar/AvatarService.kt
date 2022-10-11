package com.ingenio.profileuser.data.remote.api.avatar

import android.util.Log
import com.ingenio.profileuser.data.remote.RetrofitBuilder
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.ResponseBody
import retrofit2.http.Query

class AvatarService {

    private val retrofit = RetrofitBuilder.getRetrofit()

    suspend fun getAvatar(id: String): ResponseBody {
        return withContext(Dispatchers.IO) {
            Log.i("test", id)
            val response = retrofit.create(AvatarApi::class.java).getAvatar(id)
            response.body()!!
        }
    }
}