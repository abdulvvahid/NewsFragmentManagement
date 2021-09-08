package com.noor.newsfragmentmanagement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import java.util.*

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Timer().schedule(object : TimerTask() {
            override fun run() {
                startActivity(Intent(this@SplashScreenActivity, MainActivity::class.java))
                finish()
            }
        }, 500)

    }
}