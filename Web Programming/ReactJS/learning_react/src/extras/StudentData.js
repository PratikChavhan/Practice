import React from 'react'
import EducationDetails from '../extras/EducationDetails'

export default class StudentData extends React.Component {
    constructor() {
        super();
        this.state={flag:false}
        this.handler=this.handler.bind(this);
    }
    handler(event) {
        this.setState({flag:event.target.checked})
    }

    render() {
        return(
            <div>
                   <p>Name: Pratik Chavhan</p>
                   <p>DOB: 14/06/1997</p>
                   <p>Email: pratik.chavhan.77@gmail.com</p>
                   <p>Education Details: <input type="checkbox" onClick={this.handler}/></p>
                   {this.state.flag && <EducationDetails></EducationDetails>}

            </div>
        )
    }
}