package com.asterisks.agoramockup

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.asterisks.agoramockup.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity(){

    private lateinit var loginBinding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(loginBinding.root)

        setSupportActionBar(loginBinding.loginToolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        title = getString(R.string.title_login)
        supportActionBar?.setDisplayShowHomeEnabled(true)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}