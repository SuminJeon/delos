package com.odgage.delos.domain.usecase

import com.odgage.delos.domain.model.Todo
import com.odgage.delos.domain.repository.TodoRepository
import io.reactivex.Completable
import io.reactivex.Single

class TodoUseCase(private val todoRepository: TodoRepository) {
    fun getGroupTodo(groupId: Int): Single<List<Todo>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

    }

    fun createGroupTodo(groupId: Int, todo: Todo): Completable {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

    }

    fun changeGroupTodo(groupBoardId: Int, todo: Todo): Completable {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

    }

    fun deleteGroupTodo(groupBoardId: Int): Completable {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

    }
}
