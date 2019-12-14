package com.example.projetolista

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, postos)
        var lista = findViewById(R.id.lstpostos) as ListView
        lista.adapter = adapter

        lista.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this@MainActivity, ListaInfo::class.java)
            intent.putExtra("Posto", postos[position])
            startActivity(intent)

        }

    }

    companion object {
        internal val postos = arrayOf(Posto("Posto Tiger", 2.32,1.45),
            Posto("Posto Sé", 2.32,1.45),
            Posto("Posto Teste", 2.32,1.45))
    }
}
