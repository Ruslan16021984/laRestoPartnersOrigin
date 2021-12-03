package com.example.larestopartnersorigin.presentations.auth.launcher

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.viewpager2.widget.ViewPager2
import com.example.larestopartnersorigin.R
import com.example.larestopartnersorigin.databinding.FragmentLauncherBinding
import com.example.larestopartnersorigin.presentations.auth.BaseAuthFragment
import com.example.larestopartnersorigin.presentations.auth.introSliderToList
import com.example.larestopartnersorigin.presentations.auth.launcher.adapter.IntroSliderAdapter
import com.example.larestopartnersorigin.presentations.auth.setCurrrentIndicator
import com.example.larestopartnersorigin.presentations.auth.setupIndicators
import kotlinx.android.synthetic.main.fragment_launcher.*

class LauncherFragment : BaseAuthFragment(), View.OnClickListener {

    private var _binding: FragmentLauncherBinding? = null
    private val binding get() = _binding!!

    var introSliderAdapter:
            IntroSliderAdapter? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentLauncherBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        introSliderAdapter =
            IntroSliderAdapter(
                introSliderToList(requireContext())
            )
        introSliderViewPager.adapter = introSliderAdapter
        setupIndicators(introSliderAdapter!!)
        setCurrrentIndicator(binding,0)
        val button = btnGetStarted
        button.setOnClickListener(this)
        introSliderViewPager.registerOnPageChangeCallback(object :
            ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                setCurrrentIndicator(binding,position)
                if (position == 5) {
                    button.isEnabled = true
                    button.setBackgroundColor(
                        ContextCompat.getColor(
                            requireContext(),
                            R.color.backGroundTint
                        )
                    )
                } else {
                    button.isCheckable = false
                }
            }
        })
    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }
}