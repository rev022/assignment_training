import React, {Component} from "react";
import AssignmentProdProps from "./AssignmentProdProps";

class AssignmentProdComp extends Component {
    render() {
        return(
            <div>
                <h1> This is my Product  component</h1>
                <AssignmentProdProps name=" Mobile " price={25000} >
                    <img src="images/mobile.jpg" width="150" height="150"/>
                    <p>This is child of student with product details</p>
                </AssignmentProdProps>
                
            </div>
        );
    }

}
export default AssignmentProdComp;