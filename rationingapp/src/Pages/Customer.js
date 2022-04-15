import React, { useState, useEffect} from "react";
import {Link} from 'react-router-dom';
import axios from "axios";

function Customer()
{
    const [cid, setCid] = useState(0);

    const queryParams = new URLSearchParams(window.location.search);
    const id = queryParams.get('loginid');

    const loadDataOnlyOnce = () => {
        axios.get("http://localhost:8080/getCid?id="+id).then((response) => {
            setCid(response.data);
        });
    }

    useEffect(() => {
        loadDataOnlyOnce();
      }, [])

       return(
        <div className="container col-md-8">
            <h3 className="mb-3" style={{ color: "brown", textAlign: "center" }}>Welcome Customer</h3>
            <div>
                
            </div>
            <div>
                <ul style={{textAlign:"left",fontSize:"20px"}}>
                    <li><Link to={"/getCustomerStock?cid="+cid}>Get Allocated Stock Details</Link></li>
                    <li> <Link to={"/saveOrder?cid="+cid}>Place Order</Link></li>
                    <li> <Link to={"/getOrderDetails?cid="+cid}>View Order Details</Link></li>
                    <li><Link to="/logout">Logout</Link></li>
                </ul>
            </div>
        </div>
    );
}

export default Customer;