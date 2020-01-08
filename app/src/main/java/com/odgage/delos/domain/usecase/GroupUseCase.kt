package com.odgage.delos.domain.usecase

import com.odgage.delos.domain.model.Group
import com.odgage.delos.domain.repository.GroupRepository
import io.reactivex.Completable
import io.reactivex.Single

class GroupUseCase(private val groupRepository: GroupRepository) {
    fun getUserGroup(): Single<List<Group>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun createGroup(name: String): Completable {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun joinGroup(code: String): Completable {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun deleteGroup(groudId: Int): Completable {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun changeGroupAlarm(groudId : Int): Completable{
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    /*fun getGroupMember() {

    }*/
}

