// stringify -> convert json object to string
let obj1 = {fname:"Pratik", lname:"Chavhan", Address:{area:"Model Colony", city:"Pune", state:"Maharashtra"}};
console.log("JSON object");
console.log(obj1);
console.log('\nStringified object');
let str = JSON.stringify(obj1);
console.log(typeof(str), str);

// JSON-parse -> convert stringified object to JSON object
let obj2 = JSON.parse(str);
console.log('\nstringified to JSON')
console.log(typeof(obj2), obj2)

// access obj element
console.log(obj1.fname)
console.log(obj1["lname"])
console.log(obj1["fname"], obj1["lname"])
console.log(obj1["Address"]["area"], obj1["Address"]["city"])
console.log(obj1.Address.area, obj1.Address.city)
