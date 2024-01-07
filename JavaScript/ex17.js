// writing function inside function

function sayHi(choice) {

    function indian(name) {
        console.log("namaste " + name);
    }
    function us(name) {
        console.log("hi " + name);
    }
    function japanese(name) {
        console.log("konnichiwa " + name);
    }

    switch (choice) {
        case 1: return indian; break;
        case 2: return us; break;
        case 3: return japanese; break;
        default: console.log("wrong choice");
    }
}

console.log(sayHi(1)); // returns a function

let f1 = sayHi(3);  // storing the function in a variable 
console.log(typeof (f1));  // type of f1 is a function
f1("pratik");   // calling f1

