import './App.css';
import React, {useState} from 'react';
import MyComponent from './components/Tabs';
import TapsShow from './components/Tabsshow';

function App() {
  const [data,setData] = useState("");

  const newContent = (content) => {
    setData(content);
  }

  return (
    <div className="App">
      <header className="App-header">

        {/* All in one Component */}
        <MyComponent/> 

        {/*Lifting Components*/}
        <TapsShow data={newContent}/>
        <TapsDisplay content={data}/>
        
      </header>
    </div>
  );
}

export default App;
