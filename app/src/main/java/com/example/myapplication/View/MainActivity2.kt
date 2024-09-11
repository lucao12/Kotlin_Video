package com.example.myapplication.View

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Adapter.PessoaAdapter
import com.example.myapplication.Dao.PessoasDao
import com.example.myapplication.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity2 : AppCompatActivity(R.layout.activity_main2) {
    val dao = PessoasDao()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val fabVolta = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        val rvUsuarios = findViewById<RecyclerView>(R.id.rc_Pessoa)

        val usuarios = dao.obterLista()

        rvUsuarios.layoutManager = LinearLayoutManager(this)

        rvUsuarios.adapter = PessoaAdapter(usuarios)

        fabVolta.setOnClickListener {
            finish()
        }
    }
}