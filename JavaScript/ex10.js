// Arrays

let arr1 = [1, 2, 3.123, "Hello", ["World", 5, 6, true]];
console.log(arr1);

// pushing elements in array
arr1.push(10);
console.log(arr1);

arr1.push(20, 30, 40);
console.log(arr1);

arr1.push([100, 200, 300]);
console.log(arr1);


// accessing array elements
console.log(arr1[3]);

console.log(arr1[3], arr1[4][0]);

console.log(arr1[3][2]);


// pop  ---> deletes and returns last elements in the array
console.log(arr1.pop())
console.log(arr1)
console.log(arr1.pop(3))


// splice array [start, count, elements to at start]
// deletes n no of elements from the array or replace any element from or add any no of elements to the array at start index
console.log(arr1)
console.log(arr1.splice(0,2))

console.log(arr1)
console.log(arr1.splice(2, 1, "replaced element"));
console.log(arr1)

console.log(arr1.splice(3, 0, "new1", "new2", "new3"))
console.log(arr1)
