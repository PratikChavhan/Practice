using MySql.Data.MySqlClient;
using BOL;

namespace DAL;

public class DBManager
{
    public static string conn_string = "server=localhost;port=3306;user=root;password=root;database=dbt";

    public List<Product> GetAllProducts()
    {
        MySqlConnection conn = new MySqlConnection();
        conn.ConnectionString = conn_string;
        string query = "select pid, pname, uprice, splid from prod";
        MySqlCommand cmd = new MySqlCommand(query, conn);

        List<Product> plist = new List<Product>();

        try
        {
            conn.Open();
            MySqlDataReader reader = cmd.ExecuteReader();
            while (reader.Read())
            {
                int pid = int.Parse(reader["pid"].ToString());
                string pname = reader["pname"].ToString();
                int uprice = int.Parse(reader["uprice"].ToString());
                int splid = int.Parse(reader["splid"].ToString());
                Product p = new Product(pid, pname, uprice, splid);
                plist.Add(p);
            }
            reader.Close();
        }
        catch (Exception e)
        {
            Console.WriteLine(e.Message);
        }
        finally
        {
            conn.Close();
        }
        return plist;
    }


    public void Add(int pid, string pname, int uprice, int splid)
    {
        MySqlConnection conn = new MySqlConnection();
        conn.ConnectionString = conn_string;
        string query = "insert into prod(pid, pname, uprice, splid) values(@pid, @pname, @uprice, @splid)";
        MySqlCommand cmd = new MySqlCommand(query, conn);
        try
        {
            conn.Open();
            cmd.Parameters.AddWithValue("@pid", pid);
            cmd.Parameters.AddWithValue("@pname", pname);
            cmd.Parameters.AddWithValue("@uprice", uprice);
            cmd.Parameters.AddWithValue("@splid", splid);
            cmd.ExecuteNonQuery();
        }
        catch (Exception e)
        {
            Console.WriteLine(e.Message);
        }
        finally
        {
            conn.Close();
        }
    }

}