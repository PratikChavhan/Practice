import Hello from '../extras/hello'
import { useState } from 'react'

function App1() {
    let[col1,setcol1] = useState("yellow")
    let[col2,setcol2] = useState("red")
    let[col3,setcol3] = useState("green")
    let[col4,setcol4] = useState("white")
    function handler1(event) {
        // console.log("event called")
        console.log(event.target.value)
        setcol1(event.target.value)
    }
    function handler2(event) {
        // console.log("event called")
        console.log(event.target.value)
        setcol2(event.target.value)
    }
    function handler3(event) {
        // console.log("event called")
        console.log(event.target.value)
        setcol3(event.target.value)
    }
    function handler4(event) {
        // console.log("event called")
        console.log(event.target.value)
        setcol4(event.target.value)
    }
    return (
        <>
            Choose Color1:<input type="color" onChange={handler1} />
            Choose Color2:<input type="color" onChange={handler2} />
            Choose Color3:<input type="color" onChange={handler3} />
            Choose Border Color:<input type="color" onChange={handler4} />
            <Hello name={"Pratik"} color1={col1} color2={col2} color3={col3} color4={col4}></Hello>
        </>
    )
}

export default App1