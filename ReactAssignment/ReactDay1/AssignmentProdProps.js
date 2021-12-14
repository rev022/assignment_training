import React from 'react' ;

const AssignmentProdProps =(props)=>{

    return(
        <div>
            <h1>Products {props.name} {props.price} {props.image}</h1>

            <h2>{props.children}</h2>
        </div>
    );

}
export default AssignmentProdProps;