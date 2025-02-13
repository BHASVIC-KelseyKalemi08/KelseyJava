# Java
## Object oriented programming questions 
### 1) Define the term programming paradigm:

Is a style of programming
### 2) Explain the difference between object-oriented programming and procedural programming:

In procedural programming the subrouytines are defined separately meaning they have no relationships with eachother while in object oiented programming subroutines can be easily grouped together, having a relationship wit heachother.

### 3) Explain the difference between a class and an object:

a class defines the structure and behavior of objects, while an object is an actual instance of that class with its own specific characteristics.

### 4) Identify a situation where a static method may be used:

A static method in Java is a method that is part of a class rather than an instance of that class. Can be used to return certain values of that class.

### 5) Using pseudocode, write a class with relevant attributes and methods to represent a digital clock object. It should represent the time as a 24-hour clock, and include methods to create a new object, set the time manually, display the time, and update the time at the end of each minute

 class digital clock {
 private hours
 private mins

 public procedure new(startingHour, startingMin
  setTime(startinghour, startingMin)
  endprocedure



  public procedure displayTime(startingHour, startingMin):
  
  this.hours=newHour
  
  this.min=newMin
 
  endprocedure


 
  public procedure displayTime():
 
  system.out.println(hours + ":" + mins)
 
  endprocedure


 
  public procedure addMin():
 
  mins++
  
  if mins ==60:
  
  mins=0
 
  hours++
 
  if hours==24:
 
  hours=0
 
  endif
  
  endif
 
  endprocedure
  endclass


  ## Encapsulation

### 1) define the term encapsulation:
     is the idea of grouping data and subroutines to make a program easier to work on and understand

### 2) Explain the difference between a private attribute or method and a public attribute or method
     if a method private it can only be accessed from within the class and if an attribute or method is public it can be used by other classes

### 3) Explain one reason why an attribute may be made private
     useful for security purposes becuase people cannot see the things in the attribute  which they don't have access to

### 4) Define the terms accessor and mutator
     accessors are  Methods that return the value of a private attribute
     mutators are methods that alter the value of a private attribute
  
### 5) Identify when accessors and mutators should be used 
    to change the functionality of the class. For example if you want tpo change how the clock time is displayed then you would have to format or do other checks in multiple placs=es thoughout the class

### 6) Explain why you might make an attribute public instead of using accessors and mutators
    Accessors and mutators should not just be used to make a private attribute public but to hide information from other classes or limit the ability of other classes to alter the attribute
