CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest
IS
BEGIN
    UPDATE SavingsAccounts
    SET AccountBalance = AccountBalance + (AccountBalance * 0.01);
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Monthly interest processed successfully.');
END;
