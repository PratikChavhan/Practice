using System.Collections.Generic;
using drinks;

namespace Repositories
{
    public interface IDrinksManager
    {
        List<Softdrinks> GetSoftdrinks();
        Softdrinks GetSoftdrinksById(int id);
        bool Insert(Softdrinks drink);
        bool Update(Softdrinks drink);
        bool Delete(int id);
    }
}
