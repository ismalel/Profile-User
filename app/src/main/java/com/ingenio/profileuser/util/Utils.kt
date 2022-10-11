package com.ingenio.profileuser.util

import android.net.Uri


object Utils {

    // https://d1qb2nb5cznatu.cloudfront.net/users/2193223-large?1462223955

    fun getPath(url: String): String? {
        val uri: Uri = Uri.parse(url)
        val id = uri.path?.split("/")
        return id?.get(2)
    }

}