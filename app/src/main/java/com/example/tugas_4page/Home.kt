package com.example.tugas_4page

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        window.statusBarColor = this.resources.getColor(R.color.dark)

        val imageView = findViewById(R.id.profile_link) as ImageView
        imageView.setOnClickListener {
            val intent = Intent(this, Profil_page::class.java)
            startActivity(intent)
        }
        val imageView2 = findViewById(R.id.link_language) as ImageView
        imageView2.setOnClickListener {
            val intent = Intent(this, Language_Settings::class.java)
            startActivity(intent)
        }
        val imageView3 = findViewById(R.id.img_input_indicator) as ImageView
        imageView3.setOnClickListener {
            val intent = Intent(this, Input::class.java)
            startActivity(intent)
        }
        val imageView4 = findViewById(R.id.img_photos_indicator) as ImageView
        imageView4.setOnClickListener {
            val intent = Intent(this, Photos::class.java)
            startActivity(intent)
        }
        val imageView5 = findViewById(R.id.img_evaluation_indicator) as ImageView
        imageView5.setOnClickListener {
            val intent = Intent(this, Evaluation::class.java)
            startActivity(intent)
        }
        val imageView6 = findViewById(R.id.img_overview_indicator) as ImageView
        imageView6.setOnClickListener {
            val intent = Intent(this, About::class.java)
            startActivity(intent)
        }
    }
}