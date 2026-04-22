
//  OR25118009 --------Sajani Siriwardhana

import java.util.*;
class TaxCalculator{
	
	public final static void clearConsole() {
		try {
			final String os = System.getProperty("os.name");

			if (os.contains("Windows")) {
				new ProcessBuilder("cmd", "/c", "cls")
                    .inheritIO()
                    .start()
                    .waitFor();
			} else {
            
				System.out.print("\033[H\033[2J");
				System.out.flush();
			}

		} catch (final Exception e) {
			e.printStackTrace();
        
		}
	}

//<============== RENT TAX ==============>

	public static void rentTax(){
		Scanner input = new Scanner(System.in);
		System.out.println("+------------------------------------------------+");
		System.out.println("|\t\t RENT TAX\t\t\t|");
		System.out.println("+------------------------------------------------+");
		double rentTax = 0;
		L1:while (true)
		{
			System.out.print("Enter your rent \t :");
			int rent = input.nextInt();
			if (rent > 0)
			{
				if (100000 < rent)
				{
					rentTax = rent * 10/100;
					System.out.print("\n\tYou have to pay Rent Tax :"+rentTax);
					break;
		
				}else
				{
					System.out.println("\nYou dont have to pay rent tax...");
		
				}
			}else
			{
				System.out.println("\n\tInvalid input...");
				continue L1;
			}
			
		}
		System.out.println();
		System.out.println();
		System.out.print("Do you want to calculate another Rent Tax (Y/N) : ");
			char yesOrno = input.next().charAt(0);
			clearConsole();
			if (yesOrno == 'Y' || yesOrno == 'y')
			{
				rentTax();
			}if(yesOrno == 'N' || yesOrno == 'n')
			{
				main(null);
			}
		
		
	}
	
	//<==================== BANK INTEREST TAX==================>
	public static void bankInterestTax(){
		Scanner input = new Scanner(System.in);
		System.out.println("+------------------------------------------------+");
		System.out.println("|\t\t BANK INTEREST TAX\t\t\t|");
		System.out.println("+------------------------------------------------+");
		L1:while (true)
		{
			System.out.print("Enter your bank interest per year\t : " );
			int bankInterest = input.nextInt();
			
			double bankInterestTax = 0;
			if (bankInterest > 0)
			{
				bankInterestTax = bankInterest * 5/100;
				System.out.print("You have to pay Bank Interest Tax per year : "+bankInterestTax);
				
				System.out.println();
				System.out.println();
				System.out.print("Do you want to calculate another Bank Interest Tax (Y/N) : ");
			char yesOrno = input.next().charAt(0);
			clearConsole();
			if (yesOrno == 'Y' || yesOrno == 'y')
			{
				bankInterestTax();
			}if(yesOrno == 'N' || yesOrno == 'n')
			{
				main(null);
			}
			}else
			{
				System.out.println("\n\tInvalid input...\n");
				continue L1;
			}
			
		}

	}
	
	//<================ DIVIDEND TAX ====================>
	public static void dividendTax(){
		Scanner input = new Scanner(System.in);
		System.out.println("+------------------------------------------------+");
		System.out.println("|\t\t DIVIDEND TAX\t\t\t|");
		System.out.println("+------------------------------------------------+");
		double dividendTax = 0;
		L1:while (true)
		{
			System.out.print("Enter your total dividend per year \t :");
			int dividend = input.nextInt();
			if (dividend > 0)
			{
				if (100000 < dividend)
				{
					dividendTax = dividend * 14/100;
					System.out.print("\n\tYou have to pay Dividend  Tax per year:"+dividendTax);
					break;
		
				}else
				{
					System.out.println("\nYou dont have to pay Dividend tax...\n");
		
				}
			}else
			{
				System.out.println("\n\tInvalid input...\n");
				continue L1;
			}
			
		}
		System.out.println();
		System.out.println();
		System.out.print("Do you want to calculate another Dividend Tax (Y/N) : ");
			char yesOrno = input.next().charAt(0);
			clearConsole();
			if (yesOrno == 'Y' || yesOrno == 'y')
			{
				dividendTax();
			}if(yesOrno == 'N' || yesOrno == 'n')
			{
				main(null);
			}
		
	}
	
