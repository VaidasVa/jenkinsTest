package com.example.jenkinstest.service;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestServiceTest {
    @Mock
    TestService testService = new TestService();

    @Test
    void printer() throws IOException {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        testService.printer();
        output.flush();
        String message = output.toString();
        assertEquals("Hello world to jenkins\n", message);
    }
}