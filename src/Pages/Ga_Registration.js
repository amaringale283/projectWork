import React, { useState } from "react";
import axios from "axios";
import { useNavigate } from "react-router-dom";

function Ga_Registration(){
    let navigate = useNavigate();
    const [centrename, setCentrename] = useState("");
    const [contactno, setContactno] = useState("");
    const [address, setAddress] = useState("");
    const [pincode, setPincode] = useState("");
    const [status, setStatus] = useState(1);
    const [username, setUsername] = useState("");
    const [password, setPassword] = useState("");
    const [email, setEmail] = useState("");
    const [role, setRole] = useState("");

    const sendData = () => {
        const data = {centrename: centrename, contactno: contactno, address: address, pincode: pincode,
        status: status, user:{ username: username, password: password, email: email, role: "ga"}};
        axios.post("http://localhost:8080/addGa", data).then((response) => {
            navigate("/"+response.data);
        });
    };

    return (
        <div className="container col-md-8">
            <h3 className="mb-3" style={{ color: "brown", textAlign: "center" }}>Government Authority Registration Form</h3>
            <div className="form-group row" style={{ marginTop: "10px" }}>
                <label className="col-sm-4 col-form-label" for="centrename" style={{ textAlign: "left" }}>Centre name</label>
                <div className="col-sm-6">
                    <input type="text" id="centrename" name="centrename"
                        onChange={(event) => {
                            setCentrename(event.target.value);
                        }} className="form-control" />
                </div>
            </div>

            <div className="form-group row" style={{ marginTop: "10px" }}>
                <label className="col-sm-4 col-form-label" for="contactGa" style={{ textAlign: "left" }}>Contact Number</label>
                <div className="col-sm-6">
                <input type="text" id="contactGa" name="contactno"
                        onChange={(event) => {
                            setContactno(event.target.value);
                        }} className="form-control" />
                </div>
            </div>
            
            <div className="form-group row" style={{ marginTop: "10px" }}>
                <label className="col-sm-4 col-form-label" for="addressGa" style={{ textAlign: "left" }}>Address</label>
                <div className="col-sm-6"> 
                         <textarea id="addressGa" name="address"
                        onChange={(event) => {
                            setAddress(event.target.value);
                        }} className="form-control" />
                </div>
            </div>

            <div className="form-group row" style={{ marginTop: "10px" }}>
                <label className="col-sm-4 col-form-label" for="pincodeGa" style={{ textAlign: "left" }}>Pincode</label>
                <div className="col-sm-6">
                    <input type="text" id="pincodeGa" name="pincode"
                        onChange={(event) => {
                            setPincode(event.target.value);
                        }} className="form-control" />
                </div>
            </div>

            <div className="form-group row" style={{ marginTop: "10px" }}>
                {/*<label className="col-sm-4 col-form-label" for="statusGa" style={{ textAlign: "left" }}>Set status</label>*/}
                <div className="col-sm-6">
                    <input type="hidden" id="statusGa" name="status"
                        onChange={(event) => {
                            setStatus(event.target.value);
                        }} disabled value="1" className="form-control" />
                </div>
            </div>

            <div className="form-group row" style={{ marginTop: "10px" }}>
                <label className="col-sm-4 col-form-label" for="username" style={{ textAlign: "left" }}>Username</label>
                <div className="col-sm-6">
                    <input type="text" for="username" name="username"
                        onChange={(event) => {
                            setUsername(event.target.value);
                        }} className="form-control" />
                </div>
            </div>

            <div className="form-group row" style={{ marginTop: "10px" }}>
                <label className="col-sm-4 col-form-label" for="password" style={{ textAlign: "left" }}>Password</label>
                <div className="col-sm-6">
                    <input type="text" for="password" name="password"
                        onChange={(event) => {
                            setPassword(event.target.value);
                        }} className="form-control" />
                </div>
            </div>

            <div className="form-group row" style={{ marginTop: "10px" }}>
                <label className="col-sm-4 col-form-label" for="email" style={{ textAlign: "left" }}>Email</label>
                <div className="col-sm-6">
                    <input type="text" for="email" name="email"
                        onChange={(event) => {
                            setEmail(event.target.value);
                        }} className="form-control" />
                </div>
            </div>

            {/*<div className="form-group row" style={{ marginTop: "10px" }}>
                <label className="col-sm-4 col-form-label" for="roleGa" style={{ textAlign: "left" }}>Role</label>
                <div className="col-sm-6">
                    <input type="text" id="roleGa" name="role"
                        onChange={(event) => {
                            setRole(event.target.value);
                        }} disabled value="ga" className="form-control" />
                </div>
                    </div>*/}
            <br/>
            <button onClick={sendData} className="btn btn-primary btn-block mb-6">Register</button>
        </div >
    );
}

export default Ga_Registration;