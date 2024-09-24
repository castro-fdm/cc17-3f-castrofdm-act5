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

class SecondActivity : AppCompatActivity() {

    private lateinit var second_activity_image_title: TextView
    private lateinit var second_activity_image_auth: TextView
    private lateinit var second_activity_next_button: Button
    private lateinit var second_activity_prev_button: Button
    private lateinit var second_activity_image: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        second_activity_image_title = findViewById(R.id.second_image_title)
        second_activity_image_auth = findViewById(R.id.second_image_auth)
        second_activity_next_button = findViewById(R.id.second_button_next)
        second_activity_prev_button = findViewById(R.id.second_button_prev)
        second_activity_image = findViewById(R.id.secondImage)

        second_activity_image.setImageResource(R.drawable.mural_del_gernika)
        second_activity_image_title.text = "Guernica".trimIndent()
        second_activity_image_auth.text = "Pablo Picasso (1937)".trimIndent()

        second_activity_prev_button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        second_activity_next_button.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }

    }

}