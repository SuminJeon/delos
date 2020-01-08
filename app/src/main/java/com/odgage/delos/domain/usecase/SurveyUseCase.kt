package com.odgage.delos.domain.usecase

import com.odgage.delos.domain.model.Survey
import com.odgage.delos.domain.repository.SurveyRepository
import io.reactivex.Completable
import io.reactivex.Single

class SurveyUseCase(private val surveyRepository: SurveyRepository) {
    fun getMainSurvey(gender: String, age: Int): Single<List<Survey>> {
        //getSurvey랑 상호작용
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

    }

    fun getAllSurvey(gender: String, age: Int): Single<List<Survey>> {
        //getSurvey랑 상호작용
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

    }

    fun getMySurvey() : Single<List<Survey>>{
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

    }

    //논의 필요
    fun createSurvey() : Completable{
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

    }

    fun expireSurvey(surveyId: Int) : Completable {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

    }

    //논의 필요
    fun answerSurvey() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

    }

    fun updateSurvey(surveyId: Int) : Completable {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

    }

    //논의 필요
    fun getSurvey(surveyId: Integer) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

    }
}