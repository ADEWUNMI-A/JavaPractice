package tdd;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class ArithmeticTest {
     Arithmetic arithmetic;
     @BeforeEach
        void startAllTestWith() {
         arithmetic = new Arithmetic();
         }

         @Test
        void thatObjectExist() {
        assertNotNull(arithmetic);
         }

        @Test
        void sum(){
        assertEquals(15, arithmetic.sum(10,5));
        }

        @Test
        void difference() {
         assertEquals(6, arithmetic.difference(7,13));
        }

        @Test
        void squareRoot() {
         assertEquals(25, arithmetic.square(5));
        }

        @Test
        void differenceOfTheSquareOfTwoNumbers() {
         assertEquals(9,arithmetic.differenceSquare(4,5));
        }

        @Test
        void sumOfTheSquareOfTwoNumbers() {
         assertEquals(23,arithmetic.sumSquare(4,5));
        }
}