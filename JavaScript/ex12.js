// Closures  ---> function that are called by another function
// Callback

function makeAdder(x) {
    return function (y) { return x + y }
}

const add2 = makeAdder(2);
console.log(add2);

const add3 = makeAdder(3);

const add7 = makeAdder(7);

console.log(add2(5));
console.log(add3(5));
console.log(add7(5));
