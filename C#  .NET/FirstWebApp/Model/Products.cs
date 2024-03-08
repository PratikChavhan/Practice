namespace catalog;

public class Products{
    public int Id{get;set;}
    public string Title{get;set;}
    // Description, UnitPrice, Quantity, Imageurl
    public string Description{get;set;}
    public float UnitPrice{get;set;}
    public int Quantity{get;set;}
    public string Imageurl{get;set;}
    

    public override string ToString(){
        return this.Id + ", Description: " + this.Description + ", UnitPrice: "+ this.UnitPrice + ", Quantity:"+ this.Quantity+ ", ImageUrl:"+ this.Imageurl; 
    }
}