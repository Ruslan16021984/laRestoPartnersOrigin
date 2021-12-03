package com.example.larestopartnersorigin.presentations.auth.login_with_email

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.larestopartnersorigin.R
import com.example.larestopartnersorigin.presentations.auth.BaseAuthFragment

class LoginWithEmailFragment : BaseAuthFragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login_with_email, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }

}