package com.example.guias

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {

    private val redBtn : Button
        get() = findViewById(R.id.btnRed)

    private val whiteBtn : Button
        get() = findViewById(R.id.btnWhite)

    private val layoutPrincipal : ConstraintLayout
        get() = findViewById(R.id.layoutPrincipal)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        redBtn.setOnClickListener{
            toast("Rojo")
            layoutPrincipal.setBackgroundColor(Color.RED)
        }

        whiteBtn.setOnClickListener{
            toast("Blanco")
            layoutPrincipal.setBackgroundColor(Color.WHITE)
        }
    }
    private fun toast(text: String, duration: Int = Toast.LENGTH_LONG)=
        Toast.makeText(this@MainActivity, text, Toast.LENGTH_LONG).show()
}