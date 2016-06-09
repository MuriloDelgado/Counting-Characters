import java.util.*;

public class Counting
{
    public static void main(String[] args)
    {
        String phrase; // Variable for the phrase being used
        String phraseMutation; // Variable to mutate phrase
        Scanner scan; // Scanner object
        int length; // Length of phrase        
        scan = new Scanner(System.in); // Initializing scanner object
                     
        System.out.println ("Enter a phrase, or type 'quit' to exit: ");
        phrase = scan.nextLine(); // Scanning in phrase to be counted       
        
        while (phrase.equalsIgnoreCase("quit") != true) // Loop to repeat code until quit is typed
        {        
            int countBlank = 0; // Variable for counting blank characters
            int countA = 0, countE = 0, countS = 0, countT = 0; // Variable to count all characters
           
            length = phrase.length(); // Getting phrase length
            phraseMutation = phrase.toUpperCase(); // To make counting easier
            
            for (int i = 0; i < length; i++) // Counting the characters
            {
                switch(phraseMutation.charAt(i))
                {
                    case 'A':
                        countA++;
                        break;
                    case 'E':
                        countE++;
                        break;
                    case 'S':
                        countS++;
                        break;
                    case 'T':
                        countT++;
                        break;
                    case ' ':
                        countBlank++;
                        break;
                }                                
            }
        
            // Printing out all necessary information
            System.out.println ("Your phrase: " + phrase);
            System.out.println ("There are " + countBlank + " blank spaces.");
            System.out.println ("There are " + countA + " As.");
            System.out.println ("There are " + countE + " Es.");    
            System.out.println ("There are " + countS + " Ss.");
            System.out.println ("There are " + countT + " Ts.");
        
            // Statement to break or restart while loop
            System.out.println ("Enter another phrase, or type 'quit' to exit: ");
            phrase = scan.nextLine(); // Scanning in phrase to continue or quit to exit
        }
    }
}
