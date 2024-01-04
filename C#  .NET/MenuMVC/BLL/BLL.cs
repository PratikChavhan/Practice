using DALconnected;
using BOL;
namespace BLL;

public class MenuCatlog
{
    public List<Menu> GetList()
    {
        List<Menu> menulist = new List<Menu>();
        menulist = DBManager.GetMenu();
        return menulist;
    }
    public Menu getById(int id)
    {
        List<Menu> mlist = new List<Menu>();
        mlist = GetList();
        Menu m1 = mlist.Find((m) => m.id == id);
        return m1;
    }

    public bool Update(int id, string name, int rate)
    {
        DBManager db = new DBManager();
        return db.UpdateMenu(id, name, rate);
    }

    public bool Delete(int id)
    {
        DBManager db = new DBManager();
        return db.RemoveMenu(id);
    }
}

