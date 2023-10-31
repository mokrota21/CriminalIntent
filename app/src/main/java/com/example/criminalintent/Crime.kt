package com.example.criminalintent

import java.util.UUID

class Crime {
    private val mID: UUID
    private lateinit var mTitle: String

    constructor() {
        mID = UUID.randomUUID()
    }

    fun getID(): UUID {
        return mID
    }

    fun getTitle(): String {
        return mTitle
    }

    fun setTitle(title: String) {
        mTitle = title
    }

}