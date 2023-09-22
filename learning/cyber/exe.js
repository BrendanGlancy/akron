function submitRequest() {

    var xmlhttp = new XMLHttpRequest();
    xmlhttp.onreadystatechange = function () {
        if (xmlhttp.readyState == XMLHttpRequest.DONE && xmlhttp.status == 200) {
            alert(xmlhttp.responseText);
        }
    }
    xmlhttp.open("POST", "/contact.php", true);
    var payload = {
      "email": document.getElementById("inputEmail").value,
      "msg": document.getElementById("inputHear").value
    };
   
    xmlhttp.setRequestHeader('Content-Type','application/json');
    xmlhttp.send(JSON.stringify(payload));
    return false;
}
