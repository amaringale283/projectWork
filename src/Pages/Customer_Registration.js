import React, { useState } from "react";
import axios from "axios";
import { useNavigate } from "react-router-dom";

function Customer_Registration() {
    let navigate = useNavigate();
    const [cname, setCname] = useState("");
    const [contactno, setContactno] = useState("");
    const [address, setAddress] = useState("");
    const [pincode, setPincode] = useState("");
    const [gender, setGender] = useState("");
    const [aadharno, setAadharno] = useState("");
    const [familymembers, setFamilymembers] = useState("");
    const [username, setUsername] = useState("");
    const [password, setPassword] = useState("");
    const [email, setEmail] = useState("");
    const [role, setRole] = useState("");

    const sendData = () => {
        const data = {cname: cname, contactno: contactno, address: address, pincode: pincode, gender: gender,
        aadharno: aadharno, familymembers: familymembers, user:{ username: username, password: password, email: email, role: "Customer"}};
        axios.post("http://localhost:8080/addCustomer", data).then((response) => {
            navigate("/"+response.data);
        });
    };

    return (
        <div className="container col-md-8">
            <h3 className="mb-3" style={{ color: "brown", textAlign: "center" }}>Customer Registration Form</h3>
            <div className="form-group row" style={{ marginTop: "10px" }}>
                <label className="col-sm-4 col-form-label" for="loginCname" style={{ textAlign: "left" }}>Enter Customer name</label>
                <div className="col-sm-6">
                    <input type="text" id="loginCname" name="cname"
                        onChange={(event) => {
                            setCname(event.target.value);
                        }} className="form-control" />
                </div>
            </div>

            <div className="form-group row" style={{ marginTop: "10px" }}>
                <label className="col-sm-4 col-form-label" for="loginContact" style={{ textAlign: "left" }}>Enter contact number</label>
                <div className="col-sm-6">
                    <input type="text" id="loginContact" name="contactno"
                        onChange={(event) => {
                            setContactno(event.target.value);
                        }} className="form-control " />
                </div>
            </div>

            <div className="form-group row" style={{ marginTop: "10px" }}>
                <label className="col-sm-4 col-form-label" for="loginAddress" style={{ textAlign: "left" }}>Enter address</label>
                <div className="col-sm-6">
                    <textarea id="loginAddress" name="address"
                        onChange={(event) => {
                            setAddress(event.target.value);
                        }} className="form-control" />
                </div>
            </div>

            <div className="form-group row" style={{ marginTop: "10px" }}>
                <label className="col-sm-4 col-form-label" for="loginPincode" style={{ textAlign: "left" }}>Enter pincode</label>
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
                <label className="col-sm-4 col-form-label" for="loginAadhar" style={{ textAlign: "left" }}>Enter Aadhar Number</label>
                <div className="col-sm-6">
                    <input type="text" id="loginAadhar" name="aadharno"
                        onChange={(event) => {
                            setAadharno(event.target.value);
                        }} className="form-control" />
                </div>
            </div>

            <div className="form-group row" style={{ marginTop: "10px" }}>
                <label className="col-sm-4 col-form-label" for="familymember" style={{ textAlign: "left" }}>Enter family members</label>
                <div className="col-sm-6">
                    <input type="text" id="familymember" name="familymembers"
                        onChange={(event) => {
                            setFamilymembers(event.target.value);
                        }} className="form-control" />
                </div>
            </div>

            <div className="form-group row" style={{ marginTop: "10px" }}>
                <label className="col-sm-4 col-form-label" for="username" style={{ textAlign: "left" }}>Enter username</label>
                <div className="col-sm-6">
                    <input type="text" for="username" name="username"
                        onChange={(event) => {
                            setUsername(event.target.value);
                        }} className="form-control" />
                </div>
            </div>

            <div className="form-group row" style={{ marginTop: "10px" }}>
                <label className="col-sm-4 col-form-label" for="password" style={{ textAlign: "left" }}>Enter password</label>
                <div className="col-sm-6">
                    <input type="text" for="password" name="password"
                        onChange={(event) => {
                            setPassword(event.target.value);
                        }} className="form-control" />
                </div>
            </div>

            <div className="form-group row" style={{ marginTop: "10px" }}>
                <label className="col-sm-4 col-form-label" for="email" style={{ textAlign: "left" }}>Enter email</label>
                <div className="col-sm-6">
                    <input type="text" for="email" name="email"
                        onChange={(event) => {
                            setEmail(event.target.value);
                        }} className="form-control" />
                </div>
            </div>

            {/*<div className="form-group row" style={{ marginTop: "10px" }}>
                <label className="col-sm-4 col-form-label" for="roleCust" style={{ textAlign: "left" }}>Enter role</label>
                <div className="col-sm-6">
                    <input type="text" id="roleCust" name="role"
                        onChange={(event) => {
                            setRole(event.target.value);
                        }} disabled value="Customer" className="form-control" />
                </div>
                    </div>*/}
            <br/>
            <button onClick={sendData} className="btn btn-primary btn-block mb-6">Register</button>
        </div >
    );
}

export default Customer_Registration;