function fun1() {

    console.log("I am from function");
    document.getElementById("demo").innerHTML = "Hello";

}

function f2() {
    function emp(firstName, lastName, age, salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    var emp1 = new emp("Thomas", "King", 34, 45000.50);

    emp1.calculateBonus = function () {
        document.getElementById("bonus").innerHTML = "Bonus of " + this.firstName + " " + this.lastName + " is : " + this.salary * .30;
    }

    emp1.calculateBonus();
}

/*$(document).ready(function() {

    //DOM manipulation code
    var emp = {
        firstName: "Thomas",
        lastName: "King",
        age: 34,
        salary: 45000.50


    };

    document.getElementById("empdetails").innerHTML = emp.firstName + " " + emp.lastName + " " + emp.age + " " + emp.salary;

});*/



function displayDate() {

    
    document.getElementById("date").innerHTML = Date();


}

function displayGreet() {
    document.getElementById("greet").innerHTML = "Welcome " + document.getElementById("username").value;


}

function displayCity() {   

    document.getElementById("mycity").innerHTML = "Welcome to " + document.getElementById("selectcity").value;


}

function changeCSS(x){
    x.style.backgroundColor = 'blue';
    
}
function changeCSS1(x){   
    x.style.backgroundColor = 'red';   
}

var cars=["Hyundai","Toyata","Valve"];

function displayCars(data,index)
{
    var a = document.getElementById("cars").value;
  //document.writeln(data+" "+index);
  document.getElementById("cars").innerHTML = a + data + " " + index;
}