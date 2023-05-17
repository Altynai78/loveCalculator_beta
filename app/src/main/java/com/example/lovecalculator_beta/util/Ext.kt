package com.example.lovecalculator_beta.util

import android.widget.ImageView

fun ImageView.loadImage(url: String?){
    Glide.with(this).load(url).into(this)
}