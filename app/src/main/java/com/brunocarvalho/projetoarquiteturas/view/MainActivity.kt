package com.brunocarvalho.projetoarquiteturas.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.brunocarvalho.projetoarquiteturas.R
import com.brunocarvalho.projetoarquiteturas.controller.UsuarioController
import com.brunocarvalho.projetoarquiteturas.databinding.ActivityMainBinding
import com.brunocarvalho.projetoarquiteturas.model.Usuario

class MainActivity : AppCompatActivity() {

    private lateinit var usuarioController: UsuarioController

    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        usuarioController = UsuarioController(this)
        //usuarioController.recuperarUsuarios() //Forma Ativa de recuperar os dados (A View que está fazendo)

        binding.btnRecuperar.setOnClickListener {
            usuarioController.recuperarUsuarios()
        }
    }

    //Passiva
    fun exibirUsuarios(lista: List<Usuario>){

        var textoUsuarios = ""
        //Exibir os dados
        lista.forEach{ usuario ->
            textoUsuarios += "${usuario.nome} - ${usuario.idade} \n"
        }

        binding.textResultado.text = textoUsuarios

    }
}