package com.example.criminalintent

import android.icu.text.DateFormat
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText

class CrimeFragment : Fragment() {
    private lateinit var mCrime: Crime
    private lateinit var mDateButton: Button
    private lateinit var mSolvedCheckBox: CheckBox


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mCrime = Crime()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v: View = inflater.inflate(R.layout.fragment_crime, container, false)

        val mTitleField: EditText = v.findViewById<EditText>(R.id.crime_title)
        mTitleField.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // This space intentionally left blank
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                mCrime.setTitle(s.toString())
            }

            override fun afterTextChanged(s: Editable?) {
                // This space intentionally left blank
            }
        })

        mDateButton = v.findViewById(R.id.crime_date)
        mDateButton.text = DateFormat.getPatternInstance(DateFormat.YEAR_MONTH_WEEKDAY_DAY).format(mCrime.getDate())
        mDateButton.isEnabled = false

        mSolvedCheckBox = v.findViewById(R.id.crime_solved)
        mSolvedCheckBox.setOnCheckedChangeListener { _, isChecked ->
            mCrime.setSolved(isChecked)
        }

        return v
    }
}