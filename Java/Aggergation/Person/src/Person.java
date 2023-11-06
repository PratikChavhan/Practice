public class Person {
	private int id;
    private String name;
    private String number;

    // constructor
    public Person(){
        this(0,null,null);
    }
    
    // parameterized constructor
    public Person(int id, String name, String number){
        this.id = id;
        this.name = name;
        this.number = number;
    }

    // getter
    public int getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getNumber(){
        return number;
    }

    // setter
    public void setID(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setNumber(String number){
        this.number = number;
    }

    // override
    public String toString(){
        return "Person"+ PersonService.cnt +": [ID: " + this.id + "\tName: " + this.name + "\tNumber: " + this.number+"]";
    }
}
