package com.example.projetolista

import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_lista_info2.*

class ListaInfo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_info2)

        val intent = intent
        if (intent != null) {
            val p = intent.getSerializableExtra("Posto") as Posto

        if (p.gasolina * 0.7 > p.alcool) {
            resultado.setText("Álcool!")
        } else {
            resultado.setText("Gasolina!")
        }
    }

}
