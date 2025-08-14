package com.javanautaherbert.cadastro_usuario.business;


import com.javanautaherbert.cadastro_usuario.infrastructure.entitys.Usuario;
import com.javanautaherbert.cadastro_usuario.infrastructure.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService { //14:31


    private final UsuarioRepository repository;

    public UsuarioService (UsuarioRepository repository){
        this.repository = repository;

    }

    public void salvarUsuario(Usuario usuario){
        repository.saveAndFlush(usuario);

    }

    public Usuario buscarUsuarioPorEmail(String email){

        return null;
    }


}
