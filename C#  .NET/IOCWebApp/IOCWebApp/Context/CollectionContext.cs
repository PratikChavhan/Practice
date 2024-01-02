using Microsoft.EntityFrameworkCore;
using MySql.Data.MySqlClient;
using drinks;

namespace Contexts;

public class CollectionContext : DbContext
{
    public DbSet<Softdrinks> Softdrinks { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
    {
        string conString = "server=127.0.0.1;uid=root;" + "pwd=root;database=dbt";
        optionsBuilder.UseMySQL(conString);
    }

    protected override void OnModelCreating(ModelBuilder modelBuilder)
    {
        base.OnModelCreating(modelBuilder);
        modelBuilder.Entity<Softdrinks>(entity =>
        {
            entity.Property(e => e.ID);
            entity.Property(e => e.NAME);
            entity.Property(e => e.RATE);
        });
    }
}
