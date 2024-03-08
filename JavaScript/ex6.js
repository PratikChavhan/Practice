// comparision operator

//  ==   ---> compares value
//  ===  ---> compares datatype and address

let s1 =  "hello"
let s2 = "hello"
let s3 = new String("hello")
let s4 = new String("hello")

console.log("s1 = ",s1, "\ns2 = ", s2, "\ns3 = ", s3, "\ns4 = ", s4)

// primitive == primitive  ----> values are compared
// primitive == object   -----> object is converted to primitive and then values are compared
// object == object    -----> addresses is compared

console.log("s1 == s2 ----> ", s1 == s2)
console.log("s1 == s3 ----> ", s1 == s3)
console.log("s3 == s4 ----> ", s3 == s4)

// primitive  === object  ----> datatype and address of both opreands are compared

console.log("s1 === s2 ----> ", s1 === s2)
console.log("s1 === s3 ----> ", s1 === s3)
console.log("s3 === s4 ----> ", s3 === s4)

