namespace BOL;

public class Product
{
    public int pid { get; set; }
    public string pname { get; set; }
    public int splid { get; set; }
    public int uprice { get; set; }

    public Product(int pid, string pname, int uprice, int splid)
    {
        this.pid = pid;
        this.pname = pname;
        this.uprice = uprice;
        this.splid = splid;
    }
}