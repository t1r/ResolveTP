package com.tp.resolvetp

import android.app.Application
import com.tp.resolvetp.di.AppModule
import com.tp.resolvetp.di.DI
import toothpick.Scope
import toothpick.configuration.Configuration
import toothpick.ktp.KTP

class App : Application() {

    lateinit var scope: Scope

    override fun onCreate() {
        super.onCreate()
        initToothpick()
        initAppScope()
    }

    private fun initToothpick() {
        if (true) {
            KTP.setConfiguration(Configuration.forDevelopment().preventMultipleRootScopes())
        } else {
            KTP.setConfiguration(Configuration.forProduction())
        }
    }

    private fun initAppScope() {
        scope = KTP.openScope(DI.APP_SCOPE)
            .installModules(AppModule(this@App))
    }
}