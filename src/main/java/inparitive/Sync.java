package inparitive;

import java.util.function.Predicate;

public class Sync {
    private String[] secondaryDoc = {"Grade 10","Grade 11"};
    private String[] higherSecondaryDoc = {"Grade 12", "Diploma"};
    private String[] ugDoc = {"Undergraduate Degree"};
    private String[] pgDoc = {"Postgraduate Degree"};
    
    public static Predicate<String> isSecondaryDoc = doc -> 
                            doc.contains("Grade 10") 
                        &&  doc.contains("Grade 11");
        
    void listOfDoc(){
        System.out.println(
            this.secondaryDoc.toString() + 
            this.higherSecondaryDoc.toString() +
            this.ugDoc.toString() +
            this.pgDoc.toString()
        );;
    }

}
