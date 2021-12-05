package com.example.larestopartnersorigin.presentations.auth.splash

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.larestopartnersorigin.databinding.FragmentSplashBinding
import com.example.larestopartnersorigin.presentations.auth.BaseAuthFragment

class SplashFragment : BaseAuthFragment() {

    private val viewModel: SplashViewModel by viewModels()
    private var _binding: FragmentSplashBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentSplashBinding.inflate(layoutInflater)
        return binding.root
    }

}