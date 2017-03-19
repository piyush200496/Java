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
