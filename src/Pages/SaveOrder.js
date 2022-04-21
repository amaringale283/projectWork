import React, { useState, useEffect } from "react";
import axios from "axios";
import $ from 'jquery';
//import { useNavigate } from "react-router-dom";

function SaveOrder() {
    //    let navigate = useNavigate();
    const [totalprice, setTotalPrice] = useState(0);
    const [orderdate, setOrderDate] = useState("");
    const [orderstatus, setStatus] = useState("placed");
    const [rid, setRid] = useState(0);
    const [cid, setCid] = useState(0);
    const [items, setItems] = useState([]);
    const [quantity, setQuantity] = useState(0);
    const [pid, setPid] = useState(0);
    const [amount, setAmount] = useState(0.0);
    const [stock, setStock] = useState([]);
    const current = new Date();
    const date = `${current.getFullYear()}-${current.getMonth() + 1}-${current.getDate()} ${current.getHours()}:${current.getMinutes()}:${current.getSeconds()}`;

    const queryParams = new URLSearchParams(window.location.search);
    const id = queryParams.get('cid');

    const sendData = () => {
        const data = {
            totalprice: totalprice, orderdate: date, orderstatus: orderstatus, customer: { cid: id }, retailer: { rid: rid },
            items: [{ quantity: quantity, product: { pid: pid }, amount: amount }]
        };
        axios.post("http://localhost:8080/saveOrder", data).then((response) => {
            console.log(response.data);
        });
    };

    const loadDataOnlyOnce = () => {
        axios.get("http://localhost:8080/getCustomerStock?cid=" + id).then((response) => {
            console.log(response.data);
            setStock(response.data);
        });
    }

    useEffect(() => {
        loadDataOnlyOnce();
    }, [])

    return (
        <div className="container col-md-8">
            <h3 className="mb-3" style={{ color: "brown", textAlign: "center" }}>Order</h3>

            <div className="form-group row" style={{ marginTop: "10px" }}>
                <label className="col-sm-4 col-form-label" style={{ textAlign: "left" }}>Select Retailer</label><br />
                <div className="col-sm-6" style={{ textAlign: "left" }}>
                    <label className="radio-inline" style={{ marginLeft: "10px" }}>
                        <input type="radio" name="rid" value="1" onChange={(event) => {
                            setRid(event.target.value);
                        }} /> Suraj <br /> 8788143482 <br /> Pune, 412210
                    </label>
                    <label className="radio-inline" style={{ marginLeft: "10px" }}>
                        <input type="radio" name="rid" value="2" onChange={(event) => {
                            setRid(event.target.value);
                        }} /> Swapnil <br /> 8888156582 <br /> Kolhapur, 452210
                    </label>
                </div>
            </div>

            <div className="form-group row" style={{ marginTop: "10px" }}>
                <label className="col-sm-4 col-form-label" style={{ textAlign: "left" }}>Select Products</label><br />
                <i>Product name Quantity(Kgs) Rate(per kg) Amount(Rupees)</i>
                <div className="col-sm-6" style={{ textAlign: "left" }}>
                    {
                        stock.map((p) =>
                            <div>
                                <label className="radio-inline" style={{ marginLeft: "10px" }}>
                                    <input type="checkbox" name="pid" value={p.product.pid}
                                        onChange={(event) => {
                                            setPid(event.target.value)
                                        }} /> {p.product.pname}
                                </label>
                                <input type="number" name="quantity" id="qty" step="1" min="0"
                                    max={p.availableqty} value={items.quantity}
                                    onChange={(event) => {
                                        setQuantity(event.target.value)
                                    }} />

                                <input type="number" id="rate" value={p.product.rate} name="rate" disabled />

                                <input type="number" name="amount" id="amount"
                                    onChange={(event) => {
                                        setAmount(event.target.value)
                                    }} />
                                {/*       value={$("#qty+{indexOf(p)}").on("change", function(){
                                    var sum=0;
                                    sum = $("#qty+{indexOf(p)}").val() * $("#rate+{indexOf(p)}").val(); 
                                    $("#amount+{indexOf(p)}").val(sum);
                                    })} /> */}
                            </div>
                        )}
                </div>
            </div>

            <input type="hidden" name="cid" id="cid" placeholder="cid"
                onChange={(event) => {
                    setCid(event.target.value)
                }} className="form-control" />


            <input type="hidden" name="orderstatus"
                onChange={(event) => {
                    setStatus(event.target.value);
                }} className="form-control" />

            <div className="form-group row" style={{ marginTop: "10px" }}>
                <label className="col-sm-4 col-form-label" for="totalprice" style={{ textAlign: "left" }}>Total amount</label>
                <div className="col-sm-6">
                    <input type="text" id="totalprice" name="totalprice"
                        onChange={(event) => {
                            setTotalPrice(event.target.value);
                        }} className="form-control" />
                </div>
            </div>
            <br/>
            <button onClick={sendData} className="btn btn-primary btn-block mb-6">Book Order</button>
        </div >
    );
}

export default SaveOrder;