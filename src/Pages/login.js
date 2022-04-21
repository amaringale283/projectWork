import React, { useState } from "react";
import axios from "axios";
import { useNavigate } from "react-router-dom";

function Login() {
    let navigate = useNavigate();
    const [username, setUsername] = useState("");
    const [password, setPassword] = useState("");

    const login = () => {
        const data = { username: username, password: password };
        axios.post("http://localhost:8080/login", data).then((response) => {
            navigate("/"+response.data.role+"?loginid="+response.data.loginid);
        });
    };
    return (
        <center>
            <br/>
            <h3 className="mb-3" style={{textAlign: "center" }}>Login</h3>
            <br/>
            <div className="container col-md-3" style={{backgroundColor:"green",borderRadius:"10px",padding:"25px"}}>
                <br/> 
                <div className="form-group row">
                    <div >
                        <input type="text" id="username" name="username" placeholder="Enter username" onChange={(event) => {setUsername(event.target.value);}} className="form-control"  />
                    </div>
                </div>    
                <br/>
                <div className="form-group row">
                    <div >
                        <input type="password" id="password" name="password" placeholder="Enter password" onChange={(event) => {setPassword(event.target.value);}} className="form-control" />
                    </div>
                </div>
                <br/>
                <button onClick={login} className="btn btn-primary btn-block mb-6"> Login </button>
            </div>
        </center>   
    );
}

export default Login;