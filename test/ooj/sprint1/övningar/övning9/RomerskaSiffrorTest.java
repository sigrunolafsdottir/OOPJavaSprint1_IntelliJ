package ooj.sprint1.övningar.övning9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomerskaSiffrorTest {


    @Test
    void getDigit() {
        assert(RomerskaSiffror.V.getDigit() == 5);
        assert(RomerskaSiffror.X.getDigit() == 10);
        assert(RomerskaSiffror.C.getDigit() == 100);
        assert(RomerskaSiffror.I.getDigit() == 1);
        assert(RomerskaSiffror.L.getDigit() == 50);
        assert(RomerskaSiffror.D.getDigit() == 500);
        assert(RomerskaSiffror.M.getDigit() == 1000);
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