import java.util.Scanner;

public class LibraryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the librarys location");
		String LibraryLocation2 = scanner.nextLine();
		System.out.println("Enter total number of books");
		int LibraryTotalBooks2 = scanner.nextInt();
		System.out.println("What is the total number of staff?");
		int LibraryStaffTotal2 = scanner.nextInt();
		System.out.println("What is the yearly expense?");
		int LibraryYearlyExpense2 = scanner.nextInt();
		
		
		Library to = new Library( LibraryLocation2 ,LibraryTotalBooks2 ,LibraryStaffTotal2,LibraryYearlyExpense2 );
		System.out.println(to.LibraryLocation + to.LibraryTotalBooks + to.LibraryStaffTotal + to.LibraryYearlyExpense);
		
		System.out.println(LibraryLocation2 + LibraryTotalBooks2 + LibraryStaffTotal2 + LibraryYearlyExpense2);
		
		


	}

}
