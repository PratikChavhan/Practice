using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using Prod_MVC.Models;
using BLL;
using BOL;
using DAL;

namespace ProductController;

public class ProductController : Controller
{
    private readonly ILogger<ProductController> _logger;

    public ProductController(ILogger<ProductController> logger)
    {
        _logger = logger;
    }

    public IActionResult Index()
    {
        return View();
    }

    public IActionResult Plist()
    {
        ProductCatalog pc = new ProductCatalog();
        List<Product> plist = pc.Plist();
        ViewData["plist"] = plist;
        return View();
    }

    [HttpGet]
    public IActionResult Add()
    {
        return View();
    }

    [HttpPost]
    public IActionResult Add(int pid, string pname, int uprice, int splid)
    {
        DBManager db = new DBManager();
        db.Add(pid, pname, uprice, splid);
        return View();
    }

    [Route("Product/Edit/{pid}")]
    public IActionResult Edit(int pid)
    {
        ProductCatalog pc1 = new ProductCatalog();
        Product pc = pc1.getById(pid);
        return View(pc);
    }

    [HttpPost]
    [Route("Product/Edit/{id}")]
    public IActionResult Edit(int pid, string pname, int uprice, int splid)
    {
        ProductCatalog pcat = new ProductCatalog();
        bool status = pcat.Update(pid, pname, uprice, splid);
        if (status)
        {
            return this.RedirectToAction("Productlist");


        }
        return View();
    }

}
