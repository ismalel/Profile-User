package com.ingenio.profileuser.domain

import android.content.Context

class GetUsers(private val context: Context) {

    private val repository = UserRepository()

    suspend operator fun invoke() = repository.getUsers(context)
}