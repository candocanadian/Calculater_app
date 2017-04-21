import java.util.Scanner;
class Hello{
	public static void main(String[] args){
Scanner scanIn = new Scanner(System.in);
System.out.println("What is you're name");
String name = scanIn.nextLine();
System.out.printf("Hello %s%n",
		name);
System.out.println("How old are you");
String age = scanIn.nextLine();
System.out.printf("Wow %s you're old%n",
		age);
String toDo;
do{
System.out.println("Select * / + - or exit to quit");
 toDo = scanIn.nextLine();
if(toDo.equalsIgnoreCase("exit")){
System.out.println("GoodBye");	
System.exit(0);
}
{
if(toDo.equalsIgnoreCase("*")){
	System.out.println("Enter a number");
	int num1 = scanIn.nextInt();
	System.out.println("Enter one more number");
	int num2 = scanIn.nextInt();
	int numEquals = num1 * num2;
	String numString = Integer.toString(numEquals);
	System.out.printf(numString+"%n");
}
if(toDo.equalsIgnoreCase("/")){
	System.out.println("Enter a number");
	int num1 = scanIn.nextInt();
	System.out.println("Enter one more number");
	int num2 = scanIn.nextInt();
	int numEquals = num1 / num2;
	String numString = Integer.toString(numEquals);
	System.out.printf(numString+"%n");
}
if(toDo.equalsIgnoreCase("+")){
	System.out.println("Enter a number");
	int num1 = scanIn.nextInt();
	System.out.println("Enter one more number");
	int num2 = scanIn.nextInt();
	int numEquals = num1 + num2;
	String numString = Integer.toString(numEquals);
	System.out.printf(numString+"%n");
}
if(toDo.equalsIgnoreCase("-")){
	System.out.println("Enter a number");
	int num1 = scanIn.nextInt();
	System.out.println("Enter one more number");
	int num2 = scanIn.nextInt();
	int numEquals = num1 - num2;
	String numString = Integer.toString(numEquals);
	System.out.printf(numString+"%n");

}
}



	
}while(!toDo.equalsIgnoreCase("Exit"));
}
}
