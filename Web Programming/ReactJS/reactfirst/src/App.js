// import Welcome, { Greeting } from "./welcome"
// import Maths from "./maths"
// import IdCard from "./idcard"
import Total from "./total"

// Functional React Component
function App() {
  let x = <p>Hello World</p>;
  console.log("type of x", typeof(x))
  let obj = {name:"pratik", dob:"1997-06-14", phone:"6824684465"}
  let arr = [10, 20, 30, 40, 50, 60]
  return  <> 
            {/* <p><b>Hello World</b></p>  */}
            {/* <Welcome></Welcome> */}
            {/* <Greeting></Greeting> */}
            <Maths num1={10} num2={20} op={"*"}></Maths>
            {/* <IdCard obj={obj}></IdCard> */}
            <Total num={arr}></Total>
          </>

}
   
export default App;
