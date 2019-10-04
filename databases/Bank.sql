Create table CUST( 
    REFNO char(4),
    FULL_NAME char(40),
    ADDRESS char(40),
    AREA char(20));
Create table CUSTACC(
    REFNO char(4),
    ACCNO NUMBER(7));
Create table ACC(
    ACCNO NUMBER(7),
    BALANCE NUMBER(10,2),
    BRANCH char(20),
    
