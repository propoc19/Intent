package dev.propoc.intents

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.second_activity.*

class SecondActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val mensaje = intent.getStringExtra(NOMBRE_MSSGE)
        saludo_tv.text = if (mensaje!="") "Hola ${mensaje}" else "Hola extraño"
    }
}