import React, {Component} from "react";
import StudProps from "./StudProps";


class StudComponent extends Component {
    render() {
        return(
            <div>
                <h1> This is my student component</h1>
                <StudProps name=" Revathi " id={124} marks={100}>
                    <p>This is child of student with student details</p>
                </StudProps>
                
            </div>
        );
    }

}
export default StudComponent;