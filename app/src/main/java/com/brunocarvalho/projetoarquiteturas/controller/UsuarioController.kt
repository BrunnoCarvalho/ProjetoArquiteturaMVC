package com.brunocarvalho.projetoarquiteturas.controller

import com.brunocarvalho.projetoarquiteturas.model.Usuario
import com.brunocarvalho.projetoarquiteturas.model.api.UsuarioAPI
import com.brunocarvalho.projetoarquiteturas.view.MainActivity

class UsuarioController(private val mainActivity: MainActivity) {

    private val usuarioAPI = UsuarioAPI()

    init {
        //recuperarUsuarios() // Sempre que instânciar na activity main ele executa esta função
    }

    fun recuperarUsuarios(){

        //1) Regra de negócio
        val lista = usuarioAPI.recuperarUsuarios()
        //2) Exibir na interface. O controller é a ponte entre regras de negócio e exibição na interface.
        mainActivity.exibirUsuarios(lista)
    }
}