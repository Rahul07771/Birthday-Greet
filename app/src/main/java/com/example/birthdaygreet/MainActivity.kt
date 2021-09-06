package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createActivity(view: View) {
        val name = nameInput.editableText.toString()

        val intent = Intent(this, greet_activity :: class.java)
        intent.putExtra(greet_activity.NAME_EXTRA,name)
        startActivity(intent)

    }
}