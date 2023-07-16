/*
 
# Biryani-classes

# Problem
According to a recent survey, Biryani is the most ordered food. Chef wants to learn how to make world-class Biryani from a MasterChef. Chef will be required to attend the MasterChef's classes for X weeks, and the cost of classes per week is Y coins. What is the total amount of money that Chef will have to pay?

# Input Format
->The first line of input will contain an integer T — the number of test cases. The description of T test cases follows.

-> The first and only line of each test case contains two space-separated integers X and Y, as described in the problem statement.

# Output Format
For each test case, output on a new line the total amount of money that Chef will have to pay.

# Constraints

-> 1≤T≤10 

-> 1≤X,Y≤100

# Explanation:

Test case 1: 
Chef will be required to attend the MasterChef's classes for 1 week and the cost of classes per week is 10 coins. Hence, Chef will have to pay 10 coins in total.

Test case 2: 

Chef will be required to attend the MasterChef's classes for 1 week and the cost of classes per week is 15 coins. Hence, Chef will have to pay 15 coins in total.

Test case 3: 

Chef will be required to attend the MasterChef's classes for 2 weeks and the cost of classes per week is 10 coins. Hence, Chef will have to pay 20 coins in total.

Test case 4: 

Chef will be required to attend the MasterChef's classes for 2 weeks and the cost of classes per week is 15 coins. Hence, Chef will have to pay 30 coins in total.

 */

import java.util.Scanner;

public class BiryaniClasses {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=1;i<=T;i++){
		    int X=sc.nextInt();
		    int Y=sc.nextInt();
		    int Z=X*Y;
		    System.out.println(Z);
		}
    }
}