	//<================== WITHHOLDING TAX =================>
	public static void withholdingTax(){
		Scanner input = new Scanner(System.in);
		System.out.println("+------------------------------------------------+");
		System.out.println("|\t\t WITHHOLDING TAX\t\t|");
		System.out.println("+------------------------------------------------+");
		System.out.println();
		System.out.println("\t[1] Rent Tax ");
		System.out.println();
		System.out.println("\t[2] Bank Interest Tax");
		System.out.println();
		System.out.println("\t[3] Dividend Tax");
		System.out.println();
		System.out.println("\t[4] Exit");
		System.out.println();
		System.out.print("Enter an option to continue ->");
		int option = input.nextInt();
		
		switch (option)
		{
			case 1:
				clearConsole();
				rentTax();
				break;
				
			case 2:
				clearConsole();
				bankInterestTax();
				break;
				
			case 3:
				clearConsole();
				dividendTax();
				break;
				
			case 4:
				return;
			default:
				clearConsole();
				System.out.println("Invalid input");
		}
		
	}
	
	//<====================== PAYABLE TAX======================>
	public static void payableTax(){
		Scanner input = new Scanner(System.in);
		System.out.println("+------------------------------------------------+");
		System.out.println("|\t\t PAYABLE TAX\t\t\t|");
		System.out.println("+------------------------------------------------+");
		L1:while (true)
		{
			System.out.print("Enter your employee payment per month : ");
			int employeePayment = input.nextInt();
			double payableTax = 0;
			if (employeePayment > 0)
			{
				if (employeePayment <= 100000)
				{
					System.out.println("\t You don't have to pay Payable Tax..");
				}else
				{
					if (employeePayment > 308333)
					{
						payableTax = employeePayment * 36/100;
					}else if (employeePayment >266667 )
					{
						payableTax = employeePayment * 30/100;
					}else if (employeePayment > 225000)
					{
						payableTax = employeePayment * 24/100;
					}else if (employeePayment > 183333)
					{
						payableTax = employeePayment * 18/100;
					}else if (employeePayment > 141667)
					{
						payableTax = employeePayment * 12/100;
						
					}else
					{
						payableTax = employeePayment * 6/100;
					}
					
					System.out.println("You have to pay Payable Tax per month : "+payableTax);
				}
			}else
			{
				System.out.println("\n\tInvalid input...\n");
				continue L1;
			}
				System.out.println();
				System.out.println();
				System.out.print("Do you want to calculate another Dividend Tax (Y/N) : ");
				char yesOrno = input.next().charAt(0);
				clearConsole();
					if (yesOrno == 'Y' || yesOrno == 'y')
					{
						payableTax();
					}if(yesOrno == 'N' || yesOrno == 'n')
					{
						main(null);
					}
		}
		
	}
	
	//<================================= Income TAX====================>
	public static void incomeTax(){
		Scanner input = new Scanner(System.in);
		System.out.println("+------------------------------------------------+");
		System.out.println("|\t\t Income TAX\t\t\t|");
		System.out.println("+------------------------------------------------+");
		L1:while (true)
		{
			System.out.print("Enter your total income per year\t : ");
			int totalIncome = input.nextInt();
			double incomeTax = 0;
			if (totalIncome > 0)
			{
				if (totalIncome <= 1200000)
				{
					System.out.println("\t You don't have to pay Income Tax..");
				}else
				{
					if (totalIncome > 3700000)
					{
						incomeTax = totalIncome * 36/100;
					}else if (totalIncome >3200000 )
					{
						incomeTax = totalIncome * 30/100;
					}else if (totalIncome > 2200000)
					{
						incomeTax = totalIncome * 24/100;
					}else if (totalIncome > 1700000)
					{
						incomeTax = totalIncome * 18/100;
					}else if (totalIncome > 1700000)
					{
						incomeTax = totalIncome * 12/100;
						
					}else
					{
						incomeTax = totalIncome * 6/100;
					}
					
					System.out.println("You have to pay Income Tax per month : "+incomeTax);
				}
			}else
			{
				System.out.println("\n\tInvalid input...\n");
				continue L1;
			}
				System.out.println();
				System.out.println();
				System.out.print("Do you want to calculate another Income Tax (Y/N) : ");
				char yesOrno = input.next().charAt(0);
				clearConsole();
					if (yesOrno == 'Y' || yesOrno == 'y')
					{
						incomeTax();
					}if(yesOrno == 'N' || yesOrno == 'n')
					{
						main(null);
					}
					
		}
		
	}
	
