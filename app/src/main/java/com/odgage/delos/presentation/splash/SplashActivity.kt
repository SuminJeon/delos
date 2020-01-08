package com.odgage.delos.presentation.splash

import android.os.Bundle
import android.widget.Toast
import com.odgage.delos.R
import com.odgage.delos.application.GlobalApplication
import com.odgage.delos.application.injectionFeature
import com.odgage.delos.databinding.ActivitySplashBinding
import com.odgage.delos.presentation.base.BaseActivity
import com.odgage.delos.presentation.bindColor
import com.odgage.delos.presentation.login.LoginActivity
import com.odgage.delos.presentation.startActivityWithFinish
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.context.startKoin

class SplashActivity : BaseActivity<ActivitySplashBinding>() {
    override val resourceId: Int = R.layout.activity_splash
    override val statusBarColor: Int by bindColor(android.R.color.white)

    private val vm: SplashViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.next.setOnClickListener {
            startActivityWithFinish<LoginActivity>()
        }

        startKoin {
            androidContext(application)
            injectionFeature()
        }
    }
}