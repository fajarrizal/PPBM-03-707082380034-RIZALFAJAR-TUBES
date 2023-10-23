package com.example.tugas_4page

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.tugas_4page.R

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        window.statusBarColor = this.resources.getColor(R.color.dark)


        val button1 = findViewById<Button>(R.id.login_home)
        val button2 = findViewById<Button>(R.id.signup)
        button1.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this, Sign_Up::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }
    }
}