import React, { useState, useEffect } from "react";
import axios from "axios";

function RetailerStock() {
    const [stock, setStock] = useState([]);

    const queryParams = new URLSearchParams(window.location.search);
    const rid = queryParams.get('rid');

    const getStock = () => {
            axios.get("http://localhost:8080/getRetailerStock?rid="+rid).then((response) => {
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
            <h4>Retailer Product Stock</h4>
            <br/>
            <table className="table table-bordered"> 
                <tr>
                    <th>Product</th>
                    <th>Allocated quantity(Kg)</th>
                    <th>Available quantity(Kg)</th> 
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

export default RetailerStock;