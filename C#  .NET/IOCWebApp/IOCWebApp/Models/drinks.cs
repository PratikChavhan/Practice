namespace drinks;

public class Softdrinks
{
    public int id { get; set; }
    public string name { get; set; }

    public int rate { get; set; }

    public Softdrinks(int id, string name, int rate)
    {
        this.id = id;
        this.name = name;
        this.rate = rate;
    }
}