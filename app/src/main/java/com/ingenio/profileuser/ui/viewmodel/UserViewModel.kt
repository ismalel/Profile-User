package com.ingenio.profileuser.ui.viewmodel

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ingenio.profileuser.data.model.User
import com.ingenio.profileuser.domain.UserRepository
import kotlinx.coroutines.launch
import okhttp3.ResponseBody

class UserViewModel : ViewModel() {

    private val repository = UserRepository()

    val users = MutableLiveData<List<User>>()
    val isLoading = MutableLiveData<Boolean>()
    val avatar = MutableLiveData<ResponseBody>()

    fun onCreate(context: Context) {
        viewModelScope.launch {
            isLoading.postValue(true)
            val result =  repository.getUsers(context)

            if (!result.isNullOrEmpty()) {
                users.postValue(result)
                isLoading.postValue(false)
            }
        }

    }

    fun getAvatar(id: String) {
        viewModelScope.launch {
            isLoading.postValue(true)
            val result = repository.getAvatar(id)
            avatar.postValue(result)
            isLoading.postValue(false)
        }
    }
}