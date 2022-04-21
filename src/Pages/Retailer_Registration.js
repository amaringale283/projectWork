import React, { useState } from "react";
import axios from "axios";
import { useNavigate } from "react-router-dom";

function Retailer_Registration(){
    let navigate = useNavigate();
    const [rname, setRname] = useState("");
    const [regno, setRegno] = useState("");
    const [contactno, setContactno] = useState("");
    const [address, setAddress] = useState("");
    const [pincode, setPincode] = useState("");
    const [gender, setGender] = useState("");
    const [status, setStatus] = useState(1);
    const [username, setUsername] = useState("");
    const [password, setPassword] = useState("");
    const [email, setEmail] = useState("");
    const [role, setRole] = useState("");

    const sendData = () => {
        const data = {rname: rname, regno: regno, contactno: contactno, address: address, pincode: pincode, gender: gender,
        gender: gender, status: status, user:{ username: username, password: password, email: email, role: "Retailer"}};
        axios.post("http://localhost:8080/addRetailer", data).then((response) => {
            navigate("/"+response.data);
        });
    };

    return (
        <div className="container col-md-8">
            <h3 className="mb-3" style={{ color: "brown", textAlign: "center" }}>Retailer Registration Form</h3>
            <div className="form-group row" style={{ marginTop: "10px" }}>
                <label className="col-sm-4 col-form-label" for="loginRname" style={{ textAlign: "left" }}>Retailer name</label>
                <div className="col-sm-6">
                    <input type="text" id="loginRname" name="rname"
                        onChange={(event) => {
                            setRname(event.target.value);
                        }} className="form-control" />
                </div>
            </div>

            <div className="form-group row" style={{ marginTop: "10px" }}>
                <label className="col-sm-4 col-form-label" for="regno" style={{ textAlign: "left" }}>Retailer Registration number</label>
                <div className="col-sm-6">
                    <input type="text" id="regno" name="regno"
                        onChange={(event) => {
                            setRegno(event.target.value);
                        }} className="form-control " />
                </div>
            </div>

            <div className="form-group row" style={{ marginTop: "10px" }}>
                <label className="col-sm-4 col-form-label" for="contactRet" style={{ textAlign: "left" }}>Contact Number</label>
                <div className="col-sm-6">
                <input type="text" id="contactRet" name="contactno"
                        onChange={(event) => {
                            setContactno(event.target.value);
                        }} className="form-control" />
                </div>
            </div>
            
            <div className="form-group row" style={{ marginTop: "10px" }}>
                <label className="col-sm-4 col-form-label" for="addressRet" style={{ textAlign: "left" }}>Address</label>
                <div className="col-sm-6"> 
                         <textarea id="addressRet" name="address"
                        onChange={(event) => {
                            setAddress(event.target.value);
                        }} className="form-control" />
                </div>
            </div>

            <div className="form-group row" style={{ marginTop: "10px" }}>
                <label className="col-sm-4 col-form-label" for="loginPincode" style={{ textAlign: "left" }}>Pincode</label>
                <div className="col-sm-6">
                    <input type="text" id="loginPincode" name="pincode"
                        onChange={(event) => {
                            setPincode(event.target.value);
                        }} className="form-control" />
                </div>
            </div>

            <div className="form-group row" style={{ marginTop: "10px" }}>
                <label className="col-sm-4 col-form-label" style={{ textAlign: "left" }}>Select Gender</label><br />
                <div className="col-sm-6" style={{ textAlign: "left" }}>
                    <label className="radio-inline" style={{ marginLeft: "10px" }}><input type="radio" name="gender"  onChange={(event) => {
                            setGender(event.target.value);
                        }} value="male" /> male</label>
                    <label className="radio-inline" style={{ marginLeft: "10px" }}><input type="radio" name="gender"  onChange={(event) => {
                            setGender(event.target.value);
                        }} value="female" /> female</label>
                    <label className="radio-inline" style={{ marginLeft: "10px" }}><input type="radio" name="gender"  onChange={(event) => {
                            setGender(event.target.value);
                        }} value="others" /> others</label>
                </div>
            </div>

           <div className="form-group row" style={{ marginTop: "10px" }}>
                {/*<label className="col-sm-4 col-form-label" for="statusRet" style={{ textAlign: "left" }}>Set status : </label>*/}
                <div className="col-sm-6">
                    <input type="hidden" id="statusRet" name="status"
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
                <label className="col-sm-4 col-form-label" for="roleRet" style={{ textAlign: "left" }}>Role</label>
                <div className="col-sm-6">
                    <input type="text" id="roleRet" name="role"
                        onChange={(event) => {
                            setRole(event.target.value);
                        }} disabled value="retailer" className="form-control" />
                </div>
                    </div>*/}
            <br/>
            <button onClick={sendData} className="btn btn-primary btn-block mb-6">Register</button>
        </div >
    );
}

export default Retailer_Registration;
