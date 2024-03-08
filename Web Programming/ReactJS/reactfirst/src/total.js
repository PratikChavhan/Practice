export default function Total({num}) {
    // let num = [10, 20, 30, 40, 50, 60]
    console.log(num)
    let addition = 0;
    for(let i = 0; i<num.length; i++){
        addition += num[i];
    }
    return (
        <>
        <p>Array Addition: {addition}</p>
        </>
    )
}