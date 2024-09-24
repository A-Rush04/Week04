
public class Week04Assignment {

  public static void main(String[] args){
    
    // #1 Creating an array of ages, ages are whole numbers and should be integers.
    int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
    

  //I am subtracting the first element from the final element (counting begins at 0) 
    int results = ages[ages.length - 1] - ages[0]; 
    System.out.println("The first element minus the final element is (ages[7] - ages[0]: ");
    
  
    // Creating a second array for another list of ages. 
    int[] ages2 = new int[9];
    
    // Initialized ages2 with values
    ages2[0] = 5; 
    ages2[1] = 15;
    ages2[2] = 25;
    ages2[3] = 18;
    ages2[4] = 23;
    ages2[5] = 9;
    ages2[6] = 7;
    ages2[7] = 20;
    ages2[8] = 10;
    
    //copying the above subtraction with the new array
    
    int resultsAges2 = ages2[ages2.length - 1] - ages2[0];
    System.out.println("The first element minus the final element is: (ages2[8] - ages2[0] " + resultsAges2);
  
    // Getting the average age. Using double as the average amount may be a decimal
    double sum = 0; 
    for (int age : ages) {
      sum += age;
    }
    double average = sum / ages.length; 
    System.out.println("Average age: " + average);

  
  // #2 Creatin an array for a String of names
  String[] names = new String[] {
      "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
  
  // Calculate the average number of letters per name, using integers because names should have more letters than zero and be whole numbers
  
  int totalLetters = 0;
  
  for (String name : names) {
      totalLetters += name.length(); 
  }}
  
  
  // Getting the average number of letters in each word can result in a decimal, thus utilizing the double variable
  double averageLetters = (double) totalLetters / names.length; 
  System.out.println(" The average number of letters per name is: " + averageLetters);
  
  // Concatenate the names in the array together, separating them with proper spacing.
  
  StringBuilder concatenatedNames = new StringBuilder();{
  
  for (int i = 0; i < names.length; i++) {
      concatenatedNames.append(names[i]);
      if (i < names.length - 1) {
        concatenatedNames.append(" "); // Adding a space between each name
      }
      
   // #3 You can access the last element of any array by using the array's name - 1. This is because the counting begins at 0, ie; an array of 10 elements would be counted as 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
      
   // #4 You can access the first element of any array by using the array[0] which will be the starting point of counting of the elements in an array
      
      
   // #5 Creating an array of int for nameLengths 
   int[] nameLengths = new int[names.length]; 
   
   
   // Using the index to add the length of each name to the array
   for (int i = 0; i < names.length; i++) {
       nameLengths[i] = names [i].length(); 
   }
   
   // Printing the nameLength array 
   System.out.println("Lengths of the names: ");
   for (int length : nameLengths) {
     System.out.println(length + " ");
   }
   
   // #6 Calculating the sum of all elements in the nameLengths array
   int sum = 0;
   for (int length : nameLengths) {
     sum += length;
   }
   System.out.println("The sum of all name lengths is: " +sum);
  }}
  
  
  // #7 A Method taking a String, word, and in = n arguements to return the concatenated word n times
 
  
    
    public static String repeatString(String word, int n) {
      return word.repeat(n);
    }
    
   {
      System.out.println("Hello, 3"); // Output should be HelloHelloHello
    
    
  }
  
  // #8 Taking 2 Strings (firstName and lastName and returning a full name separated by a space
 public static String getFullName(String firstName, String lastName) {
   return firstName + " " + lastName; 
 
  }
 // defining the String variables for the method
  String firstName = "Alec";
  String lastName = "Rush";
  String fullName = firstName + " " + lastName; 
  
  {
    }
  
  
  // #9 Looking at the sum of the elements in an array to return a True value if the sum is greater than 100
  public static boolean isSumMoreThan100(int[] arr) {
    int sum = 0;
    for (int num : arr) {
      sum += num; 
      
    }
    return sum > 100; 
  }
 
  public static void main9(String[] args) {
 int[] numbers = {25, 35, 80};
 System.out.println(isSumMoreThan100(numbers)); //Prints results referring to if the sum is greater than 100
  } 

// #10 A Method that takes the array of a double variable and returns the average of all elements

public static double calculateAverage(double[] nums) {
  if (nums == null || nums.length == 0) {
    return 0; //This will ensure that there is not an empty or null array
  }


// Defining the variable double 
double sum = 0; {
for (double num : nums) {
  sum += num;
  }
  return sum / nums.length;}
}

// calling an array to be defined for the above method. 
public static void main10(String[] args) {
  double[] tenthArray = {10.1, 15.5, 22.2, 70.74}; 
  System.out.println("Average: " + calculateAverage(tenthArray));
}

   
  // #11 A Method to take two arrays of double and returns True if the first array is greater than the average of elements in the second array

public static boolean isFirstArrayAverageGreater(double[] array1, double[] array2) {
  double average1 = calculateAverage(array1);
  double average2 = calculateAverage(array2);
  return average1 > average2;
}

private static double calculateAverage(double[] array) {
  if (array == null || array.length == 0) {
      return 0; // Ensures coverage of an empty or null array
  }
  double sum = 0;
  for (double num : array) {
      sum += num;
  }
  return sum / array.length;
}

public static void main11(String[] args) {
  double[] array1 = {1.5, 2.5, 3.5};
  double[] array2 = {1.0, 2.0, 3.0};
  
  boolean result = isFirstArrayAverageGreater(array1, array2);
  System.out.println("Is the average of the first array greater than the second array? " + result);
}                                         
  
  // #12 A Method to return True if it is hot outside and the amount of money in the pocket is greater than 10.50

public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
  return isHotOutside && moneyInPocket > 10.50;
}

public static void main12(String[] args) {
  System.out.println(willBuyDrink(true, 15.00));
  System.out.println(willBuyDrink(false, 15.00));
}}




  // #13 Write a method to solve a problem, in comments write what the method does and why I created it


// The below method would be used to determine if the dog that listens to commands would be a good dog or not

private String name; 
private boolean listensToCommands;

public dog(String name, boolean listensToCommand) {
  this.name = name;
  this.listensToCommands = listensToCommands;
}

//setup the boolean to return if a dog who listens to commands is a good god or not. 
public boolean isGoodDog() {
  return listensToCommands;
}

//Setting up the string to name the dog in question
public String getName() {
  return name;
}

public static void maint(String[] args) {
  Dog dog1 = new Dog("Max", true);
  Dog dog2 = new Dog("Bella", false);
  
  System.out.println(dog1.getName() + " is a good dog: " + dog1.isGoodDog());
  System.out.println(dog2.getName() + " is a good dog: " + dog2.isGoodDog());
  
}

  
