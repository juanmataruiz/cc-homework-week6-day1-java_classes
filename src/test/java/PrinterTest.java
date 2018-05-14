import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(90, 100, 10);
    }

    @Test
    public void hasSheets(){
        assertEquals(100, printer.getSheets());
    }

    @Test
    public void hasCopies(){
        assertEquals(10, printer.getCopies());
    }

    @Test
    public void canRefill(){
        assertEquals(100, printer.getRefill());
    }

    @Test
    public void hasToner(){
        assertEquals(90, printer.getToner());
    }

    @Test
    public void canPrint(){
        printer.getPrint();
        assertEquals(90, printer.getSheets());
        assertEquals(80, printer.getToner());
    }

}
