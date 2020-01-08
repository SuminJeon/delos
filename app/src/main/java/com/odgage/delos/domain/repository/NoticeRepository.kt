package com.odgage.delos.domain.repository

import com.odgage.delos.domain.model.Notice
import io.reactivex.Single

interface NoticeRepository{
    fun getGroupLatestNotice(groupId : Int) : Single<Notice>
}

/*
GroupDetail View
- 가장 최근 공지 / getGroupLatestNotice / groupId / single<Notice>

*/