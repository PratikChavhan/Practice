namespace BOL;

public class Menu
{
    public int id { get; set; }
    public string name { get; set; }
    public int rate { get; set; }

    public Menu(int id, string name, int rate)
    {
        this.id = id;
        this.name = name;
        this.rate = rate;
    }

    public override string ToString()
    {
        return this.id + "  " + this.name + "  " + this.rate;
    }
}


