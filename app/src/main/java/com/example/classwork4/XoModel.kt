package com.example.classwork4

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class XoModel(
    val nameX: String,
    val name0: Int
):Parcelable