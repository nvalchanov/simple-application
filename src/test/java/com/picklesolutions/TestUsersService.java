package com.picklesolutions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUsersService {

    @Test
    public void testCount() {

        UsersService service = new UsersService();

        assertEquals(10, service.count());
    }

    @Test
    public void testAuthentication() {

        UsersService service = new UsersService();

        assertEquals(true, service.authenticateUser("nikiv", "nikipass"));
    }
}
