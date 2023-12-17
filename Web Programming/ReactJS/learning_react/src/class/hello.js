import React from "react"

export default class Hello extends React.Component {
    render() {
        return (
            <div className="outline">
                <div className="inner">
                    <p>
                        Hello {this.props.name}
                    </p>
                </div>
                <div className="inner">
                    This is a second div
                </div>
            </div>
        )
    }
}