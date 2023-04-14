package es.progcipfpbatoi.modelo.repositorios;

import es.progcipfpbatoi.modelo.entidades.User;

import java.util.ArrayList;

public interface UsuariosRepository {
    boolean save(User user);
    ArrayList<User> findAll();
    User find(User user);
}
