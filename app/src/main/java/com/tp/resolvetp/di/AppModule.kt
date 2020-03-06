package com.tp.resolvetp.di

import android.content.Context
import toothpick.config.Module
import toothpick.ktp.binding.bind

class AppModule(context: Context) : Module() {
    init {
        /* Global */
        bind<Context>().toInstance { context }
    }
}