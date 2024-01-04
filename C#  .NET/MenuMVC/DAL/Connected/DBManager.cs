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

        string query = "select * from menucard order by ID";
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

    public bool UpdateMenu(int id, string name, int rate)
    {
        MySqlConnection conn = new MySqlConnection();
        conn.ConnectionString = conn_string;
        string query = "Update menucard set NAME=@name, RATE=@rate where ID=@id";
        MySqlCommand cmd = new MySqlCommand(query, conn);
        try
        {
            cmd.Parameters.AddWithValue("@id", id);
            cmd.Parameters.AddWithValue("@name", name);
            cmd.Parameters.AddWithValue("@rate", rate);
            conn.Open();
            int status = cmd.ExecuteNonQuery();
            if (status > 0)
            {
                return true;
            }
        }
        catch (Exception e)
        {
            Console.WriteLine(e.Message);
        }
        finally
        {
            conn.Close();
        }
        return false;
    }


    public bool RemoveMenu(int id)
    {
        MySqlConnection conn = new MySqlConnection();
        conn.ConnectionString = conn_string;
        string query = "delete from menucard where ID=@id";
        MySqlCommand cmd = new MySqlCommand(query, conn);
        try
        {
            cmd.Parameters.AddWithValue("@id", id);
            conn.Open();
            int status = cmd.ExecuteNonQuery();
            if (status > 0)
            {
                return true;
            }
        }
        catch (Exception e)
        {
            Console.WriteLine(e.Message);
        }
        finally
        {
            conn.Close();
        }
        return false;
    }

}

