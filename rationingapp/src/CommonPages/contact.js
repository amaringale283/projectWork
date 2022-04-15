import React from 'react';

function Contact() {
        return (
            <div className="container col-md-10">
                <br/>
                <h3 >Contact Us</h3>
                <div className="container col-md-6" style={{padding:"15px", textAlign:"center"}}>
                    <table >
                        <tr>
                            <td>
                                <div style={{backgroundColor:"yellowgreen" ,borderRadius:"10px" ,padding:"25px"}}>
                                    <h6>Name: Amar Ingale</h6>
                                    <h6>Email: meamaringale@gmail.com</h6>
                                    <h6>Contact: 9075771772</h6>
                                </div>
                                <hr/>
                            </td>&nbsp;&nbsp;
                            <td>
                                <div style={{backgroundColor:"SkyBlue" ,borderRadius:"10px" ,padding:"25px"}}>
                                    <h6>Name: Varsha Ghute</h6>
                                    <h6>Email: varshaghute35@gmail.com</h6>
                                    <h6>Contact: 7585731507</h6>
                                </div>
                                <hr/>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <div style={{backgroundColor:"LightSalmon" ,borderRadius:"10px" ,padding:"25px"}}>
                                    <h6>Name: Aarti Karpe</h6>
                                    <h6>Email: aartikarpe9@gmail.com</h6>
                                    <h6>Contact: 7040225157</h6>
                                </div>
                                <hr/>
                            </td>&nbsp;&nbsp;
                            <td>
                                <div style={{backgroundColor:"orchid" ,borderRadius:"10px" ,padding:"25px"}}>
                                    <h6>Name: Avishkar Katkar</h6>
                                    <h6>Email: avishkarrk30@gmail.com</h6>
                                    <h6>Contact: 9665561217</h6>
                                </div>
                                <hr/>
                            </td>
                        </tr>
                        {/*<tr >
                            <td>
                                <div style={{backgroundColor:"green" ,borderRadius:"10px" ,padding:"25px"}}>
                                <h6>
                                Address: Office No: 2, First Floor, "Gokhale Sanchit", 
                                Survey No: 846 Servants of India Society, BMCC Road, 
                                Off FC Rd, Deccan Gymkhana, Pune, Maharashtra 411004
                                </h6> 
                                </div>
                            </td>
        </tr>*/}
                    </table>
                    
                </div>
            </div>      
        )
}

export default Contact;