import React, { useState, useEffect } from "react";
import axios from "axios";

function CustomerOrderDetails() {
    const [order, setOrder] = useState({
        "orderid": 0,
        "totalprice": 0,
        "orderdate": "",
        "orderstatus": "",
        "items": [ {
            "oiid": 0,
            "product": {
                "pid": 0,
                "pname": "",
                "rate": 0
            },
            "quantity": 0,
            "amount": 0
        }]
    });

    const queryParams = new URLSearchParams(window.location.search);
    const cid = queryParams.get('cid');

    const getOrder = () => {
        axios.get("http://localhost:8080/getOrder?cid="+cid).then((response) => {
            try{
                setOrder(response.data);
            }   
            catch{
                setOrder({ "orderid": 0,
                "totalprice": 0,
                "orderdate": "",
                "orderstatus": "",
                "items": [] })
            } 
            });
    }

    useEffect(() => {
        getOrder();
    }, [])

    return (
        <div className="container col-md-8">
            <br/>
            <br/>
            <h4>Customer Orders</h4>
            <br/>
            <table className="table table-bordered">
                <tr>
                    <th>Order Id</th>
                    <th>Product</th>
                    <th>Rate(Rs/Kg)</th>
                    <th>Quantity(Kg)</th>
                    <th>Amount(Rs)</th>
                    <th>Status</th>
                </tr>
                <tbody>
                    {
                     Array.isArray(order.items)
                     ?
                     order.items?.map((s) =>
                        <tr>
                            <td>
                                {order.orderid}
                            </td>
                            <td>
                                {s.product.pname}
                            </td>
                            <td>
                                {s.product.rate}
                            </td>
                            <td>
                                {s.quantity}
                            </td>
                            <td>
                                {s.amount}
                            </td>
                            <td>
                                {order.orderstatus}
                            </td>
                       </tr>
                    ): <tr>
                    <td>{"No data available"}</td>
                    <td>{0}</td>
                    <td>{0}</td>
                    <td>{0}</td>
                    </tr>}
                </tbody>
            </table>
        </div>
    );
}

export default CustomerOrderDetails;