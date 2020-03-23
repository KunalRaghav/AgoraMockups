package com.asterisks.agoramockup.Dashboard

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.asterisks.agoramockup.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){

    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)


    }
}