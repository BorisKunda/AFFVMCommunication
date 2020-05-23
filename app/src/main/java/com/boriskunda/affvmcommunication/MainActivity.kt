package com.boriskunda.affvmcommunication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.container, AFragment()).commit()

        val sharedViewModel: SharedViewModel =
            ViewModelProvider(this).get(SharedViewModel::class.java)

        sharedViewModel.openFrB.observe(this, Observer {
            supportFragmentManager.beginTransaction().replace(R.id.container, BFragment()).commit()
        })

    }
}
