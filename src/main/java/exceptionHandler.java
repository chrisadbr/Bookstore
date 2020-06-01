public class exceptionHandler {

    public static void main(String[] args) {
       try{
           //String name = "nunu";
           int number1 = 3, number2 = 0;
           double dividend;
           dividend = number1 / number2;
           System.out.println(dividend);
       }catch (Exception e){
           System.out.println("Error! " + e.getMessage());
       }
    }
}
