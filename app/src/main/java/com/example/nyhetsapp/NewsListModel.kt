package com.example.nyhetsapp

data class NewsListModel(
    val artikkel_id: String,
    val tittel: String,
    val beskrivelse: String,
    val link: String,
    val tidspunkt: String,
    val avis_navn: String,
    val antall_kmt: String,
    val bilde: Int
)