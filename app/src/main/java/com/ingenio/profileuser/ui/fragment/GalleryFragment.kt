package com.ingenio.profileuser.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import com.ingenio.profileuser.R
import com.ingenio.profileuser.data.model.User
import com.ingenio.profileuser.databinding.FragmentGalleryBinding
import com.ingenio.profileuser.databinding.GalleryItemBinding
import com.ingenio.profileuser.ui.adapter.GalleryAdapter
import com.ingenio.profileuser.ui.viewmodel.UserViewModel

class GalleryFragment : Fragment() {

    private val userViewModel : UserViewModel by activityViewModels()
    private lateinit var binding : FragmentGalleryBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentGalleryBinding.inflate(layoutInflater)
        val recyclerView = binding.recyclerView
       userViewModel.onCreate(requireContext())

        userViewModel.users.observe(viewLifecycleOwner) {
            //update recyclerview
        }
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.fragment_gallery, container, false)
    }

}