public class OperatorsPart1{
  public static void main(String[] args){
	  //assignment operator(=)
	  int num = 50;
	  System.out.printf("the value of num is %d",num);
	  
	  //Arithmetic operators(+,-,*,/,%)
	  int num1 = 100;
	  int num2 = 500;
	  
	  int addition = num1 + num2;
	  System.out.printf("the sum of %d and %d is %d%n",num1,num2,addition);
	  
	  int subtraction = num1 - num2;
	  System.out.printf("the diffrence between %d  and %d is %d%n",num1,num2,subtraction);
	  
	  int multiplication =num1 * num2;
	  System.out.printf("the product of %d is %d%n",num1,num2,multiplication);
	  
	  double quotient = (double)num1/num2;
	  System.out.printf("the qoutien of %d / %d is %f%n",num1,num2,quotient);
	  
	  int remainder = num1%num2;
	  System.out.printf("the remainder between %d and %d is %d%n",num1,num2,remainder);
	  
	  //compound assignment operator
	  num1 += num2;
	  System.out.printf("the value of num1 is now %d%n",num1);
	  
	  num1 -= num2;
	  System.out.printf("the value of num1 is now %d%n",num1);
	  
	  //Relational Operators(>,<,>=,<=,!=,==)
	 int number1 = 20, number2 = 50;
	 
	 boolean isGreater = number1 > number2;
	 System.out.printf("is %d > %d? %b%n", number1, number2, isGreater);
	 
	 boolean isLessthan = number1 <= number2;
	 System.out.printf("is %d != %d? %b%n",number1,number2,isLessthan) ;
	 
	 boolean isEqualTo = number1 == number2;
	System.out.printf("Is %d == %d? %b%n",number1,number2,isEqualTo) ;
	
	
	boolean isGreaterThanOrEqualTo = number1 >= number2;
	 System.out.printf("is %d >= %d? %b%n", number1, number2, isGreaterThanOrEqualTo);
	 
	 boolean isLessthanOrEqualTo = number1 <= number2;
	 System.out.printf("is %d != %d? %b%n",number1,number2,isLessthanOrEqualTo) ;
	 
	 boolean isNotTo = number1 != number2;
	System.out.printf("Is %d == %d? %b%n",number1,number2,isNotTo) ;
  }
}