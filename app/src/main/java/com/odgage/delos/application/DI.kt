package com.odgage.delos.application

import com.odgage.delos.presentation.login.LoginActivity
import com.odgage.delos.presentation.login.LoginViewModel
import com.odgage.delos.presentation.main.MainViewModel
import com.odgage.delos.presentation.onboarding.OnBoardingViewModel
import com.odgage.delos.presentation.splash.SplashViewModel
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

fun injectionFeature() = loadFeature

private val loadFeature by lazy{
    loadKoinModules(
        listOf(
            viewModelModule
        )
    )
}

internal val viewModelModule: Module = module{
    viewModel { SplashViewModel() }
    viewModel { LoginViewModel() }
    viewModel { OnBoardingViewModel() }
    viewModel { MainViewModel() }
}

internal val usecaseModule: Module = module{

}

internal val repositoryModule: Module = module{

}

internal val dataSourceModule: Module = module{

}

internal val remoteModule: Module = module{

}

internal val localModule: Module = module{

}

internal const val BASE_URL = "http://35.213.99.68:8080/"

internal val LogInterceptor = HttpLoggingInterceptor().apply {
    level = HttpLoggingInterceptor.Level.BODY
}

internal val client = OkHttpClient.Builder().apply {
    addNetworkInterceptor(LogInterceptor)

    connectTimeout(30, TimeUnit.SECONDS)
    readTimeout(30, TimeUnit.SECONDS)
}.build()

internal val retrofit: Retrofit =
    Retrofit.Builder()
        .client(client)
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
