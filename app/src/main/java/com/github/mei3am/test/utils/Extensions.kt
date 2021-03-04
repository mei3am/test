package com.github.mei3am.test.utils

import android.widget.Toast
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment

fun Fragment.toast(@StringRes res: Int) {
    Toast.makeText(this.requireContext(), getString(res), Toast.LENGTH_SHORT).show()
}