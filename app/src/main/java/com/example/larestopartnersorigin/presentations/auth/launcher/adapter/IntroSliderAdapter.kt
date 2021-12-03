package com.example.larestopartnersorigin.presentations.auth.launcher.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.larestopartnersorigin.R
import com.example.larestopartnersorigin.presentations.auth.launcher.pojo.IntroSlide
import kotlinx.android.synthetic.main.slide_item_container.view.*

class IntroSliderAdapter(private val introslides: List<IntroSlide>): RecyclerView.Adapter<IntroSliderAdapter.IntroSliderViewHolder>(){


    inner class IntroSliderViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val context = view.context
        val textTitle = view.textTitle
        val textDescriptoin = view.textDescriprion
        val imageIcon = view.imageSliderIcon

        fun bind(introslide: IntroSlide){
            textTitle.text = introslide.title
            textTitle.typeface = ResourcesCompat.getFont(context, R.font.medium)
            textDescriptoin.text = introslide.descriprion
            imageIcon.setImageResource(introslide.icon)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IntroSliderViewHolder {
        return IntroSliderViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.slide_item_container, parent, false))
    }

    override fun getItemCount(): Int {
        return introslides.size
    }

    override fun onBindViewHolder(holder: IntroSliderViewHolder, position: Int) {
        holder.bind(introslides[position])
    }
}