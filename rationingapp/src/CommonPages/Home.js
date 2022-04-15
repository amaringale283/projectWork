import React from "react";
import img1 from "../CommonPages/fds.png";
import img2 from "../CommonPages/indialogo.png";
import img3 from "../CommonPages/fds2.jpg";
function Home()
{
        const imgstyle={
                height:"300px",
                width:"300px",
                borderRadius:"10px",
                
        }
        return (
        <div>
                {/*<h1 class="display-5">
                <p style={{ color : 'black',textDecoration:'Block'}}>  e-Rationing System </p>
                <hr/>
                </h1>*/}
                <br/>
                <br/>
                <img src ={img1} style={imgstyle} alt= "" />&nbsp;&nbsp;
                <img src ={img2} style={imgstyle} alt= "" />&nbsp;&nbsp;
                <img src ={img3} style={imgstyle} alt= "" />
                <br/>
                <br/>
                <br/>
                <h4 style={{ color : '',fontFamily:'serif'}}> e-Rationing system developed to dispense the correct quantity of ration to people depending on type the number of
                        members in the family, and also maintain the details of transactions in database. This website will save a lot of time
                        and avoid manual errors. As Aadhar card is unique human identity in this system, duplicate, bogus and ineligible
                        beneficiaries can be avoided. And last but not least, malfunctioning will be null because of transparent data
                        transaction.
                </h4>
                <br/>
                <br/>
                <br/>    
        </div>
        )
}

export default Home;