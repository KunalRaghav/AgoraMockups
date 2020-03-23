package com.asterisks.agoramockup

import android.content.Intent
import android.os.Bundle
import android.text.InputType
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.asterisks.agoramockup.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity(){

    private lateinit var signupBinding: ActivitySignupBinding
    val securityQuestionsArray = arrayOf("Question 1","Question 2", "Question 3", "Question 4")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        signupBinding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(signupBinding.root)


        setSupportActionBar(signupBinding.signupToolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        title = getString(R.string.title_sign_up)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        val adapter = ArrayAdapter(this, R.layout.dropdown_menu_popup_item, securityQuestionsArray)
        signupBinding.securityQuestionDropdown.inputType = InputType.TYPE_NULL
        signupBinding.securityQuestionDropdown.setText("Question 1")
        signupBinding.securityQuestionDropdown.setAdapter(adapter)

        signupBinding.signupButton.setOnClickListener {
            startActivity(Intent(this, OtpActivity::class.java))
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}