import React from "react";

export default class HalfString extends React.Component{
    constructor() {
        super();
        this.state={str:""}
        // this.handler = this.handler.bind(this)
    }

    // for writing handler function you have to bind this with handler in the constructor
    // handler(event) {
    //     let s = event.target.value
    //     console.log(s)
    //     let hstr = s.substring(0,s.length/2).toUpperCase();
    //     this.setState({str:hstr})
    // }

    handler=(event)=>{
            let s = event.target.value
            // console.log(s)
            let hstr = s.substring(0,s.length/2).toUpperCase();
            this.setState({str:hstr})
        }

    render() {
        return (
            <>
                Enter String: <input type="text" onBlur={this.handler} />
                <br />
                <p>Output: {this.state.str}</p>
            </>
        )
    }
}