package com.nbcc.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = "Dice Rolled!"

        val countUpButton: Button = findViewById(R.id.count_up)
        countUpButton.setOnClickListener { countUp() }

        val resetButton: Button = findViewById(R.id.reset)
        resetButton.setOnClickListener { reset() }
    }

    /**
     * Makes result text a random number between 1 and 6
     * Displays toast
     */
    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        result_text.text = randomInt.toString()
        Toast.makeText(this, "Button clicked!", Toast.LENGTH_SHORT).show()
    }

    /**
     * Increases displayed number by 1 if lower than six.
     * Will display 1 if no number displayed.
     */
    private fun countUp() {
        if (!result_text.text.toString().equals("Dice Rolled!")) {
            var resultNum = Integer.parseInt(result_text.text.toString())
            if (resultNum != 6) {
                resultNum++
                result_text.text = resultNum.toString()
            }
        } else {
            result_text.text = "1"
        }
    }

    /**
     * Result the result text to 0
     */
    private fun reset() {
        result_text.text = "0"
    }
}
