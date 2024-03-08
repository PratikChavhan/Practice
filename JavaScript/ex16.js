// passing function as a parameter to another function

function doJob(f1) {
    for (var i = 0; i < 3; i++) {
        f1();
    }
}

// calling the function
doJob(() => { console.log("hello") });

// hoisting
console.log("----------");
test();
console.log("----------");

function test() {
    console.log("test")
};

console.log("---- doJob ----");
doJob(test);

let v = function () {
    console.log("bye")
};

console.log("---- doJob ----");
doJob(v);
