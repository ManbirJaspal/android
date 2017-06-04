package com.example.manbir.startup

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

open class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // getmyage.setOnClickListener( View.OnClickListener {     //setOnClickListener is used when the button needs to be clickable


       //})
    }

     fun BuClickEvent(view: View) {

        //fires on click of button

        val userDOB:String = DOB.text.toString()            //Reading input

        val year:Int = Calendar.getInstance().get(Calendar.YEAR)   //taking current year from system calendar
        val myAge = year-userDOB.toInt()
        tvShowAge.text = "Your age is " + myAge
    }

}

