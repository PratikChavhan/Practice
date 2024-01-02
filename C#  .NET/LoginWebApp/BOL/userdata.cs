namespace BOL;

public static class UserData{
    public string username{get;set;}

    public string password{get;set;}

    public void UserData(){
        this.username="null"; 
        this.password="null"; 
    }

    public void UserData(string username, string password){
        this.username=username;
        this.password=password;
    }
}