	//<========================= SOCIAL SECURITY CONTRIBUTION LEVY (SSCL) TAX =====================>
	public static void ssclTax(){
		Scanner input = new Scanner(System.in);
		System.out.println("+------------------------------------------------------------------+");
		System.out.println("|\t\t SOCIAL SECURITY CONTRIBUTION LEVY (SSCL) TAX  \t|");
		System.out.println("+------------------------------------------------------------------+");
		L1:while (true)
		{
			System.out.print("Enter value of Good or Services : ");
			int valueOfGood = input.nextInt();
			double saleTax = 0;
			double totalSsclTax = 0;
			double valueOfGoodSaleTaxAdd =0;
			double valueOfGoodSaleVatAdd = 0;
			if (valueOfGood > 0)
			{
				saleTax = valueOfGood * 2.5/100;
				valueOfGoodSaleTaxAdd = valueOfGood + saleTax;
				valueOfGoodSaleVatAdd = valueOfGoodSaleTaxAdd * 15/100;
				totalSsclTax = saleTax + valueOfGoodSaleVatAdd;
				System.out.println("You have to pay SSCL Tax\t: "+totalSsclTax);
			}else
			{
				System.out.println("\n\tInvalid input...\n");
				continue L1;
			}
				System.out.println();
				System.out.println();
				System.out.print("Do you want to calculate another Income Tax (Y/N) : ");
				char yesOrno = input.next().charAt(0);
				clearConsole();
					if (yesOrno == 'Y' || yesOrno == 'y')
					{
						incomeTax();
					}if(yesOrno == 'N' || yesOrno == 'n')
					{
						main(null);
					}
		}	
	}
	
	//<===============================  Leasing Payment===========================>
	
	public static void leasingPayment(){
		Scanner input = new Scanner(System.in);
		System.out.println("+------------------------------------------------+");
		System.out.println("|\t\t Leasing Payment\t\t|");
		System.out.println("+------------------------------------------------+");
		System.out.println();
		System.out.println("\t[1] Calculate Monthly Installment ");
		System.out.println();
		System.out.println("\t[2] Search Leasing Category");
		System.out.println();
		System.out.println("\t[3] Find Leasing Amount");
		System.out.println();
		System.out.println("\t[4] Exit");
		System.out.println();
		System.out.print("Enter an option to continue ->");
		int option = input.nextInt();
		
		switch (option)
		{
			case 1:
				clearConsole();
				calculateMonthlyInstallment();
				break;
				
			case 2:
				clearConsole();
				searchLeasingCategory();
				break;
				
			case 3:
				clearConsole();
				findLeasingAmount();
				break;
				
			case 4:
				return;
			default:
				clearConsole();
				System.out.println("Invalid input");
		}
	}
	
	//<========================= Calculate Leasing Payment===========================>
	
