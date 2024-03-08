// Regular Expression

let regex1 = /abc/
let ip1 = "abdabcababc";
console.log(ip1.match(regex1)); 
console.log(typeof(regex1)); // object


let regex2 = /abc/i    // i = case insensitive
let ip2 = "AbdAbCababc";
console.log(ip2.match(regex2));


let regex3 = /[a-z]/i
// let ip3 = "AAa10bcde"; // null
let ip3 = "AAabcde"
console.log(ip3.match(regex3));


let regex4 = /[A-Ra-z]/    // [range]  ---> finds only single character
// let ip4 = "SNApp";
let ip4 = "1RESttful";
console.log(ip4.match(regex4));


let regex5 = /^[A-D][a-d]+m$/  // ^  ---> begins with,  +  ----> one or more occurrences,  $  ----> ends with
let ip5 = "Adam";
// let ip5 = "Adamn";
// let ip5 = "Damn";
console.log(ip5.match(regex5)); 



let regex6 = /^[A-D][a-d]*m$/  // *  ----> zero or more occurrences
let ip6 = "Dm";
// let ip6 = "Adam";
// let ip6 = "Doam";
console.log(ip6.match(regex6)); 


// {a}  ----> number of occurrences, a (no of times)
let regex7 = /[A-Z]+[0-9]{3,5}/  // {a,b}  ----> number of occurrences, a (min no of times)   b (max no of times)
// let ip7 = "DUD123";
// let ip7 = "Dud123";
// let ip7 = "DUD123456789";
let ip7 = "aDUD123D";
console.log(ip7.match(regex7)); 


let regex8 = /./  // .  ----> zero or more occurrences
let ip8 = "D";
// let ip8 = "a";
// let ip8 = "&";
// let ip8 = "@A"
console.log(ip8.match(regex8)); 


let regex9 = /[0-9]?/  // ?  ----> zero or one occurrence
let ip9 = "1";
// let ip9 = "";
// let ip9 = "abc";
console.log(ip9.match(regex9)); 



//match email address
let regex10 = /^[A-Za-z]+[0-9\.]+@[a-z]+\.com/
// let ip10 = "pratik.chavhan.77@gmail.com";
// let ip10 = "132pratikchavhan445@gmail.com";
let ip10 = "pratikchavhan445@.com";
console.log(ip10.match(regex10))


