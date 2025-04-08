package com.example;

import org.junit.jupiter.api.Test;
import rife.test.MockConversation;

import static org.junit.jupiter.api.Assertions.*;

public class EncodingTestTest {
    @Test
    void verifyRoot() {
        var m = new MockConversation(new EncodingTestSite());
        assertEquals(m.doRequest("/").getStatus(), 302);
    }

    @Test
    void verifyHello() {
        var m = new MockConversation(new EncodingTestSite());
        assertEquals("Hello EncodingTest", m.doRequest("/hello")
            .getTemplate().getValue("title"));
    }
}
