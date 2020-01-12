package com.nbcc.challenge20_3

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val box1 = findViewById<TextView>(R.id.textView)
        val box2 = findViewById<TextView>(R.id.textView2)
        val box3 = findViewById<TextView>(R.id.textView3)
        val box4 = findViewById<TextView>(R.id.textView4)
        val box5 = findViewById<TextView>(R.id.textView5)
        val box6 = findViewById<TextView>(R.id.textView6)
        val box7 = findViewById<TextView>(R.id.textView7)
        val box8 = findViewById<TextView>(R.id.textView8)
        val box9 = findViewById<TextView>(R.id.textView9)
        val box10 = findViewById<TextView>(R.id.textView10)
        val box12 = findViewById<TextView>(R.id.textView12)
        val box13 = findViewById<TextView>(R.id.textView13)
        val box14 = findViewById<TextView>(R.id.textView14)
        val box15 = findViewById<TextView>(R.id.textView15)
        val box17 = findViewById<TextView>(R.id.textView17)
        val box18 = findViewById<TextView>(R.id.textView18)

        val clickableViews: List<View> = listOf(
            box1, box2, box3, box4, box5, box6, box7, box8,
            box9, box10, box12, box13, box14, box15, box17, box18
        )

        for (item in clickableViews) {
            item.setOnClickListener { makeColour(it) }
        }
    }

    private fun makeColour(view: View) {
        val red = Random().nextInt(255) + 1
        val green = Random().nextInt(255) + 1
        val blue = Random().nextInt(255) + 1

        view.setBackgroundColor(Color.rgb(red, green, blue))
    }
}
