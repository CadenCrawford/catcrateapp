package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Cart2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart2)
        val actionBar = supportActionBar

        if (actionBar != null){
            actionBar!!.title = "Cart"

            actionBar.setDisplayHomeAsUpEnabled(true)

        }

        val btn: Button = findViewById<Button>(R.id.btn)

        btn.setOnClickListener {
            Toast.makeText(this, "Purchase Successful", Toast.LENGTH_SHORT).show()
        }
    }
}