	public static void calculateMonthlyInstallment(){
		Scanner input = new Scanner(System.in);
		System.out.println("+------------------------------------------------------------------+");
		System.out.println("|\t\t Calculate Leasing Payment       \t\t  |");
		System.out.println("+------------------------------------------------------------------+");
		L1:while(true){
		System.out.print("Enter lease amount\t: ");
			double leaseAmount = input.nextDouble();
			
			double monthlyInstallment = 0;
			
			if (leaseAmount > 0)
			{
				double annualInterestRate = 0;
					L3:while (true)
					{
						System.out.print("Enter annual interest rate : ");
						annualInterestRate = input.nextDouble();
						
						if (annualInterestRate < 0)
						{
							System.out.println("Annual Interest Rate must be grater than 0...");
							continue L3;
						}else
						{
							int year = 0;
							L2:while(true){
									System.out.print("Enter number of year \t: ");
									year = input.nextInt();
					
						if(year <=5 ){
								monthlyInstallment = leaseAmount * (annualInterestRate/1200) / ( 1 - (1 / Math.pow(1 + (annualInterestRate/12),(12*year)) ));
								System.out.println("Your monthly instalment\t: "+monthlyInstallment);
							

						}else
					{
						System.out.print("\t Invalid number of year... Enter the correct value again..\n\n");
						continue L2;
					}
					System.out.println();
					System.out.println();
					System.out.print("Do you want to calculate another Income Tax (Y/N) : ");
					char yesOrno = input.next().charAt(0);
					clearConsole();
					if (yesOrno == 'Y' || yesOrno == 'y')
					{
						calculateMonthlyInstallment();
					}if(yesOrno == 'N' || yesOrno == 'n')
					{
						main(null);
					}
					}
						}
					}
					
					
			}else
			{
				System.out.println("\n\tInvalid input...\n");
				continue L1;
			}
		}


	}
	
	public static void searchLeasingCategory(){
		Scanner input = new Scanner(System.in);
		System.out.println("+------------------------------------------------------------------+");
		System.out.println("|\t\t Search Leasign Category      \t\t \t  |");
		System.out.println("+------------------------------------------------------------------+");
		L1:while (true)
		{
			System.out.print("Enter lease amount\t: ");
			double leaseAmount = input.nextDouble();
			System.out.println();
			double monthlyInstallment =0;
			L2:while(true){
			System.out.print("Enter annual interest rate: ");
			double interestRate = input.nextDouble();
			System.out.println();
			
			if (leaseAmount < 0 )
			{
				System.out.println("Annual Interest Rate must be grater than 0...");
				continue L1;
			}else
			{
				for (int i = 3; i < 6; i++)
				{
					monthlyInstallment = leaseAmount * (interestRate/12) / ( 1 - (1 / Math.pow(1 + (interestRate/12),(12*i)) ));
					System.out.println("Your monthly instalment for " +i +" year leasing plan -  "+monthlyInstallment);
				}
			}
					System.out.println();
					System.out.println();
					System.out.print("Do you want to calculate another Income Tax (Y/N) : ");
					char yesOrno = input.next().charAt(0);
					clearConsole();
					if (yesOrno == 'Y' || yesOrno == 'y')
					{
						searchLeasingCategory();
					}if(yesOrno == 'N' || yesOrno == 'n')
					{
						main(null);
					}
			}
			
			
		}
		
		
	}
	//<==========Find Leasign Amount ===================>
	
