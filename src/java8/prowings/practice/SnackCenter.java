package java8.prowings.practice;

/*Write menu driven billing system for a Snacks center, items available are
	tea(Rs. 10), Samosa(Rs. 20), Sandwitch(Rs. 50), green tea(Rs. 15) etc.
	as follows:
*/

import java.util.Scanner;
public class SnackCenter {
	
	public static void main(String[] args) 
	{
		int choice, quantity, teaQun=0, greenTeaQun=0, samosaQun=0, sandwitchQun=0;
		boolean run = true;
		Scanner sc = new Scanner(System.in);
			do {
					System.err.print("\n\n*********************Welcome to Snack Center********************");
					System.out.print("\n\n\t 1. Tea(Rs. 10) \n\t 2. Green tea(Rs. 15)");
					System.out.print("\n\t 3. Samosa(Rs. 20) \n\t 4. Sandwitch(Rs. 50)");
					System.out.print("\n\t 5. Genarete bill and exit");
					
					System.out.print("\n\n\tEnter your choice : ");
					choice = sc.nextInt();
					
					if(choice>0 && choice<5)
					{
						System.out.print("\tEnter quantity : ");
						quantity = sc.nextInt();
						
						switch(choice)
						{
							case 1 : teaQun = teaQun + quantity;
										break;
							case 2 : greenTeaQun = greenTeaQun + quantity;
										break;
							case 3 : samosaQun = samosaQun + quantity;
										break;
							case 4 : sandwitchQun = sandwitchQun + quantity;
										break;
						}
					}
					else if(choice==5) 
					{
						int a1=0, a2=0, a3=0, a4=0;
						System.out.println("\n\n************************ABC Snack Center************************");
						System.out.println("\n*****************************BILL*******************************");
						System.out.println("\n\n                                     Price     Quntity     Total");
						
						if(teaQun>0) {
						a1 = 10 * teaQun;
						System.out.println("\n     Tea                                10        "+teaQun+"         "+a1);
						}
						
						if(greenTeaQun>0) {
						a2 = 15 * greenTeaQun;
						System.out.println("\n     Green tea                          15        "+greenTeaQun+"         "+a2);
						}
						
						if(samosaQun>0) {
						a3 = 20 * samosaQun;
						System.out.println("\n     Samosa                             20        "+samosaQun+"         "+a3);
						}
						
						if(sandwitchQun>0) {
						a4 = 50 * sandwitchQun;
						System.out.println("\n     Sandwitch                          50        "+sandwitchQun+"         "+a4);
						}
						System.out.println("----------------------------------------------------------------");
						System.out.println("\n     Total Bill                                             "+(a1+a2+a3+a4));
						break;
					}
					else {
						System.err.println("\n\n                         INVALID CHOICE                                 ");
						break;
					}
					
					
			}while(run);
		sc.close();
	}
}
