package com.example.swipetabs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.swipetabs.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val adapter = ViewPagerAdapter(supportFragmentManager)

        adapter.addFragment(fr1(),"misalmeba")
        adapter.addFragment(fr2(),"txovna")
        adapter.addFragment(fr3(),"dasasruli")

        binding.viewPager.adapter = adapter
        binding.tbLayout.setupWithViewPager(binding.viewPager)
    }
}