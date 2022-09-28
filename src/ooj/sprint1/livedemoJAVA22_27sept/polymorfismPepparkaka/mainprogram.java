package ooj.sprint1.livedemoJAVA22_27sept.polymorfismPepparkaka;

public class mainprogram {

    public static void main(String[] args){

        Godsak g = new Godsak(1);
        Pepparkaka p = new Pepparkaka(true, "gubbe", 5);

        Godsak gp = new Pepparkaka(true, "gumma", 7);

       // Pepparkaka pg = new Godsak(7);

        System.out.println(g.kaloriinehåll);
        System.out.println(p.kaloriinehåll);
        System.out.println(gp.kaloriinehåll);

        g.printMe();
        p.printMe();
        gp.printMe();
    }
}
