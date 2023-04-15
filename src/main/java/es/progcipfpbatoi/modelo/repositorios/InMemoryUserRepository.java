package es.progcipfpbatoi.modelo.repositorios;

import es.progcipfpbatoi.modelo.entidades.Dni;
import es.progcipfpbatoi.modelo.entidades.User;

import java.util.ArrayList;

public class InMemoryUserRepository implements UsuariosRepository{
    private ArrayList<User> usersList;

    @Override
    public boolean save(User user) {
        if ( usersList.contains( user ) ){
            return false;
        }
        usersList.add( user );
        return true;
    }

    @Override
    public ArrayList<User> findAll() {
        return usersList;
    }

    @Override
    public User find(Dni dni) {
        for ( User user :
                usersList ) {
            if ( user.getDni().equals( dni ) ){
                return user;
            }
        }
        return null;
    }
}
