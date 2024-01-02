using Microsoft.AspNetCore.Mvc;
using drinks;
using Services;


namespace Controllers;

[ApiController]
[Route("[controller]")]
public class DrinksController : ControllerBase
{
    //Each action method is mapped to HTTP Request type
    private IDrinksServices _svc;
    public DrinksController(IDrinksServices svc)
    {
        this._svc = svc;
    }

    //action method
    [HttpGet]
    [Route("api/drinks")]
    public IActionResult GetDrinks()
    {
        //invoke service method to resturn products
        // send received data as message to outside world
        try
        {
            var message = _svc.GetDrinks();
            if (message == null)
            {
                return NotFound();
            }
            return Ok(message);
        }
        catch (Exception)
        {
            return BadRequest();
        }
    }

    [HttpPost]
    [Route("api/drinks")]
    public IActionResult Insert([FromBody] Softdrinks drink)
    {
        try
        {

            bool status = _svc.Insert(drink);
            if (status == false)
            {
                return BadRequest();
            }
            else
            {
                return Ok();
            }
        }
        catch (Exception e)
        {
            Console.WriteLine(e.Message);
            return BadRequest();
        }
    }

    [HttpGet("api/drinks/{id}")]
    public IActionResult GetById(int id)
    {
        try
        {

            var message = _svc.GetSoftdrinksById(id);
            if (message == null)
            {
                return BadRequest();
            }
            else
            {
                return Ok(message);
            }
        }
        catch (Exception)
        {
            return BadRequest();
        }
    }

    // GET: api/Products/5
    [HttpDelete("api/drinks/{id}")]
    public IActionResult Delete(int id)
    {
        try
        {
            bool status = _svc.Delete(id);
            if (status == false)
            {
                return BadRequest();
            }
            else
            {
                return Ok();
            }
        }
        catch (Exception)
        {
            return BadRequest();
        }
    }

    [HttpPut("api/drinks")]
    public IActionResult Update(Softdrinks drink)
    {
        try
        {
            bool status = _svc.Update(drink);
            if (status == false)
            {
                return BadRequest();
            }
            else
            {
                return Ok();
            }
        }
        catch (Exception)
        {
            return BadRequest();
        }
    }
}