# Java
Java and related

- Login System using JDBC and DES encryption
   A console based java program which provides 4 options:
   1. Register a new user
   2. Login as a user
   3. View Database in encrypted form
   4. View Users registered in database in decrypted text
  Username and password are stored in database table using DES encryption. MySQL database has been used.
  test.java -> Contains the menu displaying the 4 options.
  aesencrypt.java -> contains the DES encryption function.
  db.java -> accesses the database (using JDBC).
- Model View Controller (MVC) Example
  Simple login system with negligible security features meant only to demonstrate MVC concepts. Custom security mechanisms and further    modifcations encouraged.
  Model object: user.java
  Controller: loginservlet.java
  View: success.jsp and login.jsp
  Business process: loginservice.java
  
  Working- loginservice has a hashmap with following key value pairs: <abc,ahmed>, <xyz,piyush>, <pqr,ali>. enter any of the 3 keys as username. Password mechanism has been left for now so any non-null string is accepted as password. The success page displays the corresponding key's value. To implement security logic, modify loginservice class as needed. Login page and success page can be improvised.
  Again, this example is only meant to demonstrate MVC concept and isn't a fully secure login system.

