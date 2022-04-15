import './App.css';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';
import { BrowserRouter, Route, Link, Routes, Redirect, Switch} from 'react-router-dom';
import Home from './CommonPages/Home';
import Login from './Pages/login';
import Logout from './Pages/Logout';
import Admin from './Pages/Admin';
import Customer from './Pages/Customer';
import Retailer from './Pages/Retailer';
import Government_Auhtority from './Pages/Government_Authority';
import Contact from './CommonPages/contact';
import Aboutus from './CommonPages/aboutus';
import Termsandconditions from './CommonPages/termsandconditions';
import ashoklogo from './CommonPages/indialogo1.png';
import FooterComponent from './CommonPages/footer';
import Register_success from './Pages/Register_success';
import Customer_Registration from './Pages/Customer_Registration';
import Retailer_Registration from './Pages/Retailer_Registration';
import Ga_Registration from './Pages/Ga_Registration';
import AdminStock from './Pages/AdminStock';
import RetailerStock from './Pages/RetailerStock';
import CustomerStock from './Pages/CustomerStock';
import CustomerOrderDetails from './Pages/CustomerOrderDetails';
import RetailerOrderDetails from './Pages/RetailerOrderDetails';
import ErrorPage from './CommonPages/ErrorPage';


function App() {
  return (
    <div className="App">
        <BrowserRouter>
            <nav className="navbar navbar-expand-sm navbar-light bg-warning">
                <a className="navbar-brand" href="#"> <img src={ashoklogo} alt="" width="36" height="30"/>&nbsp;e-Rationing system</a>
                <div className="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul className="navbar-nav mr-auto">
                          <li className="nav-item"><Link className="nav-link" to="/">Home</Link> </li>
                          <li className="nav-item"><Link className="nav-link" to="/aboutus">About Us</Link> </li>
                          <li className="nav-item"><Link className="nav-link" to="/contact">Contact Us</Link> </li>
                          <li className="nav-item"><Link className="nav-link" to="/termsandconditions">T&C</Link> </li>
                          <li className="nav-item"><Link className="nav-link" to="/login">Login</Link> </li>
                    </ul>
                </div>
              </nav>
              <Routes>
                  <Route path="/" element={<Home/> } />
                  <Route path="/login" element={<Login /> } />
                  <Route path="/logout" element={<Logout /> } />
                  <Route path="/contact" element={<Contact /> } />
                  <Route path="/aboutus" element={<Aboutus /> } />
                  <Route path="/termsandconditions" element={<Termsandconditions /> } />
                  <Route path='/customer' element={<Customer />} />
                  <Route path='/retailer' element={<Retailer />} />
                  <Route path='/admin' element={<Admin/>} />
                  <Route path='/ga' element={<Government_Auhtority/>}/>
                  <Route path='/registered' element={<Register_success />} />
                  <Route path='/custreg' element={<Customer_Registration />} />
                  <Route path='/retreg' element={<Retailer_Registration />} />
                  <Route path='/gareg' element={<Ga_Registration />} />
                  <Route path='/getCustomerStock' element={<CustomerStock />} />
                  <Route path='/getRetailerStock' element={<RetailerStock />} />
                  <Route path='/getAdminStock' element={<AdminStock />} />
                  <Route path='/getOrderDetails' element={<CustomerOrderDetails />} />
                  <Route path='/getOrderDetailsPerRetailer' element={<RetailerOrderDetails/>}/>
                  <Route path='*' element={<ErrorPage />} />
              </Routes>
              <hr/>
              <div>All Rights Reserved 2021 @KnowIt_DACProjects</div>
          </BrowserRouter>
          {/*<div style={{position:"fixed"}}>
              <FooterComponent/>
            </div>*/}
          
    </div>  
  );
}
export default App;
