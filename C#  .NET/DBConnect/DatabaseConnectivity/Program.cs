using System.Data;
using System.Runtime.InteropServices;
using Google.Protobuf;
using MySql.Data.MySqlClient;
using Org.BouncyCastle.Tls;

Console.WriteLine("Welcome to database!!!");

MySqlConnection conn = new MySqlConnection();

conn.ConnectionString = "server=192.168.10.150;port=3306;username=dac16;password=welcome;database=dac16";

// string query = "select * from products";
// string query = "select count(*) from products";
// string query = "update products set ProductName='qwertyuiopasdfghjklzcvbnm' where ProductID = 1";


Console.WriteLine("Enter Product ID: ");
int id = Console.Read();

string query = "delete from products where ProductID = @id";
MySqlCommand command = new MySqlCommand(query,conn);


command.Parameters.AddWithValue("@id",id);

try {
     conn.Open();
    // DQL
    //  MySqlDataReader reader = command.ExecuteReader();
    //  while(reader.Read()){
    //     // reader["colname"].ToString()
    //     int pid = int.Parse(reader["ProductID"].ToString());
    //     string pname = reader["ProductName"].ToString();
    //     float unit_price = float.Parse(reader["UnitPrice"].ToString());
    //     Console.WriteLine("ProductID: " + pid + "\tProductName: " + pname + "\t\tUnit_Price: " + unit_price);
    // }
    // MySqlDataReader reader = command.ExecuteScalar();    // Not OK

    // Aggregate Operations
    // int count = int.Parse(command.ExecuteScalar().ToString());
    // Console.WriteLine( "Number of products: "+ count);

    // DML
    command.ExecuteNonQuery();
     
    } catch(Exception e) {
    Console.WriteLine(e.Message);
}
finally{
    conn.Close();
}