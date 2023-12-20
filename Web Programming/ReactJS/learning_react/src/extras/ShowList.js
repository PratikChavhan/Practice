import { useState } from "react"

export default function ShowList() {
    let arr = ["red", "green", "blue", "yellow", "white", "black"];
    let [arr2, setarr2] = useState([]);
    function handler(event){
        console.log(event.target.value);
        setarr2(arr.map((ele)=>{return <li>{ele}</li>}));
        console.log(arr2);
    }     
    return (
        <>
            OrderList: <input type="radio" value="ol" onClick={handler} />
            <ol>{arr2}</ol>
        </>
    )
}