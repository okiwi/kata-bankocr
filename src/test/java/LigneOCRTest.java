import bank.LigneOCR;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by eptwalabha on 09/11/15.
 */
public class LigneOCRTest {


    @Test
    public void test_j_obtiens_123412344_lorsque_j_ai_123412344() {
        // given
        LigneOCR ligneOCR = new LigneOCR();


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
        // given
        LigneOCR ligneOCR = new LigneOCR();

        // when
        String code = ligneOCR.lire(
                " _  _  _  _  _  _  _  _  _ ",
                "| || || || || || || || || |",
                "|_||_||_||_||_||_||_||_||_|");


        // then
        assertEquals("000000000", code);
    }
}
