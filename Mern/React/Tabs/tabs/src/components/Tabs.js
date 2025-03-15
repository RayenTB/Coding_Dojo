import React,{useState} from 'react'
import Button from '@material-ui/core/Button';

const MyComponent=()=> {
    const tabs =["Tab 1","Tab 2","Tab 3"];
    const [msg,setMsg]= useState("");


    const clickhandler = (e,x,i) =>{
        e.preventDefault();
        setMsg(x+ " was clicked");

    }    
    return (
        <div>
            {
                taps.map((value,i)=>{
                    return <Button variant="contained" color="primary" key={i} onClick={(e)=>clickhandler(e,value,i)}>
                    {value}
                </Button>
                })
            }
            <p>{msg}</p>
        </div>
    )
}

export default Tabs