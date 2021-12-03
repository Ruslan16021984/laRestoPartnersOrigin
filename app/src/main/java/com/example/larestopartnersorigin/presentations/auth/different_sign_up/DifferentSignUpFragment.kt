package com.example.larestopartnersorigin.presentations.auth.different_sign_up

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.larestopartnersorigin.R
import com.example.larestopartnersorigin.presentations.auth.BaseAuthFragment


class DifferentSignUpFragment : BaseAuthFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_different_sign_up, container, false)
    }
}