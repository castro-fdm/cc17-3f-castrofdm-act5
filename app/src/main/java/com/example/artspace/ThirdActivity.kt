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

class ThirdActivity : AppCompatActivity() {

    private lateinit var third_activity_image_title: TextView
    private lateinit var third_activity_image_auth: TextView
    private lateinit var third_activity_next_button: Button
    private lateinit var third_activity_prev_button: Button
    private lateinit var third_activity_image: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        third_activity_image_title = findViewById(R.id.third_image_title)
        third_activity_image_auth = findViewById(R.id.third_image_auth)
        third_activity_next_button = findViewById(R.id.third_button_next)
        third_activity_prev_button = findViewById(R.id.third_button_prev)
        third_activity_image = findViewById(R.id.thirdImage)

        third_activity_image.setImageResource(R.drawable.wanderer_above_the_sea_of_fog)
        third_activity_image_title.text = "Wanderer above the Sea of Fog".trimIndent()
        third_activity_image_auth.text = "Caspar David Friedrich (1818)".trimIndent()

        third_activity_prev_button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        third_activity_next_button.setOnClickListener {
            val intent = Intent(this, FourthActivity::class.java)
            startActivity(intent)
        }

    }
}