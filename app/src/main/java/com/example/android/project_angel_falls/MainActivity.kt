package com.example.android.project_angel_falls

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.databinding.DataBindingUtil
import com.example.android.project_angel_falls.databinding.ActivityMainBinding
import com.example.android.project_angel_falls.fragments.BlankFragment

import com.example.android.project_angel_falls.fragments.SubscriptionsFragment
import com.example.android.project_angel_falls.fragments.adapter.ViewPagerAdapter
import com.example.android.project_angel_falls.fragments.RentalsFragment
import com.example.morescreen.more_screen
import com.example.morescreen.tariff
import kotlinx.android.synthetic.main.fragment_blank.*


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
        adapter.addFragment(RentalsFragment(), "Rentals")
        adapter.addFragment(tariff(), "Subscriptions")
        adapter.addFragment(more_screen(), "More")


        binding.viewPager.adapter = adapter
        binding.tabs.setupWithViewPager(binding.viewPager)
        binding.tabs.getTabAt(0)!!.setIcon(R.drawable.rent)
        binding.tabs.getTabAt(1)!!.setIcon(R.drawable.subs)
        binding.tabs.getTabAt(2)!!.setIcon(R.drawable.ic_baseline_more_24)

    }

}
