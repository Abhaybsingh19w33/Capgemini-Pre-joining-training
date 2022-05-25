function validateForm() {
    let fname = document.getElementById("fname").value;
    if (fname.length > 4) {
        // alert("First Name must be minimum of 4 character");
        return false;
    }
    
    var passw = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])$/;
    let password = document.getElementById("password").value;
    if(!password.match(passw)) 
    { 
        alert("Password must be alphanumerical and with a special character");
        return false;
    }
    
    let confirm_password = document.getElementById("confirm_password").value;
    if(password.localeCompare(confirm_password) !== 0) 
    { 
        alert("Password and confirm password must be same");
        return false;
    }
    
    var phoneno = /^\d{10}$/;
    let mobile_number = document.getElementById("mobile_number").value;
    if(!mobile_number.value.match(phoneno))
    {
        alert("Mobile number must be a valid 10-digit number the first digit to be between 6 to 9 ");
        return false;
    }

    return true;
}