
import bank.CaractereOCR;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by coding-dojo-coolworking on 09/11/15.
 */
public class CaractereOCRTest {
    CaractereOCR caractereOCR;

    @Before
    public void setUp() {

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

    @Test
    public void test_peut_lire_un_cinq() {

        // when
        int caractereLu = caractereOCR.lire(
                " _ ",
                "|_ ",
                " _|"
        );

        // then
        assertEquals(5, caractereLu);
    }

    @Test
    public void test_peut_lire_un_six() {

        // when
        int caractereLu = caractereOCR.lire(
                " _ ",
                "|_ ",
                "|_|"
        );

        // then
        assertEquals(6, caractereLu);
    }

    @Test
    public void test_peut_lire_un_sept() {

        // when
        int caractereLu = caractereOCR.lire(
                " _ ",
                "  |",
                "  |"
        );

        // then
        assertEquals(7, caractereLu);
    }

    @Test
    public void test_peut_lire_un_huit() {

        // when
        int caractereLu = caractereOCR.lire(
                " _ ",
                "|_|",
                "|_|"
        );

        // then
        assertEquals(8, caractereLu);
    }

    @Test
    public void test_peut_lire_un_neuf() {

        // when
        int caractereLu = caractereOCR.lire(
                " _ ",
                "|_|",
                "  |"
        );

        // then
        assertEquals(9, caractereLu);
    }
}
