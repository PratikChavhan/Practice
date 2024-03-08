using System.Collections.Generic;
using drinks;
using Repositories;

namespace Services;

public class DrinksServices : IDrinksServices
{
    private IDrinksRepository _repo;
    public DrinksServices()
    {
        DrinksRepository repository = new DrinksRepository();
        this._repo = repository;
    }

    public List<Softdrinks> GetSoftdrinks()
    {
        if (_repo != null)
        {
            return _repo.GetSoftdrinks();
        }
        return null;
    }
    Softdrinks IDrinksServices.GetSoftdrinksById(int id)
    {
        return _repo.GetSoftdrinksById(id);
    }

    bool IDrinksServices.Insert(Softdrinks drink)
    {
        return _repo.Insert(drink);
    }

    bool IDrinksServices.Update(Softdrinks drink)
    {
        return _repo.Update(drink);
    }

    bool IDrinksServices.Delete(int id)
    {
        return _repo.Delete(id);
    }

}