import React from "react";
import {Navigate} from 'react-router-dom';
function Logout()
{
    return(
        <div className="container col-md-8">
             <Navigate to="/login" replace={true} />
        </div>
    );
}
export default Logout;