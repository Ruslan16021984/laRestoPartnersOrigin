package com.example.larestopartnersorigin.presentations.auth.register_with_email

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.larestopartnersorigin.R
import com.example.larestopartnersorigin.databinding.FragmentRegisterWithEmailBinding
import com.example.larestopartnersorigin.presentations.auth.BaseAuthFragment

class RegisterWithEmailFragment : BaseAuthFragment() {

    private var _binding: FragmentRegisterWithEmailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentRegisterWithEmailBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        registerWithEmail()
        loginWithEmail()
    }

    private fun loginWithEmail() {
        binding.btnLoginWithEmail.setOnClickListener {
            findNavController().navigate(R.id.registerWithEmailFragment)
        }
    }

    private fun registerWithEmail() {
        val name = binding.tvName.text.toString()
        val email = binding.tvEmailAddress.text.toString()
        val password = binding.tvPassword.text.toString()
        if (name.isNotEmpty() && password
                .isNotEmpty() && email.isNotEmpty()){
            binding.btnRegisterWithEmail.setOnClickListener {
//                viewModel.postEmail(email, name, password).observe(viewLifecycleOwner, Observer {
//                    binding.progressChartWithEmail.visibility = View.INVISIBLE
//                    if (it.status){
//                        findNavController().navigate(R.id.infoCheckDilaog)
//                    }else{
//                        Toast.makeText(context, "Account Exist", Toast.LENGTH_LONG).show()
//                    }
//                })
            }
        }
    }
}