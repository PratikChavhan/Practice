import React from "react"
import "./hello.css"

export default class Hello extends React.Component {
    render() {
        return (
            <div className="outline" style={{backgroundColor:this.props.color1}}>
                    <p style={{backgroundColor:this.props.color2}}>
                        Hello {this.props.name}
                    </p>
                    <div className="inner" style={{backgroundColor:this.props.color3, borderColor:this.props.color4}}>
                    This is a second div
                </div>
            </div>
        )
    }
}