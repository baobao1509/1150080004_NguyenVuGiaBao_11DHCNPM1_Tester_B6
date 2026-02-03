package org.example;

import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PersonTest {

    // Cách 1: Sử dụng ExpectedException Rule
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testExpectedException() {
        exception.expect(IllegalArgumentException.class);
        new Person("Fpoly", -1);
    }

    // Cách 2: Sử dụng @Test(expected = ...)
    @Test(expected = IllegalArgumentException.class)
    public void testExpectedException2() {
        new Person("Fpoly", -1);
    }

    // Cách 3: Sử dụng khối try-catch
    @Test
    public void testExpectedException3() {
        try {
            new Person("Fpoly", -1);
            fail("Should have thrown an IllegalArgumentException because age is invalid!");
        } catch (IllegalArgumentException e) {
            // Test pass vì ngoại lệ được bắt đúng
        }
    }
}
