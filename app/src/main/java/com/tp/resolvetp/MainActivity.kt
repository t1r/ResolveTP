package com.tp.resolvetp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tp.resolvetp.di.DI
import com.tp.resolvetp.first.FirstFragment
import toothpick.ktp.KTP

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        openScope()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
                .replace(R.id.main_container, FirstFragment(), "FirstTag")
                .commit()
    }

    fun openScope() {
        KTP.openScope(DI.APP_SCOPE)
                .inject(this)
    }
}
