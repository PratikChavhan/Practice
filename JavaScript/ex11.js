// Functions

// 1. Normal function: function having name and created with function() keyword
// 2. Lambda function: function with no name but created with function() keyword
// 3. Fat Arrow function: function which has only parameters and body

// 1. Normal Function ---> Hoisting Supported
let x = 10, y = 5;
let addition = add(x, y)
console.log(`addition: ${x} + ${y} = ${addition}`)

function add(x, y) {
    return x+y;
}


// 2. Anonymous Function LAMBDA FUNCTION   ---> Hoisting NOT Supported 
let x1 = 10, y1= 5;
let  substraction = function(x1, y1) {return (`substraction: ${x1} - ${y1} = ${x1 - y1}`)}
console.log(substraction(x1,y1));


// 3. Fat Arrow Function   ---> Hoisting NOT Supported 
let x2 = 10, y2 = 5;
let  division = (x2, y2) => {return (`division: ${x2} / ${y2} = ${x2 / y2}`)}
console.log(division(x2,y2));

