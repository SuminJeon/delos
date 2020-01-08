package com.odgage.delos.domain.repository

import com.odgage.delos.domain.model.Todo
import io.reactivex.Single

interface TodoRepository{
    fun getGroupTodo(groupId : Int) : Single<List<Todo>>
}

/*
GroupDetail View
- 팀 내 해야할 일 / getGroupTodo / groupId / single<List<Todo>>
*/

