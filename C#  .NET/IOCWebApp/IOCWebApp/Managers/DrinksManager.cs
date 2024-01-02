using System.Collections.Generic;
using System;
using System.Linq;
using drinks;
using Contexts;

namespace Repositories
{
    public class DrinksManager : IDrinksManager
    {
        public bool Delete(int id)
        {
            using (var context = new CollectionContext())
            {
                context.Softdrinks.Remove(context.Softdrinks.Find(id));
                context.SaveChanges();
            }
            return true;
        }

        public List<Softdrinks> GetSoftdrinks()
        {
            using (var context = new CollectionContext())
            {
                var drinks = from drink in context.softdrink select drink;
                return drinks.ToList<Softdrinks>();
            }
        }

        public Softdrinks GetSoftdrinksById(int id)
        {
            using (var context = new CollectionContext())
            {
                var drinks = context.softdrink.Find(id);
                return drinks;
            }
        }

        public bool Insert(Softdrinks drink)
        {
            using (var context = new CollectionContext())
            {
                context.softdrink.Add(drink);
                context.SaveChanges();
            }
            return true;
        }

        public bool Update(Softdrinks drink)
        {
            using (var context = new CollectionContext())
            {
                var theDrink = context.softdrink.Find(softdrink.ID);
                theDrink.ID = softdrink.ID;
                theDrink.NAME = softdrink.NAME;
                theDrink.RATE = softdrink.RATE;
                context.SaveChanges();
            }
            return true;
        }
    }
}