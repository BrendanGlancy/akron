// Diplay a countdown timer in the browser window

function displayTime() {
  var now = new Date();
  var hours = now.getHours();
  var minutes = now.getMinutes();
  var seconds = now.getSeconds();
  // countdown till 4:45 pm when the lecture ends
  // if the time is after 4:45 pm, display 0:00
  // if the time is before 4:45 pm and after 3:30 pm, display the time left
  // if the time is before 3:30 pm, display time until 3:30 pm when the lecture starts
  if (hours > 16 || hours < 15) {
    hours = 0;
    minutes = 0;
    seconds = 0;
  } else if (hours == 15) {
    if (minutes > 45) {
      hours = 0;
      minutes = 0;
      seconds = 0;
    } else if (minutes < 30) {
      hours = 0;
      minutes = 30 - minutes;
      seconds = 0;
    } else {
      minutes = 45 - minutes;
      seconds = 60 - seconds;
    }
  } else {
    hours = 16 - hours;
    minutes = 45 - minutes;
    seconds = 60 - seconds;
  }
  // display the time left
  // if the time is less than 10, add a leading 0
  // if the time is 0, display 00
  // if the time is 1, display 01
  // if the time is 10, display 10
  if (hours < 10) {
    hours = "0" + hours;
  } else if (hours == 0) {
    hours = "00";
  }
  if (minutes < 10) {
    minutes = "0" + minutes;
  } else if (minutes == 0) {
    minutes = "00";
  }
  if (seconds < 10) {
    seconds = "0" + seconds;
  } else if (seconds == 0) {
    seconds = "00";
  }
  // display the time left
  // if the time is 00:00:00, display "Lecture is over"
  if (hours == "00" && minutes == "00" && seconds == "00") {
    document.getElementById("countdown").innerHTML = "Lecture is over";
  } else {
    document.getElementById("countdown").innerHTML = hours + ":" + minutes + ":" + seconds;
    // if between 3:30 pm and 4:45 pm, display "Lecture is in progress"
    // if between 4:45 pm and 5:00 pm, display "Lecture is over"
    document.getElementById("message").innerHTML = "Till the end of the lecture";
  }
  setTimeout("displayTime()", 1000);
}

// Call the function to display the time
// when the page is loaded
window.onload = displayTime;

