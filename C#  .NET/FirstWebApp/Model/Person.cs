namespace HR;

public class Person{
    public int Id{get;set;}
    public string fname{get;set;}
    public string lname{get;set;}
    public override string ToString() {
        return "Id: " + this.Id + ", Name: " + this.fname + " " + this.lname;
    }
}

