package com.example.larestopartnersorigin.presentations.auth

import android.content.Context
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.core.view.get
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.example.larestopartnersorigin.R
import com.example.larestopartnersorigin.databinding.FragmentLauncherBinding
import com.example.larestopartnersorigin.presentations.auth.launcher.adapter.IntroSliderAdapter
import com.example.larestopartnersorigin.presentations.auth.launcher.pojo.IntroSlide
import kotlinx.android.synthetic.main.fragment_launcher.*

fun Fragment.setupIndicators(introSliderAdapter:
                             IntroSliderAdapter
) {
    val indicators = arrayOfNulls<ImageView>(introSliderAdapter.itemCount)
    val layoutParams: LinearLayout.LayoutParams =
        LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
    layoutParams.setMargins(8, 0, 8, 0)
    for (i in indicators.indices) {
        indicators[i] = ImageView(this.requireContext())
        indicators[i].apply {
            this?.setImageDrawable(
                ContextCompat.getDrawable(
                    this.context,
                    R.drawable.indicator_active
                )
            )
            this?.layoutParams = layoutParams
        }
        indicatorsContainer.addView(indicators[i])
    }

}
fun Fragment.setCurrrentIndicator(view: ViewBinding, index: Int) {
    view as FragmentLauncherBinding
    val childCount = view.indicatorsContainer.childCount
    for (i in 0 until childCount) {
        val imageView = view.indicatorsContainer[i] as ImageView
        if (i == index) {
            imageView.setImageDrawable(
                ContextCompat.getDrawable(
                    this.requireContext(),
                    R.drawable.indicator_active
                )
            )
        } else {
            imageView.setImageDrawable(
                ContextCompat.getDrawable(
                    this.requireContext(),
                    R.drawable.indicator_inactive
                )
            )
        }
    }
}
fun introSliderToList(context: Context): List<IntroSlide> {

    return listOf(
        IntroSlide(
            context.getString(R.string.app_name),
            context.getString(R.string.app_name),
            R.drawable.ic_launcher_background
        ),
        IntroSlide(
            context.getString(R.string.app_name),
            context.getString(R.string.app_name),
            R.drawable.ic_launcher_background
        ),
        IntroSlide(
            context.getString(R.string.app_name),
            context.getString(R.string.app_name),
            R.drawable.ic_launcher_background
        ),
        IntroSlide(
            context.getString(R.string.app_name),
            context.getString(R.string.app_name),
            R.drawable.ic_launcher_background
        ),
        IntroSlide(
            context.getString(R.string.app_name),
            context.getString(R.string.app_name),
            R.drawable.ic_launcher_background
        ),
        IntroSlide(
            context.getString(R.string.app_name),
            context.getString(R.string.app_name),
            R.drawable.ic_launcher_background
        )
    )

}