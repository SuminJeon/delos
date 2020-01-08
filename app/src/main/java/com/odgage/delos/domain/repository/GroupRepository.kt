package com.odgage.delos.domain.repository

import com.odgage.delos.domain.model.Group
import io.reactivex.Single

interface GroupRepository {
    fun getUserGroup() : Single<Group>

}

/*
Main View
- 나의 소속 그룹 얻기 / getUserGroup / _ / single<List<Group>>
*/