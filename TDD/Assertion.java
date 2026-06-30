// Create a New Java Class in the Test Folder and write the below code in the created class
public class CalculatorTest {
    @Test
    void testAddition() {
        Calculator cal = new Calculator();
        int result = cal.add(2, 3);
        assertEquals(5, result);
    }
    @Test
    void testSubtraction() {
        Calculator cal = new Calculator();
        int result = cal.subtract(10, 4);
        assertEquals(6, result);
    }
    @Test
    void testMultiplication() {
        Calculator cal = new Calculator();
        int result = cal.multiply(5, 2);
        assertEquals(10, result);
    }
    @Test
    void EvenNumber(){
       Calculator cal =new Calculator();
       int result=cal.EvenNumber(8);
       assertEquals(0,result);
    }
}
// create a New class in the main src folder as per test class created class Name and use the below code in the class
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
    public int EvenNumber(int a){
        if(a%2==0) return 0;
        else return -1;
    }
}
