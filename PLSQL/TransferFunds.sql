CREATE OR REPLACE PROCEDURE TransferFunds
(
    p_sender_acc   IN Accounts.AccountNo%TYPE,
    p_receiver_acc IN Accounts.AccountNo%TYPE,
    p_transfer_amt IN NUMBER
)
IS
    v_sender_balance NUMBER;
BEGIN
    SELECT Balance
    INTO v_sender_balance
    FROM Accounts
    WHERE AccountNo = p_sender_acc;
    IF v_sender_balance >= p_transfer_amt THEN
        UPDATE Accounts
        SET Balance = Balance - p_transfer_amt
        WHERE AccountNo = p_sender_acc;
        UPDATE Accounts
        SET Balance = Balance + p_transfer_amt
        WHERE AccountNo = p_receiver_acc;
        COMMIT;
        DBMS_OUTPUT.PUT_LINE('Fund transfer completed successfully.');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Transfer failed. Insufficient balance.');
    END IF;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('One of the account numbers does not exist.');
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Unexpected Error : ' || SQLERRM);
END;
