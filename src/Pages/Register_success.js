import React from "react";
import { Link } from "react-router-dom";

export default class Register_success extends React.Component
{
    render(){
        return(
            <div>
                <br/>
                <br/>
                <h3>Thank You for Registration</h3>
                <h4><Link to ="/login">Click here to Login</Link></h4>
            </div>
        )
    }
}