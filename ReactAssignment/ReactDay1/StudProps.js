import React from 'react' ;

const StudProps =(props)=>{

    return(
        <div>
            <h1>My Props example{props.name} {props.id} {props.marks}</h1>

            <h2>{props.children}</h2>
        </div>
    );

}
export default StudProps;