package com.example.tugas_4page

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.tugas_4page.bottomsheet.F_dev_bottomsheet

class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        window.statusBarColor = this.resources.getColor(R.color.dark)

        val imageView = findViewById(R.id.link_back_home6) as ImageView
        imageView.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        val btnShowBottomSheet: Button = findViewById(R.id.button_about_show_imgDev)

        // Set OnClickListener for the button
        btnShowBottomSheet.setOnClickListener {
            // Show the BottomSheetDialogFragment when the button is clicked
            val bottomSheetFragment = F_dev_bottomsheet()
            bottomSheetFragment.show(supportFragmentManager, bottomSheetFragment.tag)
        }

    }
}