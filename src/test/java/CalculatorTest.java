import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculate;

    @Before
    public void before(){
        calculate = new Calculator(5, 5 );
    }

    @Test
    public void Add(){
        assertEquals(10, calculate.add());
    }

    @Test
    public void Subtract(){
        assertEquals(0, calculate.subtract());
    }

    @Test
    public void Multiply(){
        assertEquals(25, calculate.multiply());
    }

    @Test
    public void Divide(){
        assertEquals(1, calculate.divide());
    }
}
