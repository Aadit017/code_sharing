// Java program to print the initials 
// of a name with the surname 
import java.util.*; 

class Initials_of_name_with_surname { 
	public static void printInitials(String str) 
	{ 
		int len = str.length(); 

		// to remove any leading or trailing spaces 
		str = str.trim(); 

		// to store extracted words 
		String t = ""; 
		for (int i = 0; i < len; i++) { 
			char ch = str.charAt(i); 

			if (ch != ' ') { 

				// forming the word 
				t = t + ch; 
			} 

			// when space is encountered 
			// it means the name is completed 
			// and thereby extracted 
			else { 
				// printing the first letter 
				// of the name in capital letters 
				System.out.print(Character.toUpperCase(t.charAt(0)) 
								+ ". "); 
				t = ""; 
			} 
		} 

		String temp = ""; 

		// for the surname, we have to print the entire 
		// surname and not just the initial 
		// string "t" has the surname now 
		for (int j = 0; j < t.length(); j++) { 

			// first letter of surname in capital letter 
			if (j == 0) 
				temp = temp + Character.toUpperCase(t.charAt(0)); 

			// rest of the letters in small 
			else
				temp = temp + Character.toLowerCase(t.charAt(j)); 
		} 

		// printing surname 
		System.out.println(temp); 
	} 

	public static void main(String[] args) 
	{ 
	        Scanner sc = new Scanner (System.in);
	        System.out.println("ENTERA NAMEK");
	        String str=sc.nextLine();
		 
		printInitials(str); 
	} 
} 
