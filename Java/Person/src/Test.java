import java.util.*;
public class Test {

    public static void main(String[] args){
        int choice;
        Scanner sc = new Scanner(System.in);
        do{
            // 1. add person
            // 2. display person
            // 3. display by id 
            // 4. display by name
            // 5. update number
            // 6. delete by id 
            System.out.println("1. add person\t\t2. display person\t\t3. display id\n4. display name\t5. update number\t\t6. delete id\n7. exit");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    PersonService.addPerson();
                    break;

                case 2:
                    PersonService.displayAll();
                    break;

                case 3:
                	PersonService.displayByID(1);
                    break;

                case 4:
                	PersonService.displayByName("Nishant");
                    break;
                    
                case 5:
                	PersonService.updateNumber(2, "354143333431");
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Bye...!!!");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println();
                    System.out.println("Invalid Choice...!!!");
                    System.out.println();
                    break;
                }


        }while(choice != 7);
    }
    
}
