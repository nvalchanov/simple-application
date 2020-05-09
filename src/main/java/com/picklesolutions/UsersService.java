package com.picklesolutions;

public class UsersService {

    public int count() {
        return 10;
    }

    public Boolean authenticateUser(String username, String password) {

        if (username == "admin" && password == "adminpass") {
            return true;
        }

        return false;
    }
}
