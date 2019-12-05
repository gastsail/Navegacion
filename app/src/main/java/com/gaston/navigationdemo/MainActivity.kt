package com.gaston.navigationdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gaston.navigationdemo.ui.activities.DispositivosActivity
import com.gaston.navigationdemo.ui.activities.LoginActivity

class MainActivity : AppCompatActivity() {

    private val auth = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        goTo()
    }


    fun goTo() {
        if (auth) {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        } else {
            startActivity(Intent(this, DispositivosActivity::class.java))
            finish()
        }
    }
}
