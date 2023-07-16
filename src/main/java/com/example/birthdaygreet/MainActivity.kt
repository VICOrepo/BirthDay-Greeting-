package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText



class MainActivity : AppCompatActivity() {

    private lateinit var btnSendData: Button
    private lateinit var editUserName: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSendData = findViewById(R.id.createBirthdayButton)
        editUserName = findViewById(R.id.nameInput)

        btnSendData.setOnClickListener{
            startActivity(Intent(this,BirthdayGreetingActivity::class.java)
                .putExtra("Name",editUserName.text.toString()))
        }
      }
    }

