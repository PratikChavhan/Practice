using MySql.Data.MySqlClient;
using BOL;

namespace DALconnected;

public class DBManager
{
    public static string conn_string = "server=localhost;port=3306;user=root;password=root;database=dbt";

    public static List<Menu> GetMenu()
    {
        MySqlConnection conn = new MySqlConnection();
        conn.ConnectionString = conn_string;

        string query = "select * from menucard";
        List<Menu> mlist = new List<Menu>();

        MySqlCommand cmd = new MySqlCommand(query, conn);
        try
        {
            conn.Open();
            MySqlDataReader reader = cmd.ExecuteReader();
            while (reader.Read())
            {
                int id = int.Parse(reader["ID"].ToString());
                string name = reader["NAME"].ToString();
                int rate = int.Parse(reader["RATE"].ToString());
                Menu m1 = new Menu(id, name, rate);
                mlist.Add(m1);
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
        return mlist;
    }

    public Menu


}

