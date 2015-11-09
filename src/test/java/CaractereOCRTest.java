
import bank.CaractereOCR;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by eptwalabha on 09/11/15.
 */
public class CaractereOCRTest {
    CaractereOCR caractereOCR;


    @Before
    public void setUp(){
        // given
        caractereOCR = new CaractereOCR();
    }
    @Test
    public void test_peut_lire_un_zero() {


        // when
        int caractereLu = caractereOCR.lire(
                " _ ",
                "| |",
                "|_|"
        );

        // then
        assertEquals(0, caractereLu);
    }

    @Test
    public void test_peut_lire_un_un() {

        // when
        int caractereLu = caractereOCR.lire(
                "   ",
                "  |",
                "  |"
        );

        // then
        assertEquals(1, caractereLu);
    }

    @Test
    public void test_peut_lire_un_deux() {

        // when
        int caractereLu = caractereOCR.lire(
                " _ ",
                " _|",
                "|_ "
        );

        // then
        assertEquals(2, caractereLu);
    }

    @Test
    public void test_peut_lire_un_trois() {

        // when
        int caractereLu = caractereOCR.lire(
                " _ ",
                " _|",
                " _|"
        );

        // then
        assertEquals(3, caractereLu);
    }

    @Test
    public void test_peut_lire_un_quatre() {

        // when
        int caractereLu = caractereOCR.lire(
                "   ",
                "|_|",
                "  |"
        );

        // then
        assertEquals(4, caractereLu);
    }

}
