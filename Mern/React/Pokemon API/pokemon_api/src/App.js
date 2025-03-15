import logo from './logo.svg';
import './App.css';
import Poki from './components/Poki';
import React,{useEffect, useState} from 'react';

function App() {
  const [res,setRes]=useState([])
    
  const handleFetch =()=>{
    fetch("https://pokeapi.co/api/v2/pokemon?limit=807&offset=0")
          .then(response => {
            return response.json();
        }).then(response => {
            setRes(response.results)
            console.log(response.results[0]);
        }).catch(err=>{
            console.log(err);
        });
      document.getElementById("noman").style.display='block';
  }

  return (
    <div className = "App">
      <button onClick={handleFetch}>Fetch Pokemon</button>
        <Poki res={res}  />
    </div>
  );
}

export default App;
