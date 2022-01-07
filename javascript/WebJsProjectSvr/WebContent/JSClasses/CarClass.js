/**
 * 
 */
class Car {
  constructor(name, year) {
    this.name = name;
    this.year = year;
  }
  age(x) {
    return x - this.year;
  }
}


// It could be moved to another <script> and </script> section in CarClassEmbedded.html
let date = new Date();
let year = date.getFullYear();

let myCar = new Car("Ford", 2014);
document.getElementById("demo").innerHTML= "My car is " + myCar.age(year) + " years old.";
