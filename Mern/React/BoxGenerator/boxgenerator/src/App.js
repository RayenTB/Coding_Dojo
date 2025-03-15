import react, { useState } from 'react';
import './App.css';
import NewBox from './components/NewBox';
import Boxs from './components/Boxs';
import Boxs from './components/Boxs';


function App() {

  const [currentClr, setCurrentClr] = useState([]);
  
  const sendClr = ( clr ) => {
    setCurrentClr([...currentClr,clr]);
  }

  return (
    <div className="App" >
      <NewBox onSend= {sendClr} />
      <Boxs color={ currentClr } />
      
    </div>
  );
}

export default App;