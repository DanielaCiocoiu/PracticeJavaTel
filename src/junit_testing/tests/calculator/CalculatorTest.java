package junit_testing.tests.calculator;
import junit_testing.calculator.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
public class CalculatorTest {
    private Calculator calculator;

    @BeforeAll
    public static void setUpClass(){
        System.out.println("Metoda executata o singura data inaintea intregii suite.");
    }
    /*
    Metoda executata in mod automat inainte de fiecare test in parte
    Folosita pentru initializare de resurse externe sau elemente comune tuturor testelor.
     */
    @BeforeEach
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void testSum(){
//        Calculator calculator = new Calculator(); //am inlocuit cu setUp() si tearDown()
        int expectedResult = 4;

        int actualResult = calculator.sum(2, 2);

        //var 1 pentru validare
//        boolean finalResult = expectedResult == actualResult;
//        assertTrue(finalResult, () -> "Valoarea returnata de functia sum() nu este cea asteptata.");
        //var 2 pentru validare
//        if(actualResult != expectedResult){
//            fail("Valoarea returnata de functia sum() nu este corecta.");
//        }
        //var 3 pentru validare
        assertEquals(expectedResult, actualResult, () -> "Mesaj de eroare");
    }

    @Test
    @DisplayName("Testez metoda minus() din clasa Calculator")
    public void testMinus(){
        assumeTrue(Calculator.environment.equals("test"));
        //un assumption care nu este adevarat va marca un test ca fiind IGNORED, NU failed
        assertEquals(0, calculator.minus(2, 2));
    }

    @Test
    @Disabled
    public void testDivide(){
        int expectedResult = 2;
        int actualResult = calculator.divide(6, 3);
        assertEquals(expectedResult, actualResult);
    }

    //    @Test
    @RepeatedTest(value = 5)
    public void testDivideOnZero(){
        Executable division = () -> calculator.divide(6, 0);
        assertThrows(ArithmeticException.class, division);
    }

    @AfterEach
    public void tearDown(){
        calculator = null;
    }

    @AfterAll
    public static void tearDownClass(){
        System.out.println("Metodata executata doar O DATA la finalul suitei.");
    }
}
