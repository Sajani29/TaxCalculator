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
			if (yesOrno == 'Y' || yesOrno == 'y')
			{
				rentTax();
			}if(yesOrno == 'N' || yesOrno == 'n')
			{
				main(null);
			}
		
		
	}
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
				rentTax();
				break;
				
			case 2:
				bankInterestTax();
				break;
				
			case 3:
				
				break;
				
			case 4:
				return;
			default:
				System.out.println("Invalid input");
		}
		
	}
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
				withholdingTax();
				break;
			case 2:
			
				break;
				
			case 3:
			
				break;
				
			case 4:
			
				break;
				
			case 5:
			
				break;
				
			case 6:
			
				return;
			default:
				System.out.println("Invalid input");
		}
		
		
		
	}
}
