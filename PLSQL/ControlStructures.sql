DECLARE
    CURSOR cur_senior_loans IS
        SELECT
            cust.CustomerID,
            cust.Age,
            loan.LoanID,
            loan.InterestRate
        FROM Customers cust
        INNER JOIN Loans loan
        ON cust.CustomerID = loan.CustomerID;
    v_new_rate Loans.InterestRate%TYPE;
BEGIN
    FOR loan_rec IN cur_senior_loans LOOP
        IF loan_rec.Age >= 61 THEN
            v_new_rate := loan_rec.InterestRate - 1;
            UPDATE Loans
            SET InterestRate = v_new_rate
            WHERE LoanID = loan_rec.LoanID;
        END IF;
    END LOOP;
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Interest rates updated for eligible senior customers.');
END;
