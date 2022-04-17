package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class AccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        val actionBar = supportActionBar

        actionBar !!.title = "Account"

        actionBar.setDisplayHomeAsUpEnabled(true)

        val saveBtn: Button = findViewById<Button>(R.id.saveBtn)

        saveBtn.setOnClickListener {
            Toast.makeText(this, "Information Saved", Toast.LENGTH_SHORT).show()
        }
    }
}