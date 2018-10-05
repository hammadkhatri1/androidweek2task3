package com.example.hammads_lenovo.myapplication
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_6.*

class Activity2 :AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_6)
            val intent: Intent = getIntent()

            val name: String = intent.getStringExtra(MainActivity.name1)
            val usn: String = intent.getStringExtra(MainActivity.usn)
            val spinf: String = intent.getStringExtra(MainActivity.spinf)
            val nmc: String = intent.getStringExtra(MainActivity.nmc)
            val rn: String = intent.getStringExtra(MainActivity.rn)

            nameff.text=name
            username.text=usn
            spinnerf.text=spinf
            number.text=nmc+rn
        }

}