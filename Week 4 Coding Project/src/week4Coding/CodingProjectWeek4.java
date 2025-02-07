package week4Coding;

public class CodingProjectWeek4 {

	public static void main(String[] args) {
		
		//Part 1
		//Create an array named ages with the values required.
		int [] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		//A. Subtract the first element from the last element of the array
		int subtractA = ages[ages.length - 1] - ages[0];
		System.out.println(subtractA);
		
		// B. Create a new array ages2 with 9 elements
        int[] ages2 = {5, 12, 30, 45, 18, 22, 35, 50, 100};

        // Subtract the first element from the last element of ages2
        int subtractB = ages2[ages2.length - 1] - ages2[0];
        System.out.println(subtractB);
        
        //C. Find the average of array ages and print it to the console
        int sum = 0;
        for (int age : ages) {
        	sum += age;
        }
        int average = sum / ages.length;
        System.out.println(average);
        
        
        //Part 2
        //Create an array of String called names
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        
        //A. Calculate the average number of letters per name and print to the console
        int letterTotals = 0;
        for (String name : names) {
            letterTotals += name.length();//Calculates the total letters of all names
        }
        int letterAverage = letterTotals/names.length;//divides the letters of all names by the array length
        System.out.println(letterAverage);
        
        //B. Concatenate all the names together separated by spaces
        StringBuilder concatenateNames = new StringBuilder();
        for (String name : names) {
            concatenateNames.append(name).append(" ");
        }
        System.out.println(concatenateNames);
        
        //Part 3
        //How do you access the last element of any array?
        
        // array[array.length - 1]; is how you would access the last element of any array regardless of size
        
        
        //Part 4
        //How do you access the first element of any array?
        
        // array[0]; is how you would access the first element of any array regardless of size

        
        //Part 5
        //Create a new array of int called nameLengths that pulls in the names array length
        int[] nameLengths = new int[names.length];

        // Loop to add the lengths of each name from the array of names
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }
        
        
        //Part 6
        // Loop to calculate the sum of all elements in the nameLengths array and print sum to console
        int sumLengths = 0;
        for (int length : nameLengths) {
            sumLengths += length;
        }
        System.out.println(sumLengths);
        
        
        //Testing of Methods
        
        //concatString
        
        String concat = concatString("Hello", 3);
        System.out.println(concat);
        
        //fullName
        
        String fullName = fullName("Harry", "Potter");
        System.out.println(fullName);
        
        //over100
        
        int[] numbers = {1, 5, 79, 4, 66};
        boolean trueOrNot = over100(numbers);
        System.out.println(trueOrNot);
        
        //arrAverage
        
        double[] numbers2 = {33.4, 5.0, 44.3, 67.0, 9.7};
        double average1 = arrAverage(numbers2);
        System.out.println(average1);
        
        //greaterThan
        
        double[] array1 = {44.3, 5.8, 24.6, 89.1};
        double[] array2 = {42.9, 14.6, 3.6, 12.5};
        
        boolean largerOrNot = greaterThan(array1, array2);
        System.out.println(largerOrNot);
        
        //willBuyDrink
        
        boolean isHotOutside = true;
        double moneyInPocket = 12.50;
        
        boolean drinkOrNot = willBuyDrink(isHotOutside, moneyInPocket);
        System.out.println(drinkOrNot);
        
        
        //negativeBalance
        
        double bankBalance = 1545.89;
        double transaction = 1450.99;
        
        boolean canIAffordIt = negativeBalance(bankBalance, transaction);
        
        
        
       
	}//Main method close
	
	
	//Part 7
    //Create a method that takes String word and int n as arguments
    public static String concatString(String word, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += word;
		}
		return result;
    }//concatString Method Close
    
    //Part 8
    //Create a method that concatenates firstName and lastName variables
    public static String fullName(String firstName, String lastName) {
    	String result = firstName + " " + lastName;
    	return result;
    }//fullName Method Close
    
    //Part 9
    //Create a method that takes an int array and returns true if sum is over 100
    public static boolean over100(int[] array) {
    	int sum = 0;
    	for (int num : array) {
    		sum += num;
    	}
    	return sum > 100;
    }//over100 Method Close
    
    
    //Part 10
  //Create a method of double that returns the average of elements in the array
    public static double arrAverage(double[] array) {
    	double sum = 0;
        for (double num : array) {
            sum += num; // Add each array element together
        }

        return sum / array.length; //divide array sum by length for average
    }//arrAverage Method Close
    
    
    //Part 11
    //Create a method that takes 2 double arrays and returns true if the average of the first is larger than the second
    public static boolean greaterThan(double[] array1, double[] array2) {
    	double average1 = arrAverage(array1);//used previous method to find the average
    	double average2 = arrAverage(array2);
    	
    	return average1 > average2;
    }//greaterThan Method Close
    
    
    //Part 12
    //Create a method that will return true if its hot outside and moneyInPocket is more than 10.50
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
    	return isHotOutside && moneyInPocket > 10.50;
    	
    }//willBuyDrink Method Close
    
    //Part 13
    //Create a method of my own that solves a problem
    /*
     * The following method lets you know if the transaction you are about to make will
     * make your bank balance negative or not. Depending on the result you will be told your
     * bank balance with a successful transaction or if the transaction would have put the account
     * negative.
     */
    public static boolean negativeBalance(double bankBalance, double transaction) {
    	if (transaction > bankBalance) {
    		System.out.println("This transaction will bring you bank account balance negative! Your current account balance is "
    				+ bankBalance);
    		return false;
    	}else {
    		double success = bankBalance - transaction;
    		System.out.println("Your transaction went through successfully!  Your new balance is " + success + "." );
    		return true;
    	}
    	
    }//negativeBalance Method Close
    
    

}//Class close
