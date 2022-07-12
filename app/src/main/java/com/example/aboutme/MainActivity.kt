package com.example.aboutme
import android.content.Context
import java.util.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import com.example.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.doneButton.setOnClickListener{addNickName(it)}
    }

    private fun addNickName(view: View) {
        val nickNameText = binding.nicknameText
        val nicknameEdit = binding.nicknameEdit
        nickNameText.text = nicknameEdit.text
        binding.doneButton.visibility = View.GONE
        nicknameEdit.visibility = View.GONE
        nickNameText.visibility = View.VISIBLE

        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}
