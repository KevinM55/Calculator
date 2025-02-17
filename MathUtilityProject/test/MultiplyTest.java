/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Capaciti
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MultiplyTest {

    @Test
    public void testMultiplyTwoPositiveNumbers() {
        assertEquals(3, MathUtils.multiply(1, 3));
    }

    @Test
    public void testMultiplyNegativeAndPositive() {
        assertEquals(-3, MathUtils.multiply(-1, 3));
    }
}
