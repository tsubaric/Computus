import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class ComputusTest {
    Computus test1;
    Computus test2;
    Computus test3;
    Computus test4;
    Computus test5;
    Computus test6;
    Computus test7;
    Computus test8;
    Computus test9;

    public void init() {
        test1 = new Computus(1980);
        test2 = new Computus(1981);
        test3 = new Computus(1982);
        test4 = new Computus(1995);
        test5 = new Computus(1996);
        test6 = new Computus(1997);
        test7 = new Computus(2010);
        test8 = new Computus(2011);
        test9 = new Computus(2012);
    }

    @Test
    public void test_getYear() {
        init();
        assertEquals(test1.getYear(), 1980);
        assertEquals(test2.getYear(), 1981);
        assertEquals(test3.getYear(), 1982);
        assertEquals(test4.getYear(), 1995);
        assertEquals(test5.getYear(), 1996);
        assertEquals(test6.getYear(), 1997);
        assertEquals(test7.getYear(), 2010);
        assertEquals(test8.getYear(), 2011);
        assertEquals(test9.getYear(), 2012);
    }

    @Test
    public void test_getDate() {
        init();
        assertEquals(test1.getDate(), "Easter: April, 6, 1980");
        assertEquals(test2.getDate(), "Easter: April, 19, 1981");
        assertEquals(test3.getDate(), "Easter: April, 11, 1982");
        assertEquals(test4.getDate(), "Easter: April, 16, 1995");
        assertEquals(test5.getDate(), "Easter: April, 7, 1996");
        assertEquals(test6.getDate(), "Easter: March, 30, 1997");
        assertEquals(test7.getDate(), "Easter: April, 4, 2010");
        assertEquals(test8.getDate(), "Easter: April, 24, 2011");
        assertEquals(test9.getDate(), "Easter: April, 8, 2012");
    }

}
