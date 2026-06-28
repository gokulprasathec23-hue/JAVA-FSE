CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus
(
    p_dept_code IN Employees.DepartmentID%TYPE,
    p_bonus_rate IN NUMBER
)
IS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * p_bonus_rate / 100)
    WHERE DepartmentID = p_dept_code;
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Employee bonus updated successfully.');
END;
