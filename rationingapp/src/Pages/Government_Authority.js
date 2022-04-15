import React from "react";
import {Link} from 'react-router-dom';

function Government_Auhtority()
{
    return(
        <div className="container col-md-8">
            <h3 className="mb-3" style={{ color: "brown", textAlign: "center" }}>Welcome Government_Auhtority</h3>
            <div>
                
            </div>
            <div>
                <ul style={{textAlign:"left" ,fontSize:"20px"}}>
                    <li><Link to="/custreg">Customer_Registration</Link></li>
                    <li> <Link to="/retreg">Retailer_Registration</Link></li>
                    <li><Link to="/logout">Logout</Link></li>
                </ul>
            </div>
        </div>
    );
}

export default Government_Auhtority;