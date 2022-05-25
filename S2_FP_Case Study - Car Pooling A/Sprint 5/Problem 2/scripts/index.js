function validateForm() {

    var fromPattern = /^.{3,100}$/;
    let from = document.forms["addRidesForm"]["from"].value;
    if (!fromPattern.match(from)) {
        // alert("From must be minimum of 3 character");
        return false;
    }

    var toPattern = /^.{3,100}$/;
    let to = document.forms["addRidesForm"]["to"].value;
    if (!toPattern.match(to)) {
        // alert("To must be minimum of 3 character");
        return false;
    }

    let totalSeats = document.forms["addRidesForm"]["totalNoOfSeats"].value;
    if (isNaN(totalSeats) && totalSeats > 0) {
        // alert("Total number of seats should be a number and it should be greater than \"0\".");
        return false;
    }

    let rideAmount = document.forms["addRidesForm"]["rideAmount"].value;
    if (isNaN(rideAmount) && rideAmount > 5) {
        alert("Ride_Amount Amount should be minimum of $5");
        return false;
    }
    
    let startDateTime = document.forms["addRidesForm"]["startDateTime"].value;
    let endDateTime = document.forms["addRidesForm"]["endDateTime"].value;

    // adding 2 hours to today datetime
    const ONE_HOUR = 1000 * 60 * 60;  
    var today = new Date();
    today = new Date(Number(today) + 2 * ONE_HOUR);
    
    // converting input to proper date and time format
    startDateList = startDateTime.toString().toUpperCase().split(" ")[0];
    startTimeList = startDateTime.toString().toUpperCase().split(" ")[1];
    startDateList = startDateList.toString().toUpperCase().split("-");
    todayList = today.toString().toUpperCase().split(" ");
    startDateData = startTimeList.split(":");

    startDateTime = new Date(parseInt(startDateList[2]), parseInt(startDateList[1]) -1, parseInt(startDateList[0]), parseInt(startDateData[0]), parseInt(startDateData[1]), 0);

    endDateList = endDateTime.toString().toUpperCase().split(" ")[0];
    endTimeList = endDateTime.toString().toUpperCase().split(" ")[1];
    endDateList = endDateList.toString().toUpperCase().split("-");
    endDateData = endTimeList.split(":");
    
    endDateTime = new Date(parseInt(endDateList[2]), parseInt(endDateList[1]) -1, parseInt(endDateList[0]), parseInt(endDateData[0]), parseInt(endDateData[1]), 0);


    if (startDateTime.getTime() < today.getTime() || endDateTime.getTime() < today.getTime()) {
        return false;
    }

    return true;
}