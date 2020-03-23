package com.asterisks.agoramockup

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.asterisks.agoramockup.databinding.ActivityOtpBinding

class OtpActivity : AppCompatActivity(){

    private lateinit var otpBinding:ActivityOtpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        otpBinding = ActivityOtpBinding.inflate(layoutInflater)
        setContentView(otpBinding.root)

        setSupportActionBar(otpBinding.otpToolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        title = getString(R.string.title_otp)
        supportActionBar?.setDisplayShowHomeEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}