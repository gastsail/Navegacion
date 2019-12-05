package com.gaston.navigationdemo.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gaston.navigationdemo.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun goToDispositivos(){
        startActivity(Intent(this,DispositivosActivity::class.java))
        finish()
    }
}
