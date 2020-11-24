package com.example.youtubesample

import android.content.Intent
import android.net.Uri
import android.widget.ImageView
import android.widget.Toast
import coil.load

fun ImageView.loadPreview(videoId: String) {
    load("https://img.youtube.com/vi/$videoId/0.jpg")
}

fun ImageView.initYoutubeView(videoId: String) {
    setOnClickListener {
        Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=$videoId")).takeIf {
            it.resolveActivity(context.packageManager) != null
        }?.also {
            context.startActivity(it)
        } ?: run {
            Toast.makeText(context, "Youtube not found", Toast.LENGTH_SHORT).show()
        }
    }
}