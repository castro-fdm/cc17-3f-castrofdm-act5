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

class FourthActivity : AppCompatActivity() {

    private lateinit var fourth_activity_image_title: TextView
    private lateinit var fourth_activity_image_auth: TextView
    private lateinit var fourth_activity_next_button: Button
    private lateinit var fourth_activity_prev_button: Button
    private lateinit var fourth_activity_image: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fourth)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        fourth_activity_image_title = findViewById(R.id.fourth_image_title)
        fourth_activity_image_auth = findViewById(R.id.fourth_image_auth)
        fourth_activity_next_button = findViewById(R.id.fourth_button_next)
        fourth_activity_prev_button = findViewById(R.id.fourth_button_prev)
        fourth_activity_image = findViewById(R.id.fourthImage)

        fourth_activity_image.setImageResource(R.drawable.mona_lisa)
        fourth_activity_image_title.text = "Mona Lisa".trimIndent()
        fourth_activity_image_auth.text = "Leonardo da Vinci (1503)".trimIndent()

        fourth_activity_prev_button.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }

        fourth_activity_next_button.setOnClickListener {
            val intent = Intent(this, FifthActivity::class.java)
            startActivity(intent)
        }

    }
}