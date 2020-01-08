package com.odgage.delos.domain.repository

import com.odgage.delos.domain.model.Account
import io.reactivex.Completable
import io.reactivex.Single

interface AccountRepository{
    fun loginKakao(token: String) : Completable

    fun getUserAccount() : Single<Account>
}

/*
Login View
- 카카오 계정 로그인 / loginKakao / token: String / completable
- 유저 계정정보 얻기 / getUserAccount / _ / single<Account>

*/