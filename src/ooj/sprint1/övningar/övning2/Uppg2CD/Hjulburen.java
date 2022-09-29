package ooj.sprint1.övningar.övning2.Uppg2CD;


public interface Hjulburen {

    // int getAntalHjul();

     default int getAntalHjul(){
         return this.getAntalHjul();
        //return 2;
    }

}
