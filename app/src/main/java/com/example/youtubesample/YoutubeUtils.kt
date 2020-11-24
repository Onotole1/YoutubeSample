package com.example.youtubesample

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerCallback
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView

inline fun YouTubePlayerView.doWhenReady(crossinline listener: (YouTubePlayer) -> Unit) {
    getYouTubePlayerWhenReady(object : YouTubePlayerCallback {
        override fun onYouTubePlayer(youTubePlayer: YouTubePlayer) {
            listener(youTubePlayer)
        }
    })
}
