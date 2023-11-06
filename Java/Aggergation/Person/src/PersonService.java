import java.util.Scanner;
public class PersonService {

    // 1. Adding person
    static Person[] parr;
    static int cnt;
    static{
        parr = new Person[100];
        parr[0] = new Person(0, "N/A", "N/A");
        parr[1] = new Person(1, "Nikhil", "8164655165");
        parr[2] = new Person(2, "Nishant", "98716466615");
        parr[3] = new Person(3, "Ankush", "9198711546");
        // we need to define dummy object otherwise it will show null when we display 
        cnt = 4;
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
    
// 3. Display by id
    public static Person displayByID(int id) {
    	for(int i = 1; i < cnt; i++) {
    		if (parr[i].getID() == id) {
    			return parr[i];
    		}
    	}
		return null;
    }
    
// 4. Display by name
    public static Person displayByName(String name) {
    	for(int i = 1; i < cnt; i++) {
    		if (parr[i].getName().equals(name)){
    			return parr[i];
    		}
    	}
		return null;
    }
    
// 5. Update by Number
    public static Person updateNumber(int id, String number) {
    	for(int i = 1; i < cnt; i++) {
    		if(parr[i].getID() == id) {
    			parr[i].setNumber(number);
    			return parr[i];
    		}
    	}
		return null;
    }

// 6. Delete by ID
	public static void deleteByID(int i) {
		
	}
    
}
