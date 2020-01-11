package com.nbcc.hellotoast

import android.R
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private val mCount: Int = 0
    private val TextView mShowCount

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showToast(view: View) {
        val toast: Toast = Toast.makeText(
            this, R.string.toast_message,
            Toast.LENGTH_SHORT
        )
        toast.show()
    }
    fun countUp(view: View) {
        mCount++
    }
}
