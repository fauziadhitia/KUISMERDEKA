package com.example.latihan_intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.annotation.SuppressLint
import android.content.Intent


class MainActivity : AppCompatActivity(), View.OnClickListener {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnsatu: Button = findViewById(R.id.btnBukasatu)
        btnsatu.setOnClickListener(this)
        val btndua: Button = findViewById(R.id.btnBukadua)
        btndua.setOnClickListener(this)
        val btntiga: Button = findViewById(R.id.btnBukatiga)
        btntiga.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.btnBukasatu -> {
                val page1 = Intent(this, SatuActivity::class.java)
                startActivity(page1)

            }
            R.id.btnBukadua -> {
                val page2 = Intent(this, SatuActivity::class.java)
                startActivity(page2)
            }
            R.id.btnBukatiga -> {
                val page3 = Intent(this, SatuActivity::class.java)
                startActivity(page3)
            }
        }
    }
}