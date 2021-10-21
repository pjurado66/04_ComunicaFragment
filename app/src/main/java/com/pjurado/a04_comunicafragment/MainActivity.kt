package com.pjurado.a04_comunicafragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import com.pjurado.a04_comunicafragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnComunicaListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .add(R.id.contenedor, ComunicaFragment())
            .commit()
    }

    override fun color(color: String) {
        Snackbar.make(binding.root, "He recibido el color $color", Snackbar.LENGTH_SHORT).show()
        Log.d("listener", "color")
    }

    override fun texto(texto: String) {
        Snackbar.make(binding.root, "He recibido el texto $texto", Snackbar.LENGTH_SHORT).show()
    }
}