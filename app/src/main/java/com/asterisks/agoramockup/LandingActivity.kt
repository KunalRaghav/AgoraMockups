package com.asterisks.agoramockup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.asterisks.agoramockup.databinding.ActivityLandingBinding
import kotlinx.android.synthetic.main.activity_landing.*

class LandingActivity : AppCompatActivity() {

    private lateinit var landingBinding: ActivityLandingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        landingBinding = ActivityLandingBinding.inflate(layoutInflater)
        setContentView(landingBinding.root)


        landingBinding.loginButton.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

        landingBinding.signupButton.setOnClickListener {
            startActivity(Intent(this, SignupActivity::class.java))
        }


    }


}
