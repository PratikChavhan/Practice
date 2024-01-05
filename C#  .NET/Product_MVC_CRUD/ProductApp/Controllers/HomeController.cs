using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using ProductApp.Models;
using BLL;
using System.Media;

namespace ProductApp.Controllers;

public class HomeController : Controller
{
    private readonly ILogger<HomeController> _logger;

    public HomeController(ILogger<HomeController> logger)
    {
        _logger = logger;
    }

    public IActionResult Index()
    {
        return View();
    }

    public IActionResult Login()
    {
        return View();
    }

    [HttpPost]
    public IActionResult Login(string username,string pass)
    {
        ProductFun pf = new ProductFun();
        bool status=pf.UserVerify(username,pass);
        if(status==true){
            Console.WriteLine("successfully login");
          return this.RedirectToAction("Index","Product");
        }
        
        return View();
    }

    public IActionResult Signup()
    {
        return View();
    }

    [HttpPost]
    public IActionResult Signup(string email,string username,string pass)
    {
        ProductFun pf = new ProductFun();
        pf.signup(email,username,pass);
        return View();
    }



     public IActionResult Delete()
    {
          return View(); 
    }
    [HttpPost]
    public IActionResult Delete(string username)
    {
        ProductFun pf = new ProductFun();
        pf.DeleteUser(username);
        Console.WriteLine("username successfully deleted "+username);
        return View(); 
    }

         public IActionResult Update()
    {
          return View(); 
    }
        [HttpPost]
        public IActionResult Update(string username,string nusername)
    {
        ProductFun pf = new ProductFun();
        pf.UpdateUser(username,nusername);
        Console.WriteLine("username successfully updated "+nusername);
        return View(); 
    }

    public IActionResult Privacy()
    {
        return View();
    }

    [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
    public IActionResult Error()
    {
        return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
    }
}
