package com.odgage.delos.domain.usecase

import com.odgage.delos.domain.model.TimeTable
import com.odgage.delos.domain.repository.TimeTableRepository
import io.reactivex.Completable
import io.reactivex.Single
import java.sql.Time

class TimeTableUseCase (private val timeTableRespository : TimeTableRepository){
    //논의 필요
    fun getAvailableTeamTimeTable() : Single<List<TimeTable>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

    }

    fun getTimeTable() : Single<List<TimeTable>>{
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

    }

    fun createTimeTable(timeTable : TimeTable) : Completable{
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

    }

    fun changeTimeTable(timeTableId: Int, timeTable: TimeTable) : Completable{
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

    }

    fun deleteTimeTable(timeTableId: Integer) : Completable{
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

    }

}