package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AirthematicTest {
    public String message = "Fpoly exception";
    JunitMessage junitMessage = new JunitMessage(message);

    @Test(expected = ArithmeticException.class)
    public void testJUnitMessage() throws Exception {
        System.out.println("fpoly Junit Message exception is printing");
        junitMessage.printMessage();
    }

    @Test
    public void testJUnitHiMessage() {
        message = "Hi!" + message;
        System.out.println("Fpoly Junit Message is printing");
        assertEquals(message, junitMessage.printHiMessage());
    }
}
