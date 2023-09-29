package ooj.sprint1.övningar.övning2.Uppg2CD;


public interface Hjulburen {

    //implicit public, final, static
     int getAntalHjulFrInterface = 4;

     default int getAntalHjul(){
         return this.getAntalHjul();
        //return 2;
    }

}
