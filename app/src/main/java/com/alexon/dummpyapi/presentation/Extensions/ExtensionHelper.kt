package com.zamoreegypt.zamore.presentation.Extensions

import android.content.Context
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.annotation.ColorRes
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController


fun ComponentActivity.toast(text : String) =  Toast.makeText(this , text , Toast.LENGTH_SHORT).show()

fun Fragment.toast(text: String) = Toast.makeText( requireContext() , text , Toast.LENGTH_SHORT).show()

fun Context.getColorCompat(@ColorRes colorResourceId: Int) =  ResourcesCompat.getColor( resources , colorResourceId, theme)

fun Fragment.navigateUp() = findNavController().navigateUp()
