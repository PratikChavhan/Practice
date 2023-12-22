// counter factory 

function counterFactory(){
    let count=0;
    function incrementor(){
        return ++count;
    }
    return incrementor;
}

let incr = counterFactory();
incr();
incr();
incr();
incr();
console.log(incr());
