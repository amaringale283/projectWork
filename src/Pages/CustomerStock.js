import React, { useState, useEffect } from "react";
import axios from "axios";

function CustomerStock() {
    const [stock, setStock] = useState([]);

    const queryParams = new URLSearchParams(window.location.search);
    const cid = queryParams.get('cid');

    const getStock = () => {    
            axios.get("http://localhost:8080/getCustomerStock?cid="+cid).then((response) => {
                setStock(response.data);
            });
    };

    useEffect(() => {
        getStock();
    }, [])

    return (
        <div className="container col-md-8">
            <br/>
            <br/>
            <h4>Customer Product Stock</h4>
            <br/>
            <table className="table table-bordered"> 
                <tr>
                    <th>Product</th>
                    <th>Allocated quantity</th>
                    <th>Available quantity</th> 
                    <th>Month</th>
                    <th>Year</th>
                </tr>

                {
                    stock.map((s)=>(
                        <tr>
                            <td>{s.product.pname}</td>
                            <td>{s.allocatedqty}</td>
                            <td>{s.availableqty}</td>
                            <td>{s.month}</td>
                            <td>{s.year}</td>
                        </tr>
                    ))
                }
            </table>
        </div>
    );
}

export default CustomerStock;