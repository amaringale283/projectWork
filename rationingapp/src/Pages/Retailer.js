import React, { useState, useEffect}  from "react";
import { Link} from 'react-router-dom';
import axios from "axios";

function Retailer()
{
    const [rid, setRid] = useState(0);

    const queryParams = new URLSearchParams(window.location.search);
    const id = queryParams.get('loginid');

    const loadDataOnlyOnce = () => {
        axios.get("http://localhost:8080/getRid?id="+id).then((response) => {
            console.log(response.data);
            setRid(response.data);
        });
    }

    useEffect(() => {
        loadDataOnlyOnce();
      }, [])

    return(
        <div className="container col-md-8">
            <h3 className="mb-3" style={{ color: "brown", textAlign: "center" }}>Welcome Retailer</h3>
            <div>
            </div>
            <div>
                <ul style={{textAlign:"left" ,fontSize:"20px"}}>
                    <li><Link to={"/getRetailerStock?rid="+rid}>Get Allocated Stock Details</Link></li>
                    <li> <Link to={"/getOrderDetailsPerRetailer?rid="+rid}>View Order Details</Link></li>
                    <li><Link to="/logout">Logout</Link></li>
                </ul>
            </div>
        </div>
    );
}
export default Retailer;