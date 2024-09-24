package com.example.artspace

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.TextView
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var first_activity_image_title: TextView
    private lateinit var first_activity_image_auth: TextView
    private lateinit var first_activity_next_button: Button
    private lateinit var first_activity_prev_button: Button
    private lateinit var first_activity_image: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        first_activity_image_title = findViewById(R.id.first_image_title)
        first_activity_image_auth = findViewById(R.id.first_image_auth)
        first_activity_next_button = findViewById(R.id.first_button_next)
        first_activity_image = findViewById(R.id.firstImage)

        first_activity_image.setImageResource(R.drawable.impression__sunrise)
        first_activity_image_title.text = "Impression, Sunrise".trimIndent()
        first_activity_image_auth.text = "Claude Monet (1872)".trimIndent()

        first_activity_next_button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }


    }
}