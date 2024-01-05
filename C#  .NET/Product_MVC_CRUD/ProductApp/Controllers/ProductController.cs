using System.Diagnostics;
using BLL;
using BOL;
using Microsoft.AspNetCore.Mvc;
using ProductApp.Models;

namespace ProductApp.Controllers;

public class ProductController : Controller
{
    private readonly ILogger<ProductController> _logger;

    public ProductController(ILogger<ProductController> logger)
    {
        _logger = logger;
    }

    public IActionResult Index()
    {
        ProductFun pf = new ProductFun();
        List<Product> lp =pf.GetProducts();
        ViewData["products"]=lp;
        return View();
    }
}
