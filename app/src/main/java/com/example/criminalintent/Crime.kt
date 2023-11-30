package com.example.criminalintent

import java.util.Date
import java.util.UUID

class Crime() {
    private val mID: UUID = UUID.randomUUID()
    private lateinit var mTitle: String
    private var mDate: Date = Date()
    private var mSolved: Boolean = false

    fun isSolved(): Boolean {
        return mSolved
    }

    fun setSolved(solved: Boolean) {
        mSolved = solved
    }

    fun getDate(): Date {
        return mDate
    }

    fun setDate(date: Date) {
        mDate = date
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