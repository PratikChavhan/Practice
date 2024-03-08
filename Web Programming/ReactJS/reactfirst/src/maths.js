export default function Maths(props)
{
    let n1 = props.num1;
    let n2 = props.num2;
    let op = props.op;
    
    let result;
    switch(op){
        case "+" : result = n1 + n2; break;
        case "-" : result = n1 - n2; break;
        case "*" : result = n1 * n2; break;
        case "/" : result = n1 / n2; break;
        default : result = NaN; break;
    }

    return (
        <>
        <p1>{n1} {op} {n2} = {result}</p1>
        </>
    )
}

