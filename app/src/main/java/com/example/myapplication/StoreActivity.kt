package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class StoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_store)

        val btn2: Button = findViewById<Button>(R.id.btn2)

        btn2.setOnClickListener {
            val intent = Intent(this, CartActivity::class.java)
            startActivity(intent)
        }

        val btn4: Button = findViewById<Button>(R.id.btn4)

        btn4.setOnClickListener {
            val intent = Intent(this, Cart2Activity::class.java)
            startActivity(intent)
        }

        val btn5: Button = findViewById<Button>(R.id.btn5)

        btn5.setOnClickListener {
            val intent = Intent(this, CartActivity3::class.java)
            startActivity(intent)
        }

        val btn6: Button = findViewById<Button>(R.id.btn6)

        btn6.setOnClickListener {
            val intent = Intent(this, CartActivity4::class.java)
            startActivity(intent)
        }






        val actionBar = supportActionBar

        if (actionBar != null){
            actionBar!!.title = "Store"

            actionBar.setDisplayHomeAsUpEnabled(true)
        }


    }
}