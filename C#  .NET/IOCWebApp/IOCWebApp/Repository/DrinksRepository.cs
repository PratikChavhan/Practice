using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Hosting;
using Microsoft.Extensions.Configuration;
using Microsoft.Extensions.Hosting;
using Microsoft.Extensions.Logging;
using drinks;

namespace Repositories
{
    public class DrinksRepository : IDrinksRepository
    {
        IDrinksManager _pManager;

        public DrinksRepository()
        {
            _pManager = new DrinksManager();
        }
        public List<Softdrinks> GetSoftdrinks()
        {
            return _pManager.GetSoftdrinks();
        }

        public Softdrinks GetSoftdrinksById(int id)
        {
            return _pManager.GetSoftdrinksById(id);
        }
        public bool Insert(Softdrinks drink)
        {
            return _pManager.Insert(drink);
        }
        public bool Update(Softdrinks drink)
        {
            return _pManager.Update(drink);
        }

        public bool Delete(int id)
        {
            return _pManager.Delete(id);
        }
    }
}