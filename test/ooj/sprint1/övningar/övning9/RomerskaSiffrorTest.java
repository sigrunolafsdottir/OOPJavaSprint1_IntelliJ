package ooj.sprint1.övningar.övning9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomerskaSiffrorTest {


    @Test
    void getDigit() {
        assert(RomerskaSiffror.V.getDigit().intValue() == 5);
        assert(RomerskaSiffror.X.getDigit().intValue() == 10);
        assert(RomerskaSiffror.C.getDigit().intValue() == 100);
        assert(RomerskaSiffror.I.getDigit().intValue() == 1);
        assert(RomerskaSiffror.L.getDigit().intValue() == 50);
        assert(RomerskaSiffror.D.getDigit().intValue() == 500);
        assert(RomerskaSiffror.M.getDigit().intValue() == 1000);
    }

    @Test
    void getString() {
        assert(RomerskaSiffror.V.getString().equals("fem"));
        assert(RomerskaSiffror.X.getString().equals("tio"));
        assert(RomerskaSiffror.C.getString().equals("hundra"));
        assert(RomerskaSiffror.I.getString().equals("ett"));
        assert(RomerskaSiffror.L.getString().equals("femtio"));
        assert(RomerskaSiffror.D.getString().equals("femhundra"));
        assert(RomerskaSiffror.M.getString().equals("tusen"));
    }
}