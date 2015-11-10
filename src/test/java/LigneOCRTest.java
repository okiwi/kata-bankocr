import bank.LigneOCR;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by coding-dojo-coolworking on 09/11/15.
 */
public class LigneOCRTest {


    private LigneOCR ligneOCR;

    @Before
    public void setUp() {

        // given
        ligneOCR = new LigneOCR();
    }

    @Test
    public void test_j_obtiens_123412344_lorsque_j_ai_123412344() {

        // when
        String code = ligneOCR.lire(
                "    _  _        _  _       ",
                "  | _| _||_|  | _| _||_||_|",
                "  ||_  _|  |  ||_  _|  |  |");


        // then
        assertEquals("123412344", code);
    }

    @Test
    public void test_j_obtiens_000000000_lorsque_j_ai_00000000() {

        // when
        String code = ligneOCR.lire(
                " _  _  _  _  _  _  _  _  _ ",
                "| || || || || || || || || |",
                "|_||_||_||_||_||_||_||_||_|");


        // then
        assertEquals("000000000", code);
    }
}
