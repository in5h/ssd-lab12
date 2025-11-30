package com.in5h;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void greetingReturnsHello() {
        assertEquals("Hello", App.getGreeting());
    }
}
