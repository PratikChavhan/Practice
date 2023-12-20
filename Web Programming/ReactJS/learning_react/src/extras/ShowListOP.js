import { useState } from 'react'

export default function ShowListOP() {
    let arr = ["Mumbai", "Thane", "Pune", "Nashik", "Solapur", "Amravati"];
    let [oList, setOList] = useState([]);
    let [uList, setUList] = useState([]);
    let [tbl, settbl] = useState([]);
    function handler(event) {
        let e = event.target.value;
        switch(e) {
            case "ol":
                setOList(arr.map((ele, index)=>{return <li id={index}>{ele}</li>}));
                break;
            
            case "ul":
                setUList(arr.map((ele, index)=>{return <li id={index}>{ele}</li>}))
                break;
            
            case "tb":
                settbl(arr.map((index,ele)=>{
                    return (<tr><td>{ele}</td><td>{index}</td></tr>)}))
                break;
            
            default: break;
        }
    }

    return (
        <>
            Ordered List: <input type="radio" name="list" value="ol" onClick={handler} />
            <br />Unordered List: <input type="radio" name="list" value="ul" onClick={handler} />
            <br />PrintTable: <input type="radio" name="list" value="tb" onClick={handler} />
            {oList && <ol>{oList}</ol>}
            {uList && <ul>{uList}</ul>}
            {tbl && <table border="1"> {tbl} </table>}
        </>
    )
}