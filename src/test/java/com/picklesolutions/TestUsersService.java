package com.picklesolutions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUsersService {

    @Test
    public void testCount() {

        UsersService service = new UsersService();

        assertEquals(1, service.count());
    }
}
