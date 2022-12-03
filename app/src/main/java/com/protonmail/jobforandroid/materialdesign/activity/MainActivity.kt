package com.protonmail.jobforandroid.materialdesign.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.protonmail.jobforandroid.materialdesign.R
import com.protonmail.jobforandroid.materialdesign.databinding.ActivityMainBinding
import com.protonmail.jobforandroid.materialdesign.fragments.DeliveryFragment
import com.protonmail.jobforandroid.materialdesign.fragments.HomeFragment
import com.protonmail.jobforandroid.materialdesign.fragments.SettingFragment
import com.protonmail.jobforandroid.materialdesign.fragments.ShopListFragment

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.content, HomeFragment())
            .commit()

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
}