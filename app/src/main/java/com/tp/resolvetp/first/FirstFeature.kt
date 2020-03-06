package com.tp.resolvetp.first

import android.util.Log
import javax.inject.Inject

class FirstFeature @Inject constructor(
    owner: FirstFragment
) {
    fun doSomething(view: FirstFragment) {
        Log.d("TAG", "${view.tag}")
    }
}