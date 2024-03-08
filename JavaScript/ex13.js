// callback
// counter factory 

function counterFactory(start) {
    let count = start;
    function incrementor() {
        return ++count;
    }
    return incrementor;
}

let incr = counterFactory(500);
incr();
incr();
incr();
incr();
console.log(incr());
