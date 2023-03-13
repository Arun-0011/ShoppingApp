package com.example.urbanhouse.ui

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.urbanhouse.databinding.FragmentProfileBinding
import com.squareup.picasso.Picasso

class ProfileFragment : Fragment() {
    private var binding: FragmentProfileBinding? = null
    var sharedPreference: SharedPreferences? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfileBinding.inflate(inflater, container, false)
        userDetail()
        return binding!!.root
    }

    private fun userDetail() {
        sharedPreference =
            requireContext().getSharedPreferences("PREFERENCE_NAME", Context.MODE_PRIVATE)
        binding?.userName?.text = sharedPreference?.getString("username", "")
        val firstName = sharedPreference?.getString("firstName", "")
        val lastName = sharedPreference?.getString("lastName", "")
        binding?.name?.text = "$firstName $lastName"
        binding?.userEmail?.text = sharedPreference?.getString("email", "")
        binding?.tvGender?.text = sharedPreference?.getString("gender", "")

        Picasso.get()
            .load(sharedPreference?.getString("image", ""))
            .into(binding?.userProfilePic)
    }
}