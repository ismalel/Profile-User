package com.ingenio.profileuser.data.model

import com.google.gson.annotations.SerializedName


data class User (

  @SerializedName("avatar"    ) var avatar    : String? = null,
  @SerializedName("bio"       ) var bio       : String? = null,
  @SerializedName("firstName" ) var firstName : String? = null,
  @SerializedName("id"        ) var id        : Int? = null,
  @SerializedName("lastName"  ) var lastName  : String? = null,
  @SerializedName("title"     ) var title     : String? = null

)