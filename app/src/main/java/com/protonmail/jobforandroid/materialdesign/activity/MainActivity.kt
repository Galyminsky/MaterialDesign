package com.protonmail.jobforandroid.materialdesign.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.protonmail.jobforandroid.materialdesign.R
import com.protonmail.jobforandroid.materialdesign.databinding.ActivityMainBinding
import com.protonmail.jobforandroid.materialdesign.fragments.*

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        setSupportActionBar(binding?.topAppBar)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.content, HomeFragment())
            .commit()

        appBar()
        bottomNav()
    }

    private fun bottomNav() {
        binding?.nav?.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.menu_home -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.content, HomeFragment())
                        .commit()
                }
                R.id.menu_shoplist -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.content, ShopListFragment())
                        .commit()
                }
                R.id.menu_delivery -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.content, DeliveryFragment())
                        .commit()
                }
                R.id.menu_settings -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.content, SettingFragment())
                        .commit()
                }
            }
            return@setOnItemSelectedListener true
        }
    }

    private fun appBar() {
        binding?.topAppBar?.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.top_menu_favorite -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.content, FavoriteFragment())
                        .commit()
                }
                R.id.top_menu_help -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.content, HelpFragment())
                        .commit()
                }
            }
            return@setOnMenuItemClickListener true
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val menuInflater = menuInflater
        menuInflater.inflate(R.menu.top_menu, menu)
        return true
    }
}
