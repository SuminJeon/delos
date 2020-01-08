package com.odgage.delos.domain.usecase

import com.odgage.delos.domain.model.Schedule
import com.odgage.delos.domain.repository.ScheduleRepository
import io.reactivex.Single

class ScheduleUseCase(private val scheduleRepository: ScheduleRepository){
    fun getUserSchedule() : Single<List<Schedule>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

    }

    /*fun getGroupSchedule(){

    }

    fun createGroupSchedule(){

    }

    fun changeGroupSchedule(){

    }

    fun deleteGroupSchedule(){

    }

    fun getPersonalSchedule(){

    }

    fun createPersonalSchedule(){

    }

    fun changePersonalSchedule(){

    }

    fun deletePersonalSchedule(){

    }*/
}