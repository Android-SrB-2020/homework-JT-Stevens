package com.nbcc.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage1: ImageView
    lateinit var diceImage2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage1 = findViewById(R.id.dice_image1)
        diceImage2 = findViewById(R.id.dice_image2)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val clearButton: Button = findViewById(R.id.clear_button)
        clearButton.setOnClickListener { clear() }
//
//        val resultText: TextView = findViewById(R.id.result_text)
//        resultText.text = "Dice Rolled!"
//
//        val countUpButton: Button = findViewById(R.id.count_up)
//        countUpButton.setOnClickListener { countUp() }
//
//        val resetButton: Button = findViewById(R.id.reset)
//        resetButton.setOnClickListener { reset() }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.wtf("MainActivity", "Application Destroyed")
    }

    /**
     * Makes result text a random number between 1 and 6
     * Displays toast
     */
    private fun rollDice() {
        diceImage1.setImageResource(getRandomDiceImage())
        diceImage2.setImageResource(getRandomDiceImage())
    }

    private fun getRandomDiceImage(): Int {
        val randomInt = Random().nextInt(6) + 1

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        return drawableResource
    }


    private fun clear() {
        diceImage1.setImageResource(R.drawable.empty_dice)
        diceImage2.setImageResource(R.drawable.empty_dice)
    }
//        val result_text.text = randomInt.toString()
//        Toast.makeText(this, "Button clicked!", Toast.LENGTH_SHORT).show()
}

//    /**
////     * Increases displayed number by 1 if lower than six.
////     * Will display 1 if no number displayed.
////     */
////    private fun countUp() {
////        if (!result_text.text.toString().equals("Dice Rolled!")) {
////            var resultNum = Integer.parseInt(result_text.text.toString())
////            if (resultNum != 6) {
////                resultNum++
////                result_text.text = resultNum.toString()
////            }
////        } else {
////            result_text.text = "1"
////        }
////    }
////
////    /**
////     * Result the result text to 0
////     */
////    private fun reset() {
////        result_text.text = "0"
////    }
////}
