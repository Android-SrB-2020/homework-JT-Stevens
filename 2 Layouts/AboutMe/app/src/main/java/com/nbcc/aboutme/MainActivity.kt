package com.nbcc.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import com.nbcc.aboutme.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val myName: MyName = MyName("Jeremy Stevens")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.myName = myName

        //Done button click event
//        findViewById<Button>(R.id.done_button).setOnClickListener{
//            addNickname(it)
//        }
        binding.doneButton.setOnClickListener {
            addNickname(it)
        }

        //Nickname text click event
//        findViewById<TextView>(R.id.nickname_text).setOnClickListener{
//            updateNickname(it)
//        }
        binding.nicknameText.setOnClickListener{
            updateNickname(it)
        }
    }

    /**
     * Updates users nickname
     */
    private fun addNickname(view: View) {
//        val editText = findViewById<EditText>(R.id.nickname_edit)
        val editText = binding.nicknameEdit
//        val nicknameTextView = findViewById<TextView>(R.id.nickname_text)
        val nicknameTextView = binding.nicknameText

        binding.apply {
            myName?.nickname = nicknameEdit.text.toString()
            //UI is refreshed with the value in the updated binding object.
            invalidateAll()
            nicknameEdit.visibility = View.GONE
            doneButton.visibility = View.GONE
            nicknameText.visibility = View.VISIBLE
        }

//        nicknameTextView.text = editText.text
//        myName?.nickname = nicknameEdit.text.tos
//        editText.visibility = View.GONE
//        view.visibility = View.GONE

//        nicknameTextView.visibility = View.VISIBLE

        //Hide keyboard
        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }

    /**
     * Un-hides hidden controls allowing user to re-enter nickname
     */
    private fun updateNickname (view: View){
//        val editText = findViewById<EditText>(R.id.nickname_edit)
//        val doneButton = findViewById<Button>(R.id.done_button)

        val editText = binding.nicknameEdit
        val doneButton = binding.doneButton

        editText.visibility =View.VISIBLE
        doneButton.visibility = View.VISIBLE
        view.visibility = View.GONE

        editText.requestFocus()
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(editText, 0)
    }

}
