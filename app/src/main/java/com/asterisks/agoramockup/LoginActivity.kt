package com.asterisks.agoramockup

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.asterisks.agoramockup.Dashboard.MainActivity
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


        loginBinding.loginButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}