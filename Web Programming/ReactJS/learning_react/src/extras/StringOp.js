import React, { useState } from "react";

export default class StringOp extends React.Component{
    constructor(){
        super();
        this.state={str:"N/A"};
        this.handler=this.handler.bind(this);
    }
    handler(event){
        let s=event.target.value;
        // console.log(s);
        this.setState({str:s});
    }
    reverse=(event)=>{
                let rev="";
                for(let i=this.state.str.length; i>=0;i--){
                    rev+=this.state.str.charAt(i);
                }
                this.setState({str:""});
                this.setState({str:rev});
            }
    case=(event)=>{
                let evalue= event.target.value;
                    switch(evalue){
                        case 'uc':  this.setState({str: this.state.str.toUpperCase()}); break;
                        
                        case 'lc':  this.setState({str: this.state.str.toLowerCase()}); break;
                        
                        case 'tc':  let fchar = this.state.str.charAt(0).toUpperCase();
                                    let rchar = this.state.str.substring(1).toLowerCase();
                                    let newstr = fchar+rchar;
                                    this.setState({str:newstr}); 
                                    break;
                    }
            }
    render(){
        return(
            <>
                <p>EnterString: <input type="text" onBlur={this.handler}/></p>
                <p>Reverse: <input type="checkbox" onClick={this.reverse}/></p>
                <pre>Case:<br />
                          UpperCase: <input type="radio" name="case" value="uc" onClick={this.case}/><br />
                          LowerCase: <input type="radio" name="case" value="lc" onClick={this.case}/><br />
                          TitleCase: <input type="radio" name="case" value="tc" onClick={this.case}/>
                </pre>
                <p>Output: {this.state.str}</p>
            </>
        )
    }
}
