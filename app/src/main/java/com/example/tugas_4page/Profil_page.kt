package com.example.tugas_4page

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.tugas_4page.R

class Profil_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil_page)
        window.statusBarColor = this.resources.getColor(R.color.dark)

        val imageView = findViewById(R.id.link_back_home) as ImageView
        imageView.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
        val button = findViewById<Button>(R.id.logout)
        button.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
        val button2 = findViewById<Button>(R.id.edit_profile)
        button2.setOnClickListener {
            val intent = Intent(this, Profil_edit::class.java)
            startActivity(intent)
        }
    }
}