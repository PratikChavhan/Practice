// function constructor

function Person(name, city) {
    this.name = name;
    this.city = city;
    this.show = function()
    {
        console.log("Name: " + this.name)
    }
}

let p = new Person("Pratik", "Pune")
p.show()