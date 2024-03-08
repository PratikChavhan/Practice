// functions and parameters
function add(x, y) {
    return x + y
}

let result = add(2, 3)  // 5
result = add(12)    // Nan
result = add(12, 13)    // 25
result = add("hello ", "world") // hello world
result = add("12 ", "13")   // 12 13
result = add(10, 20, 30, 40, 50)    // 30

console.log(result)

function sum(x = 30, y = 20){
    return x + y
}

let answer = sum()
answer = sum(100)

console.log(answer);
