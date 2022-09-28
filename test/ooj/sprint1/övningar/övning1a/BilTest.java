package ooj.sprint1.övningar.övning1a;

import org.junit.jupiter.api.Test;


class BilTest {

    Bil a = new Bil("qwe123", "Volvo");
    Bil b = new Bil("asd456", "Fiat");

    Bilägare Kalle = new Bilägare("Kalle", "hemma", 45);
    Bilägare Sally = new Bilägare("Sally", "hemma", 24);


    @Test
    void ägsAvTest() {
        assert(a.ägare == null);
        a.ägsAv(Kalle);
        assert(a.ägare == Kalle);    //vi ser at ägaren har ändrats, precis som vi vill!
        assert(a.ägare != null);
    }

    @Test
    void såldTest() {
        a.ägsAv(Kalle);
        assert(a.ägare == Kalle);
        a.såld();
        assert(a.ägare == null);
        assert(a.ägare != Kalle);
    }

    @Test
    void getBilägareTest() {
        assert(b.getBilägare() == null);
        b.ägsAv(Sally);
        assert(b.getBilägare() == Sally);
    }
}