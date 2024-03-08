// Date
let today = new Date()

console.log(today)
console.log(today.getDay()) // returns weekday counter
console.log(today.getDate(), "/ ",  (today.getMonth() + 1),  "/ ", today.getFullYear() );
// Always add 1 to  month bcos month starts from 0 in JAVASCRIPT

let myDate = new Date("2024-06-14") // yyyy-mm-dd
let myDate1 = new Date(2024, 7, 15) // 2024-06-14
console.log(myDate.toDateString())
console.log(myDate)

// date difference 
let date = new Date("2023-12-15")
let dob = new Date("1997-06-14");
// console.log(today-dob)
let diff = date.getFullYear() - dob.getFullYear();
console.log(diff);


// convert date to epoch
let date2 = new Date("1997-06-14");
let epochval = date2.valueOf() / 1000;
console.log(epochval);

// convert epoch to date
let epochDate = new Date(epochval * 1000)
console.log(epochDate)
console.log(epochDate.toUTCString())


