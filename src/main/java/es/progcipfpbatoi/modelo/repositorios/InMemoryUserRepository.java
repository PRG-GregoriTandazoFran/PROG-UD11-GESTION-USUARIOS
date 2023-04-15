package es.progcipfpbatoi.modelo.repositorios;

import es.progcipfpbatoi.modelo.entidades.User;

import java.util.ArrayList;

public class InMemoryUserRepository implements UsuariosRepository{
    private ArrayList<User> usersList;

    @Override
    public boolean save(User user) {
        return false;
    }

    @Override
    public ArrayList<User> findAll() {
        return null;
    }

    @Override
    public User find(String dni) {
        return null;
    }
}
