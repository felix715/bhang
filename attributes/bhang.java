package attributes;
// Sales.java
// Program calculates sales, based on an input of product
// number and quantity sold
import java.util.Scanner;
public class bhang{
 // calculates sales for 5 products
 public static void main( String args[] )
 {
 Scanner input = new Scanner( System.in );
 int productNumber;


 double product1 = 0; // amount sold of first product
 double product2 = 0; // amount sold of second product
 double product3 = 0; // amount sold of third product
 double product4 = 0; // amount sold of fourth product
 double product5 = 0; // amount sold of fifth product
 double product1val = 2.98;
 double product2val = 4.50;
 double product3val = 9.98;
 double product4val = 4.49;
 double product5val = 6.87;
 /* Ask the user to enter product number */

 System.out.println("\nEnter Product Number 1-5 (0 to stop and view summary):");
 productNumber = input.nextInt();

 /* Create while statement that loops until sentinel is entered */
 while (productNumber != 0){
 /* Determine whether user's product number is in 1-5 */
 if (productNumber >= 1 && productNumber <= 5)

 /* If so, ask user to input the quantity sold */
 /* Write a switch statement here that will compute the total
 for that product */
 switch(productNumber)
 {
 case 5:{
 System.out.print("Enter quantity sold: ");
 product5+=input.nextDouble();
 break;