package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class CartActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart3)
        val actionBar = supportActionBar

        if (actionBar != null){
            actionBar!!.title = "Cart"

            actionBar.setDisplayHomeAsUpEnabled(true)

        }

        val btn7: Button = findViewById<Button>(R.id.btn7)

        btn7.setOnClickListener {
            Toast.makeText(this, "Purchase Successful", Toast.LENGTH_SHORT).show()
        }
    }
}