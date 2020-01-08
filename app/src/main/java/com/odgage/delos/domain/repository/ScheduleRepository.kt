package com.odgage.delos.domain.repository

import com.odgage.delos.domain.model.Schedule
import io.reactivex.Single

interface ScheduleRepository {
    fun getUserSchedule() : Single<List<Schedule>>

    fun getGroupSchedule(groupId : Int) : Single<List<Schedule>>
}

/*
Main View
- 나의 일정 얻기 / getUserSchedule / _ / single<List<Schedule>>

GroupDetail View
- 팀 일정 / getGroupSchedule / groupId / single<List<Schedule>>
*/