import './index.css';
import Home from "./Home";
import Navbar from "./Navbar";
import Footer from "./Footer";

export default function App() {
  return (
    <div className="App">
        <Navbar/>
            <Home/>
        <Footer/>
    </div>
  );
}
