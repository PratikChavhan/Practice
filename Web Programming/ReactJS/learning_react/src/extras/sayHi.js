import { useState } from "react"

export default function SayHi() {
    let[msg,setmsg] = useState("")
    return (
        <div className="Div1">
            <input type="button" value="SayHI" onClick={()=>{setmsg("HI"); console.log(msg)}} />
            <input type="button" value="SayBye" onClick={()=>{setmsg("BYE"); console.log(msg)}} />
            <p>{msg}</p>
        </div>
    )
}