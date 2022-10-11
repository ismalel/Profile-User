package com.ingenio.profileuser.domain

import android.content.Context
import com.ingenio.profileuser.data.local.LocalService
import com.ingenio.profileuser.data.model.User
import com.ingenio.profileuser.data.remote.api.avatar.AvatarService
import okhttp3.ResponseBody

class UserRepository() {

    private val avatarService = AvatarService()
    private val localService = LocalService()

    suspend fun getUsers(context: Context) : List<User> {
        return localService.getUserData(context)
    }
    suspend fun getAvatar(id: String) : ResponseBody {
        return avatarService.getAvatar(id)
    }
}