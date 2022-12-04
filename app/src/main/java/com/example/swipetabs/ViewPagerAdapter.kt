package com.example.swipetabs

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class ViewPagerAdapter (fm : FragmentManager) : FragmentStatePagerAdapter(fm){
    private val fragmentsOF = ArrayList<Fragment>()
    private val titles = ArrayList<String>()
    override fun getCount() = fragmentsOF.size
    override fun getItem(position: Int) = fragmentsOF[position]
    override fun getPageTitle(position: Int) = titles[position]
    fun addFragment(fragment:Fragment,title:String){
        fragmentsOF.add(fragment)
        titles.add(title)
    }
}