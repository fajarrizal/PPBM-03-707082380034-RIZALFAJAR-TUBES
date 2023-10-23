package com.example.tugas_4page

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Profil_edit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil_edit)
        window.statusBarColor = this.resources.getColor(R.color.dark)

        val imageView = findViewById(R.id.link_back_profile) as ImageView
        imageView.setOnClickListener {
            val intent = Intent(this, Profil_page::class.java)
            startActivity(intent)
        }
    }
}