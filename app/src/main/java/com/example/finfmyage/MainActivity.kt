package com.example.finfmyage

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*
import kotlin.math.floor

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun buttonClick(view:View) {
        val usrDOB = Integer.parseInt(editTextDate.text.toString())
        val currentYear = getToday()
        val userAgeInYear = floor((currentYear - usrDOB).toDouble() / 10000).toInt()
        textView.text = "Your age is $userAgeInYear Years"
        if (usrDOB.toString().length != 8) {
            textView.text = "Please enter DOB in 8 chapter"
        }
    }
    fun getToday(): Int {
        val date = Date()
        val format = SimpleDateFormat("yyyyMMdd", Locale.getDefault())
        return format.format(date).toInt()
    }
}