package com.tp.resolvetp.first

import android.content.Context
import android.util.Log
import com.tp.resolvetp.BaseFragment
import com.tp.resolvetp.R
import toothpick.config.Module
import toothpick.ktp.delegate.inject

class FirstFragment : BaseFragment() {

    override val layoutRes: Int = R.layout.fragment_first
    override val modules: Array<Module> = emptyArray()

    //v1
    private val firstFeature: FirstFeature by inject()

    //v2
//    @Inject lateinit var component: Component

    init {
        Log.d("FirstFragment", "${this.toString()}")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        firstFeature.doSomething(this)
    }
}