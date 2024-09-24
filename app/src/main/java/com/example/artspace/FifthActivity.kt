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

class FifthActivity : AppCompatActivity() {

    private lateinit var fifth_activity_image_title: TextView
    private lateinit var fifth_activity_image_auth: TextView
    private lateinit var fifth_activity_prev_button: Button
    private lateinit var fifth_activity_image: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fifth)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        fifth_activity_image_title = findViewById(R.id.fifth_image_title)
        fifth_activity_image_auth = findViewById(R.id.fifth_image_auth)
        fifth_activity_prev_button = findViewById(R.id.fifth_button_prev)
        fifth_activity_image = findViewById(R.id.fifthImage)

        fifth_activity_image.setImageResource(R.drawable.the_girls_of_avignon)
        fifth_activity_image_title.text = "Les Demoiselles d’Avignon".trimIndent()
        fifth_activity_image_auth.text = "Pablo Picasso (1907)".trimIndent()

        fifth_activity_prev_button.setOnClickListener {
            val intent = Intent(this, FourthActivity::class.java)
            startActivity(intent)
        }

    }
}