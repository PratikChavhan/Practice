const x = 44
console.log(x, typeof(x))

// x = 20  // cannot  change
// console.log(x, typeof(x)) //error

var p = 100
{
    let p = 200
    console.log(p)
}

console.log(p, typeof(p))

// cannot use variable before declaration
// using let -> error
// using var -> undefined, bos it is a global variable
console.log(g)

// let g = 10 // error
var g = 10
