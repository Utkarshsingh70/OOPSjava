# **Object Oriented Programming based Loaning System**

> This project uses OOPS concept for designing a loaning system.

## **Description**
The Item class models one item in a library. It is an **abstract superclass**. There are two **abstract methods**, getFinesPerDay and getAdminCharge that returns the administrative charge. The method lostCharges returns the sum of administrative charges and the cost of the item. 

The Book and Media classes model a book and a media respectively, available in a library. They are **subclasses of Item.

The Book class has an additional **instance variable**(declared outside method/constructor) authors, a list of string, each string for the name of one author. The administrative charge is computed using a decreasing percentage of the book cost, and the decrease is based on the year of publication.

The Loan class models a loan made for a copy of an item.


## **Preview**   

![p](https://user-images.githubusercontent.com/61719550/126339316-ce67dd4e-098a-44ac-aacb-3c0530842bb8.PNG)
