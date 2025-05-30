package com.example.music_app.models

data class SongModel(
    val id : String,
    val title : String,
    val artist : String,
    val url : String,
    val coverUrl : String,
) {
    constructor() : this("","","","","")
}
