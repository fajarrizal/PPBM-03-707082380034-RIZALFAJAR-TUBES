package com.example.tugas_4page

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.tugas_4page.databinding.ActivityPhotosBinding

class News_post_detal : AppCompatActivity() {

    private lateinit var binding: ActivityPhotosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPhotosBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_news_post_detal)
        window.statusBarColor = this.resources.getColor(R.color.dark)

        val title_name = intent.getStringExtra("title")
        val body_post = intent.getStringExtra("desc")
        val photo = intent.getIntExtra("imgid", R.drawable.avatar_post_1)
        val post = intent.getIntExtra("postid", R.drawable.post_image_1)


        val detailTitleTextView: TextView = findViewById(R.id.isi_lv_cs_title_detail)
        val detailDescriptionTextView: TextView = findViewById(R.id.isi_lv_cs_desc_detail)
        val lvCsImage: ImageView = findViewById(R.id.isi_lv_cs_image_detail)
        val lvCsPost: ImageView = findViewById(R.id.isi_gambar_lv_cs_detail)

        detailTitleTextView.text = title_name
        detailDescriptionTextView.text = body_post
        lvCsImage.setImageResource(photo)
        lvCsPost.setImageResource(post)


        val back_from_detail = findViewById<ImageView>(R.id.link_back_news)

        back_from_detail.setOnClickListener {
            val intent = Intent(this, Photos::class.java)
            startActivity(intent)
        }

    }
}