package com.nbcc.codelabchallenge_happybday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        try{
            throw java.lang.ArithmeticException("Exception log test")
        }catch(e: ArithmeticException){
            android.util.Log.wtf("MainActivity", "Message:" + e.message);
        }
    }
}
