package com.example.motivationapp.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class DataModel(
    @StringRes val stringResourceId:Int,
    @DrawableRes val drawableResourceId:Int
    )
