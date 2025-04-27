

function display(){
    var fname = document.getElementById("fname").value;
    var lname = document.getElementById("lname").value;
    var cnumber = document.getElementById("cnumber").value;
    var emailId = document.getElementById("emailId").value;

var output = document.getElementById("output");
    output.innerHTML = 
        "First Name :" + fname + "<br>"+
        "Last Name :" + lname + "<br>"+
        "Contact Number :" + cnumber + "<br>"+
        "Email Id :" + emailId + "<br>";

}