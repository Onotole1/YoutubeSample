package com.example.youtubesample

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.example.youtubesample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        val videoId = "Lw2yBw6KsJs"
        with(binding.youtubeThumbnail) {
            loadPreview(videoId)
            initYoutubeView(videoId)
        }
    }
}
