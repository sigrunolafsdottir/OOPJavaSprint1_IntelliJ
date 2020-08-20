package ooj.sprint1.övningar.övning1;

//Ett avskräckande exempel på hur kod kunde se ut innan vi började med objektorientering 
//Tänk inte ens tanken på att göra såhär!
//Notera at jag inte ens orkat lägga in utskrifter av regnummer eller adresser, det blev för jobbigt
//när inte datat som rör ett och samma objekt är ihoplänkat på vettigt sätt

//Betänk också hur jobbigt det kommer att bli när det tillkommer fler bilar och ägare
//utskrifts-loopen blir ett monster att underhålla!

public class BilDramaNonOO {
    
    public static void main(String[] args) {
        
        String bossesNamn = "Bosse";
        String bossesAdress = "Bilvägen 3";
        int bossesÅlder = 65;
        String lisasNamn = "Lisa";
        String lisaAdress = "Laduvägen 8";
        int lisasÅlder = 27;
        String kimsNamn = "Kim";
        String kimsAdress = "Kalasvägen 6";
        int kimsÅlder = 37;
        String kim2sNamn = "Kim";
        String kim2sAdress = "Kalasvägen 8";
        int kim2sÅlder = 73;
        
        String rödaSaabensRegNr = "XYZ 123";
        String rödaSaabensMärke = "Saab";
        String vitaVolvonsRegNr = "ERT 432";
        String vitaVolvonsMärke = "Volvo";
        
        //En approach för ägandeskap
        String rödaSaabensÄgare = "Bosse";
        String vitaVolvonsÄgare = "Kim";
        
        //Verkar bra men hur vet vi att Kim som är vitaVolvonsÄgare är samma Kim som i kimsNamn?
        //Det skulle kunna finns kim2sNamn = "Kim", och då har vi bortkollrade
        
        //Approach 2, en bool-matris får representera ägandeskapet
        //Jag ger indexen namn för att hålla reda på vilekn rad/kolumn hör till vilken person/bil
        boolean [][] bilägare = new boolean [3][2];
        int bosse = 0;
        int lisa = 1;
        int kims = 2;
        int rödaSaaben = 0;
        int vitaVolvon = 1;
        
        //initial setup av ägarskap
        bilägare[bosse][rödaSaaben] = true;
        bilägare[lisa][rödaSaaben] = false;
        bilägare[kims][rödaSaaben] = false;
        bilägare[bosse][vitaVolvon] = false;
        bilägare[lisa][vitaVolvon] = true;
        bilägare[kims][vitaVolvon] = false;
        
        //kim köper vita volvon
        bilägare[kims][vitaVolvon] = true;
        bilägare[lisa][vitaVolvon] = false;
        
        for (int i = 0; i < bilägare.length; i++){
            for (int j = 0; j < bilägare[i].length; j++){
                switch(i){
                    case 0:  
                        System.out.print ("Bosse äger ");
                        if (! bilägare[i][j]){
                            System.out.print ("INTE");
                        }
                        if (j == 0) System.out.println("röda blien");
                        else System.out.println("vita volvon");
                    break;
                    case 1:  
                        System.out.print ("Lisa äger ");
                        if (! bilägare[i][j]){
                            System.out.print ("INTE");
                        }
                        if (j == 0) System.out.println("röda blien");
                        else System.out.println("vita volvon");
                    break;
                    case 2:  
                        System.out.print ("Kim äger ");
                        if (! bilägare[i][j]){
                            System.out.print ("INTE");
                        }
                        if (j == 0) System.out.println("röda blien");
                        else System.out.println("vita volvon");
                    break;

                }
            }
        }
        
        //Vad händer om fler bilar och ägare tillkommer? 
        //Jo, vi måste skriva om väldigt mycket kod varje gång, inte bra
    }
}
