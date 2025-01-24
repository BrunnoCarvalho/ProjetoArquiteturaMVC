package com.brunocarvalho.projetoarquiteturas.model.api

import com.brunocarvalho.projetoarquiteturas.model.Usuario

class UsuarioAPI {

    fun recuperarUsuarios(): List<Usuario>{
        return listOf(
            Usuario("Bruno", 30),
            Usuario("Maria", 20),
            Usuario("Pedro", 56),
            Usuario("Ana", 37)
        )
    }
}