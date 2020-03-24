package com.asterisks.agoramockup.Dashboard

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.asterisks.agoramockup.R
import com.asterisks.agoramockup.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(){

    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        mainBinding.mainBottomNav.setOnNavigationItemSelectedListener { item ->
            openFragment(item.itemId)
            true
        }
        mainBinding.mainBottomNav.selectedItemId = R.id.dashboard_nav
    }

    private fun openFragment(id : Int){
        val tag = id.toString()
        var fragment = supportFragmentManager.findFragmentByTag(tag) ?: when(id){
            R.id.dashboard_nav-> DashboardFragment()
            R.id.account_nav-> AccountFragment()
            else -> null
        }
        when(id){
            R.id.account_nav-> mainBinding.mainToolbar.title = getString(R.string.title_account)
            R.id.dashboard_nav -> mainBinding.mainToolbar.title = getString(R.string.title_dashboard)
        }

        if(fragment != null ){
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.navHost,fragment,tag)
                .commit()
        }
    }
}