	public static void findLeasingAmount(){
		Scanner input = new Scanner(System.in);
		System.out.println("+------------------------------------------------------------------+");
		System.out.println("|\t\t Find Leasign Amount      \t\t \t  |");
		System.out.println("+------------------------------------------------------------------+");

		System.out.print("Enter the monthly lease payment amount you can afford \t: ");
			double monthlyLeaseAmount = input.nextDouble();
			System.out.println();
			
			
			double annualInterestRate = 0;
			double avilableLeasingAmount = 0;
					L3:while (true)
					{
						int year = 0;
							L2:while(true){
									System.out.print("Enter number of year  \t\t\t\t\t: ");
									year = input.nextInt();
									System.out.println();
					
							if(year <=5 ){
								
								L1:while(true){
								System.out.print("Enter annual interest rate \t\t\t\t: ");
								annualInterestRate = input.nextDouble();
								System.out.println();
								
								if (annualInterestRate > 0)
								{
									avilableLeasingAmount  = (monthlyLeaseAmount * (( 1 -  Math.pow(1 + (annualInterestRate/1200),(-12*year)) )))/(annualInterestRate/1200); 
									System.out.println("You can get Lease Amount\t\t\t\t: "+avilableLeasingAmount);
									System.out.println();
									System.out.println();
									System.out.print("Do you want to calculate another Income Tax (Y/N) : ");
									char yesOrno = input.next().charAt(0);
									clearConsole();
									if (yesOrno == 'Y' || yesOrno == 'y')
									{
										findLeasingAmount();
									}if(yesOrno == 'N' || yesOrno == 'n')
									{
										main(null);
									}
								}else
								{
									System.out.println("Annual Interest Rate must be grater than 0...");
									continue L1;
								}
								}
								

							}else
							{
								System.out.print("\t Invalid number of year... Enter the correct value again..\n\n");
								continue L2;
							}
							
							
					}
		
	
				}
	}
	
	//<======================Main method==========================>
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("\t\t\t\t\t __  ________ ________ ________");
		System.out.println("\t\t\t\t\t|  \\/        \\|       |        \\");
		System.out.println("\t\t\t\t\t \\$|   $$$$$$ | $$$$$$$$\\$$$$$$$$");
		System.out.println("\t\t\t\t\t|  | $$     \\$| $$__      | $$");
		System.out.println("\t\t\t\t\t| $| $$       | $$  \\     | $$");
		System.out.println("\t\t\t\t\t| $| $$    ___| $$$$$     | $$");
		System.out.println("\t\t\t\t\t| $| $$___/   | $$_____   | $$");
		System.out.println("\t\t\t\t\t| $$\\$$      $| $$     \\  | $$");
		System.out.println("\t\t\t\t\t \\$$ \\$$$$$$   \\$$$$$$$$   \\$$");
		System.out.println();
		System.out.println("  ______          __   __    ____              _        ____     _   _   _                  ______   ____   ______");
		System.out.println(" |__  __|   /\\    \\ \\ / /   / ___|     /\\     | |      / ___|   | | | | | |          /\\    |__  __| / __ \\  |  __ \\");
		System.out.println("   | |     /  \\    \\ V /   | |        /  \\    | |     | |       | | | | | |         /  \\      | |  | |  | | | |__) |");
		System.out.println("   | |    / /\\ \\    > <    | |       / /\\ \\   | |     | |       | | | | | |        / /\\ \\     | |  | |  | | |  _  /");
		System.out.println("   | |   / ____ \\  / . \\   | |___   / ____ \\  | |___  | |____   | |_| | | |___    / ____ \\    | |  | |__| | | | \\ \\");
		System.out.println("   |_|  /_/    \\_\\/_/ \\_\\   \\____| /_/    \\_\\ |_____|  \\_____|   \\___/  |_____|  /_/    \\_\\   |_|   \\____/  |_|  \\_\\");
		System.out.println();
		System.out.println("========================================================================================================================");
		System.out.println();
		System.out.println();
		System.out.println("\t[1] Withholding Tax");
		System.out.println("\t[2] Payable Tax");
		System.out.println("\t[3] Income Tax");
		System.out.println("\t[4] Social Security Contribution Levy (SSCL) Tax");
		System.out.println("\t[5] Leasing Payment");
		System.out.println("\t[6] Exit ");	
		System.out.println();
		System.out.print("Enter an option to continue ->");	
		int option = input.nextInt();
		
		switch (option)
		{
			case 1:
				clearConsole();
				withholdingTax();
				break;
			case 2:
				clearConsole();
				payableTax();
				break;
				
			case 3:
				clearConsole();
				incomeTax();
				break;
				
			case 4:
				clearConsole();
				ssclTax();
				break;
				
			case 5:
				clearConsole();
				leasingPayment();
				break;
				
			case 6:
			
				return;
			default:
				clearConsole();
				System.out.println("Invalid input");
		}
		
		
		
	}
}
