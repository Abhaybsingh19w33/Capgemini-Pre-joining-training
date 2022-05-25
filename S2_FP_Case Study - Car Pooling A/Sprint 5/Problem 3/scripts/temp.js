function validateUserName() {
    var charAndSpace = new RegExp("^[a-zA-Z ]+$");
    let username = document.forms["requestRideForm"]["username"].value;
    // if (!usernamePattern.match(username) && !charAndSpace.match(charAndSpace)) { 
    if ((username.length < 5) && !charAndSpace.match(charAndSpace)) {
        // alert("From must be minimum of 5 character and should take only characters and space");
        return false;
    }
}

function getMonth(month) {    
    month = month.toString().trim();    
    if (month == "JAN") {
        return 1;
    }
    else if (month == "FEB") {
        return 2;
    }
    else if (month == "MAR") {
        return 3;
    }
    else if (month == "APR") {
        return 4;
    }
    else if (month == "MAY") {
        return 5;
    }
    else if (month == "JUN") {
        return 6;
    }
    else if (month == "JUL") {
        return 7;
    }
    else if (month == "AUG") {
        return 8;
    }
    else if (month == "SEP") {
        return 9;
    }
    else if (month == "OCT") {
        return 10;
    }
    else if (month == "NOV") {
        return 11;
    }
    else if (month == "DEC") {
        return 12;
    }
    return 0;
}

function validateForm() {
    let rideStartDate = document.forms["requestRideForm"]["rideStartDate"].value;
    rideStartDate = rideStartDate.toString().split("-");
    rideStartDate = new Date(parseInt(rideStartDate[0]),  parseInt(rideStartDate[1]) -1, parseInt(rideStartDate[2], 0, 0, 0));

    var today = new Date();
    todayList = today.toString().toUpperCase().split(" ");

    today = new Date(parseInt(todayList[3]), parseInt(getMonth(todayList[1].toString().toUpperCase())) -1, parseInt(todayList[2]));

    if (rideStartDate.getTime() >= today.getTime()) {
        return false;
    }

    return true;
}

function validateSeatsRequired() {
    let noOfSeatsRequired = document.forms["requestRideForm"]["noOfSeatsRequired"].value;    

    if (isNaN(noOfSeatsRequired) || noOfSeatsRequired > 6) {
        // alert("Numbers of seat required is number field should not accept more than 6, when entered more than 6 display a text \"you cannot book more than 6 seats SORRY!!! \"");
        document.getElementById("errorText").hidden = false;
        document.getElementById("errorText").innerHTML = "you cannot book more than 6 seats SORRY!!!";
    }
    else {
        document.getElementById("errorText").hidden = true;
        document.getElementById("errorText").innerHTML = "";
    }    
}

function getAvailableSeats() {
    document.getElementById("submitText").hidden = true;
    document.getElementById("submitText").innerHTML = "";
    document.getElementById("noOfSeatsAvailable").setAttribute("value", "6");
}

function onSubmit() {
    let numberOfSeats = document.forms["requestRideForm"]["noOfSeatsRequired"].value;
    let rideCost= document.forms["requestRideForm"]["rideCost"].value;
    let username= document.forms["requestRideForm"]["username"].value;

    console.log(numberOfSeats, " ", rideCost, " ", username);
    if (numberOfSeats.length === 0) {
        numberOfSeats = 0;
    }

    if (rideCost.length === 0) {
        rideCost = 0;
    }

    console.log(numberOfSeats, " ", rideCost, " ", username);
    console.log("Total ride cost is :",numberOfSeats * rideCost);

    if (confirm("Total ride cost is : " + numberOfSeats * rideCost) ) {
        document.getElementById("submitText").hidden = false;
        document.getElementById("submitText").innerHTML = " Thank you for your order Mr/Ms/Mrs:" + username;
    }
}