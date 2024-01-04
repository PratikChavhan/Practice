using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using BOL;
using BLL;

namespace Controllers;

public class MenuController : Controller
{
    private readonly ILogger<MenuController> _logger;

    public MenuController(ILogger<MenuController> logger)
    {
        _logger = logger;
    }

    public IActionResult menulist()
    {
        MenuCatlog mcat = new MenuCatlog();
        List<Menu> mlist = new List<Menu>();
        mlist = mcat.GetList();
        ViewData["menulist"] = mlist;
        return View();
    }

    [Route("Menu/Edit/{id}")]
    public IActionResult Edit(int id)
    {
        MenuCatlog mcat = new MenuCatlog();
        Menu m12 = mcat.getById(id);
        return View(m12);
    }

    [HttpPost]
    [Route("Menu/Edit/{id}")]
    public IActionResult Edit(int id, string name, int rate)
    {
        Menu m12 = mcat.getById(id);
        MenuCatlog mcat = new MenuCatlog();
        bool status = mcat.Update(id, name, rate);
        if (status)
        {
            return this.RedirectToAction("menulist");


        }
        return View();
    }


}
