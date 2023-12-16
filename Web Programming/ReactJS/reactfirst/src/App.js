import Welcome, { Greeting } from "./welcome"

// Functional React Component
function App() {
  let x = <p>Hello World</p>;
  console.log("type of x", typeof(x))
  return  <> 
            <p><b>Hello World</b></p> 
            <Welcome></Welcome>
            <Greeting></Greeting>
          </>

}

export default App;
