package com.example.guias

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        //Toast.makeText(this, session.user, Toast.LENGTH_SHORT).show()
        Toast.makeText(this, session.user.nombre, Toast.LENGTH_SHORT).show()
        //txtUserSession.text= session.user
        txtUserSession.text= "${session.user.nombre} ${session.user.apellido}"
    }
}