package com.example.android.project_angel_falls

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.databinding.DataBindingUtil
import com.example.android.project_angel_falls.databinding.ActivityMainBinding
import com.example.android.project_angel_falls.fragments.BuySellFragment
import com.example.android.project_angel_falls.fragments.ExchangeFragment
import com.example.android.project_angel_falls.fragments.RentFragment
import com.example.android.project_angel_falls.fragments.adapter.ViewPagerAdapter
import com.example.android.project_angel_falls.fragments.homeFragment
import com.google.firebase.auth.FirebaseAuth


@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setUpTabs()
        window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
    }

    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(homeFragment(), "Home")
        adapter.addFragment(BuySellFragment(), "Buy/Sell")
        adapter.addFragment(ExchangeFragment(), "Exchange")
        adapter.addFragment(RentFragment(), "Rent")
        binding.viewPager.adapter = adapter
        binding.tabs.setupWithViewPager(binding.viewPager)

        binding.tabs.getTabAt(0)!!.setIcon(R.drawable.home)
        binding.tabs.getTabAt(1)!!.setIcon(R.drawable.buysell)
        binding.tabs.getTabAt(2)!!.setIcon(R.drawable.exchange)
        binding.tabs.getTabAt(3)!!.setIcon(R.drawable.rent)

    }

}
