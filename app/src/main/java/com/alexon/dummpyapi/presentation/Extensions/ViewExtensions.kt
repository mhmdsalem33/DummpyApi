package com.zamoreegypt.zamore.presentation.Extensions

import android.view.View

object ViewExtensions {
    inline fun View.onSingleClick(crossinline action: (v: View) -> Unit ) {
        setOnClickListener { v ->
            isEnabled = false
            action(v)
            postDelayed({ isEnabled = true } , 5000)
        }
    }
}