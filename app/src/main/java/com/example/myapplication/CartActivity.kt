package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class CartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        val actionBar = supportActionBar

        if (actionBar != null){
            actionBar!!.title = "Cart"

            actionBar.setDisplayHomeAsUpEnabled(true)

        }

        val btn3: Button = findViewById<Button>(R.id.btn3)

        btn3.setOnClickListener {
            Toast.makeText(this, "Purchase Successful", Toast.LENGTH_SHORT).show()
        }
    }
}