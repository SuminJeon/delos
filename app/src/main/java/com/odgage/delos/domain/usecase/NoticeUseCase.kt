package com.odgage.delos.domain.usecase

import com.odgage.delos.domain.model.Notice
import io.reactivex.Completable
import io.reactivex.Single

class NoticeUseCase(private val noticeUseCase: NoticeUseCase) {

    fun getLatestGroupNotice(groupId: Int): Single<Notice> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

    }

    fun getAllGroupNotice(groudId: Int): Single<List<Notice>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

    }

    fun createGroupNotice(groupId: Int, description: String): Completable {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

    }

    fun changeGroupNotice(groupNoticeId: Integer, description: String): Completable {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

    }

    fun deleteGroupNotice(groupNoticeId: Integer): Completable {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

    }
}