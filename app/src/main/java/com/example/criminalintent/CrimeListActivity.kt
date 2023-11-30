package com.example.criminalintent

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager

class CrimeListActivity : SingleFragmentActivity() {
    protected override fun createFragment(): Fragment {
        return CrimeListFragment()
    }
}
