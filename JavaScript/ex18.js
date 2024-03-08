// prototypes in js

// objects without class
let obj_1 = { name: "pratik", city: "pune" }
let pro_1 = { age: 26, qualification: "BE" }
let pro_2 = { hobbies: "gaming" }

console.log(obj_1);
console.log(pro_1);
console.log(pro_2);

// ------ Prototype Chaining ---------
Object.setPrototypeOf(obj_1, pro_1);
Object.setPrototypeOf(pro_1, pro_2);

console.log("\nAfter prototype chaining");
console.log("object obj_1: ", obj_1);
console.log("prototype of obj_1: ", Object.getPrototypeOf(obj_1));
console.log();
console.log("object pro_1: ", pro_1);
console.log("prototype of obj_2: ", Object.getPrototypeOf(pro_1));
console.log();
console.log("object pro_2: ", pro_2);
console.log("prototype of pro_2: ", Object.getPrototypeOf(pro_2));
