package com.odgage.delos.domain.repository

import com.odgage.delos.domain.model.Survey
import io.reactivex.Single

interface SurveyRepository {
    fun getMainSurvery() : Single<Survey>
}

/*
Main View
- 메인설문얻기 / getMainSurvey / _ / single<List<Survey>>
*/
