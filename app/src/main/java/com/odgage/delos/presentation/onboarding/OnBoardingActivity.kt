package com.odgage.delos.presentation.onboarding

import android.os.Bundle
import com.odgage.delos.R
import com.odgage.delos.databinding.ActivityOnboardingBinding
import com.odgage.delos.presentation.base.BaseActivity
import com.odgage.delos.presentation.bindColor
import com.odgage.delos.presentation.main.MainActivity
import com.odgage.delos.presentation.splash.SplashViewModel
import com.odgage.delos.presentation.startActivityWithFinish
import org.koin.androidx.viewmodel.ext.android.viewModel

class OnBoardingActivity : BaseActivity<ActivityOnboardingBinding>(){
    override val resourceId: Int = R.layout.activity_onboarding
    override val statusBarColor: Int by bindColor(android.R.color.white)

    private val vm: OnBoardingViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.next.setOnClickListener {
            startActivityWithFinish<MainActivity>()
        }
    }
}