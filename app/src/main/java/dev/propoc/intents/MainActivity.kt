package dev.propoc.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

const val NOMBRE_MSSGE = "dev.propoc.intents.NOMBRE"

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navega_btn.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        var nombre = nombre_edtxt.text.toString()
        var navegar = Intent(this, SecondActivity::class.java).apply {
            putExtra(NOMBRE_MSSGE, nombre)
        }
        startActivity(navegar)
    }
}
