/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Capaciti
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AddTest {

    @Test
    public void testAddTwoPositiveNumbers() {
        assertEquals(3, MathUtils.add(1, 2));
    }

    @Test
    public void testAddTwoNegativeNumbers() {
        assertEquals(-2, MathUtils.add(-1, -1));
    }
}

