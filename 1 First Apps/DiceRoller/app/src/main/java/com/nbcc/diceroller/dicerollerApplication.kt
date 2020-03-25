package com.nbcc.diceroller

import android.app.Application
import timber.log.Timber

class dieRollerApplication : Application() {
    override fun onCreate(){
        super.onCreate()

        Timber.plant(Timber.DebugTree())
    }
}