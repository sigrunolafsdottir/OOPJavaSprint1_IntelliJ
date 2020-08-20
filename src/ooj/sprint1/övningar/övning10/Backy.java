package ooj.sprint1.övningar.övning10;

//Jesper Sjöströms lösning

public class Backy {

    public static void main(String[] args) {
        System.out.println(backy("hej"));
    }

    private static String backy(String word) {
        if(word.length() <= 1) {
            return word;   // här hamnar vi när bara en bokstav är kvar           
        }
        else {
            System.out.println(word.charAt(word.length() - 1));
            return word.charAt(word.length() - 1) 
                    + backy(word.substring(0, word.length() - 1));
        }
    }
}
