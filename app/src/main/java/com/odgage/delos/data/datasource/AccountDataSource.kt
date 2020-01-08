package com.odgage.delos.data.datasource

import io.reactivex.Completable

interface AccountLocalDataSource{

}

interface AccountRemoteDataSource{
    fun loginByKakao() : Completable
}