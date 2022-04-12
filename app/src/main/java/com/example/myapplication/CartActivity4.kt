package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class CartActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart4)
        val actionBar = supportActionBar

        if (actionBar != null){
            actionBar!!.title = "Cart"

            actionBar.setDisplayHomeAsUpEnabled(true)

        }

        val btn8: Button = findViewById<Button>(R.id.btn8)

        btn8.setOnClickListener {
            Toast.makeText(this, "Purchase Successful", Toast.LENGTH_SHORT).show()
        }
    }
}