package com.ingenio.profileuser.ui.view

import android.graphics.BitmapFactory
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.ingenio.profileuser.R
import com.ingenio.profileuser.databinding.ActivityMainBinding
import com.ingenio.profileuser.ui.adapter.GalleryAdapter
import com.ingenio.profileuser.ui.fragment.GalleryFragment
import com.ingenio.profileuser.ui.viewmodel.UserViewModel
import com.ingenio.profileuser.util.Utils


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}