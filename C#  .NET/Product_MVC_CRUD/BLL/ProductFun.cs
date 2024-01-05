namespace BLL;
using BOL;
using DAL;

public class ProductFun{

public List<Product> GetProducts()
{
    DBManager db = new DBManager();
    List<Product>  lpp = db.GetAllProducts();

    return lpp;
}

public void signup(string email,string user,string pass)
{
    DBManager dB = new DBManager();
    dB.Signupuser(email,user,pass);

}

public bool UserVerify(string user,string pass)
{
    DBManager dB = new DBManager();
    bool status =dB.LoginUser(user,pass);
    return status;

}

public void DeleteUser(string user)
{
    DBManager dB = new DBManager();
    dB.Deluser(user);

}

public void UpdateUser(string user,string nuser)
{
    DBManager dB = new DBManager();
    dB.Updateuser(user,nuser);

}
}