let x = 3

// conditional statement
if (x%2 == 0)
    console.log(x, "is even")
else
    console.log(x, "is odd")

// switch case statement
switch(x)
{
    case 1: console.log("one"); break;
    case 2: console.log("two") 
            break
    default: console.log("not 1 or 2")
             break
}


// while loop
let a = 1
while(a++ < 5){
    console.log("a = ", a)
}

// do-while
let b=1
do{
    console.log("b = ", b++)
} while(b<5)

// for loop
for(let c = 1; c<=5; c++) {
    console.log("c = ", c)
}

