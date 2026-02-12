🏦 Bank Transfer Management System (Java + JDBC)  

📌 Project Description  
This project is a simple Bank Transfer Management System developed using Java, JDBC, and Oracle Database.  

It allows users to:  
Check account balance  
Validate account numbers  
Transfer money between two bank accounts  
Handle insufficient balance using custom exception  

The project follows a layered architecture:  
Bean Layer  
DAO Layer  
Service Layer  
Utility Layer  
Main Class  

🛠️ Technologies Used
Java (JDK 8 or above)  
Oracle Database (XE)  
JDBC  
Eclipse / IntelliJ IDEA  
SQL  

⚙️ Database Details  

ACCOUNT_TBL:  
| Column Name    | Data Type |  
| -------------- | --------- |  
| Account_Number | VARCHAR2  |  
| Balance        | NUMBER    |  

TRANSFER_TBL  
| Column Name      | Data Type |  
| ---------------- | --------- |  
| Transaction_ID   | NUMBER    |  
| From_Account     | VARCHAR2  |  
| To_Account       | VARCHAR2  |  
| Transaction_Date | DATE      |  
| Amount           | NUMBER    |  


Sequence
CREATE SEQUENCE transactionId_seq  
START WITH 1  
INCREMENT BY 1;  

![Screenshot 1](https://github.com/user-attachments/assets/ec6a04a0-a72c-434a-a48d-e9652a6a7f1d)
![Screenshot 2](https://github.com/user-attachments/assets/ea960db0-378d-4e26-b165-dfe7a6221e02)
![Screenshot 3](https://github.com/user-attachments/assets/ac745976-1624-4cb1-8040-53a807b73b52)




