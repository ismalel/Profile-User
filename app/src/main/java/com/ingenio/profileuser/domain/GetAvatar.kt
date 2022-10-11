package com.ingenio.profileuser.domain

import okhttp3.ResponseBody

class GetAvatar(private val id: String) {

    private val repository = UserRepository()

    suspend operator fun invoke() : ResponseBody {
        return repository.getAvatar(id)
    }
}