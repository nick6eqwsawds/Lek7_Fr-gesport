import java.util.Scanner;

public class frågor {
    public static void main(String[] args) {
        try (Scanner tangentbord = new Scanner(System.in)) {
            String fråga1 = ("Är solen gul? "+" Y eller N");
            String fråga2 = ("Är månen gjord av ost? "+" Y eller N");
            String fråga3 = ("Är detta bra frågor "+" Y eller N");
            String fråga4 = ("Svar är Y  "+" Y eller N");
            String fråga5 = ("Svar är N "+" Y eller N");

            int points=0;
            
            System.out.println(fråga1);
            String svar1= tangentbord.nextLine();
            if (svar1.equalsIgnoreCase("y")){
                points+=1;
            } else if (svar1.equalsIgnoreCase("n")){
                points=points+1-1;
            }

            System.out.println(fråga2);
            String svar2= tangentbord.nextLine();
            if (svar2.equalsIgnoreCase("n")){
                points+=1;
            } else if (svar2.equalsIgnoreCase("y")){
                points=points+1-1;
            }

            System.out.println(fråga3);
            String svar3= tangentbord.nextLine();
            if (svar3.equalsIgnoreCase("y")){
                points+=1;
            } else if (svar3.equalsIgnoreCase("n")){
                points=points+1-1;
            }

            System.out.println(fråga4);
            String svar4= tangentbord.nextLine();
            if (svar4.equalsIgnoreCase("y")){
                points+=1;
            } else if (svar4.equalsIgnoreCase("n")){
                points=points+1-1;
            }

            System.out.println(fråga5);
            String svar5= tangentbord.nextLine();
            if (svar5.equalsIgnoreCase("n")){
                points+=1;
            } else if (svar5.equalsIgnoreCase("y")){
                points=points+1-1;
            }

            System.out.println("du fick "+points+" av 5 rätt");
        }
    }
}
