package com.odgage.delos.presentation.login

import android.os.Bundle
import com.odgage.delos.R
import com.odgage.delos.databinding.ActivityLoginBinding
import com.odgage.delos.presentation.base.BaseActivity
import com.odgage.delos.presentation.bindColor
import com.odgage.delos.presentation.onboarding.OnBoardingActivity
import com.odgage.delos.presentation.splash.SplashViewModel
import com.odgage.delos.presentation.startActivityWithFinish
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginActivity : BaseActivity<ActivityLoginBinding>(){
    override val resourceId: Int = R.layout.activity_login
    override val statusBarColor: Int by bindColor(android.R.color.white)

    private val vm: LoginViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.next.setOnClickListener {
            startActivityWithFinish<OnBoardingActivity>()
        }

        binding.kakaoLogin.setOnClickListener {
            binding.comKakaoLogin.performClick()
        }
    }
}