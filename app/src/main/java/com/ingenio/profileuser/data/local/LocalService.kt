package com.ingenio.profileuser.data.local

import android.content.Context
import com.google.gson.Gson
import com.ingenio.profileuser.data.model.User
import java.nio.charset.Charset

class LocalService {

    fun getUserData(context: Context): List<User> {
        val inputStreamJson = context.assets.open("data/team.json")
        val size : Int = inputStreamJson.available()
        val buffer = ByteArray(size)
        inputStreamJson.read(buffer)
        inputStreamJson.close()
        val json = String(buffer, Charset.forName("UTF-8"))
        return Gson().fromJson(json, Array<User>::class.java).asList()
    }
}