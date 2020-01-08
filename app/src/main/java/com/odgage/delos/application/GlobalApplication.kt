package com.odgage.delos.application

import android.app.Application
import android.content.Context
import com.kakao.auth.*
import com.kakao.auth.KakaoSDK

class GlobalApplication : Application() {

    init {
        instance = this
    }

    companion object {

        private var instance: GlobalApplication? = null

        fun applicationContext(): Context {
            return instance!!.applicationContext
        }
    }

    private class KakaoSDKAdapter : KakaoAdapter() {
        override fun getSessionConfig(): ISessionConfig {
            return object : ISessionConfig {
                override fun getAuthTypes(): Array<AuthType> {
                    return arrayOf(AuthType.KAKAO_LOGIN_ALL)
                }

                override fun isUsingWebviewTimer(): Boolean {
                    return false
                }

                override fun isSecureMode(): Boolean {
                    return false
                }

                override fun getApprovalType(): ApprovalType? {
                    return ApprovalType.INDIVIDUAL
                }

                override fun isSaveFormData(): Boolean {
                    return true
                }
            }
        }

        override fun getApplicationConfig(): IApplicationConfig {
            return IApplicationConfig { applicationContext() }
        }
    }

    override fun onCreate() {
        super.onCreate()
        KakaoSDK.init(KakaoSDKAdapter())
    }
}