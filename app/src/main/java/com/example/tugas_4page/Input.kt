package com.example.tugas_4page

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner

import android.widget.Toast

class Input : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input)
        window.statusBarColor = this.resources.getColor(R.color.dark)

        val imageView = findViewById(R.id.link_back_home3) as ImageView
        imageView.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        val company = arrayOf("PT RAJAWALI DIGITAL", "PT CEGAH RUGI", "PT ZEUS GACOR", "PT GA BAKAL KEMALINGAN")
        val spinner = findViewById<Spinner>(R.id.spinner_company)
        val arrayAdapter = ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item, company)
        arrayAdapter.setDropDownViewResource(R.layout.text_spinner)
        spinner.adapter = arrayAdapter
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(applicationContext,"selected company " +company[position],Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

    }
}