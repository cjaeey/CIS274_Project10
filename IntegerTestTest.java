// Carlos John Escala
// October 2nd, 2024
// Lab 10, Creating a Method
// This Lab is the test file that tests the integers

public class IntegerTestTest 
{
    public static void main(String[] args)
    {
        IntegerTest integerTest = new IntegerTest();

        int test1st_number1 = 5, test1st_number2 = 6, test1st_number3 = 7;
        int test2nd_number1 = 6, test2nd_number2 = 4, test2nd_number3 = 2;
        outputResult(test1st_number1, test1st_number2, test1st_number3);
        outputResult(test2nd_number1, test2nd_number2, test2nd_number3);
    }

    public static void outputResult(int number1, int number2, int number3)
    {
        if (IntegerTest.isNumberOrdered(number1, number2, number3))
        {
            System.out.println(number1 + ", " + number2 + ", " + number3 + " are in order");
        }
        else
        {
            System.out.println(number1 + ", " + number2 + ", " + number3 + " are not in order");
        }
    }   
}
