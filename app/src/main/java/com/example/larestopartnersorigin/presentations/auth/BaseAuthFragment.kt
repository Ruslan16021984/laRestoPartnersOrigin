package com.example.larestopartnersorigin.presentations.auth

import android.content.Context
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
abstract class BaseAuthFragment: Fragment() {
    val TAG: String = "AppDebug"
    override fun onAttach(context: Context) {
        super.onAttach(context)
    }
}