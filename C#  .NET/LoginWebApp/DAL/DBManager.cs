namespace DAL;

public static class DBManager{
    public static string conn = "server=localhost; port=3306; user=root; password=root; database=dbt;";

    public static List<UserData> GetAllUserData(){
        MySqlConnection = new MySqlConnection();
        conn.ConnectionString = connection;
        string query = "select * from login1";
        MySqlCommand cmd = new MySqlCommand(query, conn);

        List<UserData> list = new List<UserData>();
        try{
            conn.Open();
            MySqlDataReader reader = cmd.ExecuteReader();
            while(reader.Read()) {
                string username = reader["username"].ToString();
                string password = reader["password"].ToString();
                UserData data = new UserData(username, password); 
                list.add(data); 
            }
            reader.Close();
        } catch(Exception e) {
            Console.WriteLine(e.Message());
        } finally {
            conn.Close();
        }
        return list;
    }
}
