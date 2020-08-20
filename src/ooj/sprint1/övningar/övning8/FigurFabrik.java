package ooj.sprint1.övningar.övning8;


public class FigurFabrik {
    
    public Figur getFigur(String form){
        if (form == null){
            return null;
        }
        
        if (form.equals("rund")){
            return new Cirkel(6,4,3);
        }
        else if (form.equals("fyrkantig")){
            return new Rektangel(6,4,3,10);
        }
        else if (form.equals("trekantig")){
            return new LikbentTriangel(6,4,3,10);
        }
        else return null;
    }

}
