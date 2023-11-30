package com.example.criminalintent

import android.content.Context
import java.util.UUID

class CrimeLab() {
    private var sCrimeLab: CrimeLab? = null
    private var mCrimes: MutableList<Crime> = mutableListOf()

    init {
        for (i in 0 until 100) {
            val crime: Crime = Crime()
            crime.setSolved(i % 2 == 0)
            crime.setTitle("Crime # $i")

            mCrimes += crime
        }
    }

    fun get(context: Context): CrimeLab {
        if (sCrimeLab == null) {
            sCrimeLab = CrimeLab()
        }

        return sCrimeLab!!
    }

    fun getCrime(id: UUID): Crime? {
        for (crime in mCrimes) {
            if (crime.getID() == id) {
                return crime
            }
        }

        return null
    }
}