import React from 'react'
import Button from '@material-ui/core/Button';


const TabsShow = (props) => {

    const tabs =["TAB 1","TAB 2","TAB 3"];

    const clickhandler = (e,x,i) =>{
        e.preventDefault();
        // setMsg(x+ " was clicked");
        props.data(x+ " was clicked");
    }   
    return (
        <div>
            {
                taps.map((value,i)=>{
                    return <Button variant="contained" color="primary" key={i} onClick={(e)=>clickhandler(e,value,i)}>
                    Button {i+1}
                </Button>
                })
            }
        </div>
    )
}

export default TabsShow