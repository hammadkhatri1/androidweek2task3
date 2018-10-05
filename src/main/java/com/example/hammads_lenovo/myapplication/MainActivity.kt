package com.example.hammads_lenovo.myapplication

import android.app.Application
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_2.*
import java.util.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
    }

    // fun FindAgeEvent(view:View){
   //      var dobgiven=ageText.text.toString().toInt()
  //       val myAge=Calendar.getInstance().get(Calendar.YEAR)-dobgiven
 //        YourAge.text="age is $myAge"

 //   }
    companion object {


     const val name1: String = "name"
     const val usn: String = "username"
     const val pwd: String = "password"
     const val nmc: String = "numcode"
     const val rn: String = "restnm"
     const val spinf: String = "spinner"
 }
    fun SendBioData(view:View){
        var intent=Intent(this@MainActivity,Activity2::class.java)

        intent.putExtra(name1,namefield.text.toString())
        intent.putExtra(usn,usernameField.text.toString())
        intent.putExtra(pwd,passwordfield.text.toString())
        intent.putExtra(nmc,Numcode.text.toString())
        intent.putExtra(rn,restNum.text.toString())
        intent.putExtra(spinf,spinner.selectedItem.toString())

        startActivity(intent)

       }
}

