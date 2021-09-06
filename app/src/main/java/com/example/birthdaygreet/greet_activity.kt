package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_greet_activity.*
import kotlinx.android.synthetic.main.activity_main.*

class greet_activity : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA="name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greet_activity)
        val name = intent.getStringExtra(NAME_EXTRA)
        nameOutput.text = "Happy Birthday\n $name  !!"


    }
}