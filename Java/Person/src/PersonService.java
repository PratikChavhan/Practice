import java.util.Scanner;
public class PersonService {

    // 1. Adding person
    static Person[] parr;
    static int cnt;
    static{
        parr = new Person[100];
        parr[0] = new Person(0, "N/A", "N/A");
        // we need to define dummy object otherwise it will show null when we display 
        cnt = 1;
    } 
    public static void addPerson(){
        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter id: ");
        int id = sc.nextInt();

        System.out.println("Enter name: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.println("Enter number: ");
        String number = sc.nextLine();
        
        parr[cnt] = new Person(id, name, number);
        
        System.out.println("Person added successfully");
        System.out.println();
        cnt++;
    }

// 2. Display person details
    public static void displayAll(){
        for(int i = 1; i < cnt ; i++){
            System.out.println(parr[i]);
        }
        System.out.println();
    }
    
}
