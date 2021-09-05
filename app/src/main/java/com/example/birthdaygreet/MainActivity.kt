package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayCard(view: android.view.View) {
        val nameInput = findViewById<EditText>(R.id.nameInput)
        val name=nameInput.editableText.toString()
        val intent=Intent(this,BirthdayGreetingActivity::class.java)
        intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA,name)
        startActivity(intent)
    }
}