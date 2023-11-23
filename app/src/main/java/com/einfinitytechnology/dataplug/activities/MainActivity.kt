package com.einfinitytechnology.dataplug.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.einfinitytechnology.dataplug.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        val webView: WebView = findViewById(R.id.webView)

        webView.apply {

        }
    }
}