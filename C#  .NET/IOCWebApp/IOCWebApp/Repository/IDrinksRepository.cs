using System;
using System.Collections.Generic;
using drinks;

namespace Repositories
{
    public interface IDrinksRepository
    {
        List<Softdrinks> GetSoftdrinks();
        Softdrinks GetSoftdrinksById(int id);
        bool Insert(Softdrinks drink);
        bool Update(Softdrinks drink);
        bool Delete(int id);
    }
}