using DAL;
using BOL;

namespace BLL;

public class ProductCatalog
{
    public List<Product> Plist()
    {
        DBManager db = new DBManager();
        List<Product> pl = db.GetAllProducts();
        return pl;
    }

    public Product getById(int pid)
    {
        List<Product> plist = new List<Product>();
        plist = Plist();
        Product p1 = plist.Find((p) => p.pid == pid);
        return p1;
    }


}