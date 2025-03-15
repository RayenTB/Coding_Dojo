import React,{useState} from 'react';

const MoreForms=()=>{
    const [firstName,setFirstName]=useState("");
    const [firstNameMsg,setFirstNameMsg]=useState(false);
    const [lastName,setLastName]=useState("");
    const [lastNameMsg,setLastNameMsg]=useState(false);
    const [email,setEmail]=useState("");
    const [emailMsg,setEmailMsg]=useState(false);
    const [password,setPassword]=useState("");
    const [passwordMsg,setPasswordMsg]=useState(false);
    const [confirmPassword,setConfirmPassword]=useState("");
    const [confirmPasswordMsg,setConfirmPasswordMsg]=useState(false);
    
    const handleFirstName=(e)=> {
        setFirstName(e.target.value);
        if(e.target.value.length<2){
            setFirstNameMsg(<p>First Name must be at least 2 characters</p>);
        }
        else {
            setFirstNameMsg(<></>);
        }
        if(e.target.value.length===0){
            setFirstNameMsg(<></>);
        }
    }

    const handleLastName=(e)=> {
        setLastName(e.target.value);
        if(e.target.value.length<2){
            setLastNameMsg(<p>Last Name must be at least 2 characters</p>);
        }
        else {
            setLastNameMsg(<></>);
        }
        if(e.target.value.length===0){
            setLastNameMsg(<></>);
        }
    }

    const handleEmail=(e)=> {
        setEmail(e.target.value);
        if(e.target.value.length<5){
            setEmailMsg(<p>Email must be at least 5 characters</p>);
        }
        else {
            setEmailMsg(<></>);
        }
        if(e.target.value.length===0){
            setEmailMsg(<></>);
        }
    }

    const handlePassword=(e)=> {
        setPassword(e.target.value);
        if(e.target.value.length<8){
            setPasswordMsg(<p>Password must be at least 8 characters</p>)
        }
        else {
            setPasswordMsg(<></>);
        }
        if(e.target.value.length===0){
            setPasswordMsg(<></>);
        }
    }

    const handleConfirmPassword=(e)=> {
        setConfirmPassword(e.target.value);
        if(e.target.value!==password){
            setConfirmPasswordMsg(<p>Passwords must match</p>);
        }
        else {
            setConfirmPasswordMsg(<></>);
        }
        if(e.target.value.length===0){
            setConfirmPasswordMsg(<></>);
        }
    }

    return(
        <form onSubmit={(e)=>e.preventDefault()} className="myForm">
            <br></br>
            <div className="bordered">
            <label htmlFor="firstName">First Name</label>
            <input id="firstName" type="text" onChange={handleFirstName} value={firstName}/>
            </div>
            {firstNameMsg}

            <br></br>
            <div className="bordered">
            <label htmlFor="lastName">Last Name</label>
            <input id="lastName" type="text" onChange={handleLastName} value={lastName}/>
            </div>
            {lastNameMsg}

            <br></br>
            <div className="bordered">
            <label htmlFor="email">Email</label>
            <input id="email" type="email" onChange={handleEmail} value={email}/>
            </div>
            {emailMsg}

            <br></br>
            <div className="bordered">
            <label htmlFor="password">Password</label>
            <input id="password" type="password" onChange={handlePassword} value={password}/>
            </div>
            {passwordMsg}

            <br></br>
            <div className="bordered">
            <label htmlFor="confirmPassword">Confirm Password</label>
            <input id="confirmPassword" type="password" onChange={handleConfirmPassword} value={confirmPassword}/>
            </div>
            {confirmPasswordMsg}

            </form>
    );
}

export default MoreForms;