package ooj.sprint1.demos.sjukhus;

import java.time.LocalDate;
import java.util.List;
import javax.swing.JOptionPane;


public class HappyBirthday {
    
    public HappyBirthday(){
        Backend backend = new Backend();
        List <IBirthdayCandidate> birthdayCandidates = backend.getAllBirthdayCandidates();
        
        for (IBirthdayCandidate b : birthdayCandidates){
            if (hasBirthDayToday(b)){
                JOptionPane.showMessageDialog(null, "Happy Birthday "+ b.getName());
            }
        }
    }
    
    boolean hasBirthDayToday(IBirthdayCandidate b){
        LocalDate today = LocalDate.now();
        return b.getBirthday().getMonth() == today.getMonth() && 
                    b.getBirthday().getDayOfMonth() == today.getDayOfMonth();
    }
    
    
    public static void main(String[] args){
        HappyBirthday happyBirthday = new HappyBirthday();
    }


}
