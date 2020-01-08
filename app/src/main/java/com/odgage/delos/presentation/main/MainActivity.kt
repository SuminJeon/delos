package com.odgage.delos.presentation.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.odgage.delos.R
import com.odgage.delos.databinding.ActivityMainBinding
import com.odgage.delos.presentation.base.BaseActivity
import com.odgage.delos.presentation.bindColor
import com.odgage.delos.presentation.main.fragment.AlertFragment
import com.odgage.delos.presentation.main.fragment.HomeFragment
import com.odgage.delos.presentation.main.fragment.MyCalendarFragment
import com.odgage.delos.presentation.main.fragment.SettingFragment
import com.odgage.delos.presentation.splash.SplashViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override val resourceId: Int = R.layout.activity_main
    override val statusBarColor: Int by bindColor(android.R.color.white)

    private val vm: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.viewPager.apply {
            adapter = MainAdapter(supportFragmentManager).apply {
                add(HomeFragment(), "홈")
                add(MyCalendarFragment(), "내 캘린더")
                add(AlertFragment(), "알림")
                add(SettingFragment(), "설정")
            }
        }

        binding.tabLayout.setupWithViewPager(binding.viewPager)
    }
}

class MainAdapter(fm: FragmentManager) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val fragmentList : MutableList<Fragment> = arrayListOf()
    private val titleList : MutableList<String> = arrayListOf()

    fun add(fragment: Fragment, title: String) {
        fragmentList.add(fragment)
        titleList.add(title)
    }

    override fun getItem(position: Int): Fragment {
        return fragmentList[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return titleList[position]
    }

    override fun getCount(): Int {
        return fragmentList.size
    }

    override fun getItemPosition(`object`: Any): Int {
        return POSITION_NONE
    }
}