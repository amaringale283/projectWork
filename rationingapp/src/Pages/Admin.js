import React from "react";
import {Link} from 'react-router-dom';
function Admin()
{
    return(
        <div className="container col-md-8">
            <h3 className="mb-3" style={{ color: "brown", textAlign: "center" }}>Welcome Admin</h3>
            <div>
                
            </div>
            <div>
                <ul style={{textAlign:"left",fontSize:"20px"}}>
                    <li><Link to="/getAdminStock">Get Stock Details</Link></li>
                    <li><Link to="/gareg">Register Government Authority</Link></li>
                    <li><Link to="/retreg">Register Retailer</Link></li>
                    <li><Link to="/custreg">Register Customer</Link></li>
                    <li><Link to="/logout">Logout</Link></li>
                </ul>
            </div>
        </div>
    );
}
export default Admin;