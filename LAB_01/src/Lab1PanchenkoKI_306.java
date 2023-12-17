import java.io.*;
import java.util.*;
/**
* Class Lab1_Panchenko_KI_306 implements the program for laboratory work #1
*/
public class Lab1PanchenkoKI_306
{
/**
* The static main method is the entry point to the program
* 
* @param args is arguments
* @throws FileNotFoundException is exception
* 
*/

public static void main(String[] args) throws FileNotFoundException
{
int nRows;
char[][] arr;
String filler;
Scanner in = new Scanner(System.in);
File dataFile = new File("Lab-1.txt");
PrintWriter fout = new PrintWriter(dataFile);
System.out.print("Введіть розмір квадратної матриці: ");
nRows = in.nextInt();
in.nextLine();
arr = new char[nRows][];
for(int i = 0; i < nRows; i++)
{
arr[i]= new char[nRows/2];
}
System.out.print("\nВведіть символ-заповнювач: ");
filler = in.nextLine();
exit:
for(int i = 0; i < nRows; i++)
{
for(int j = 0; j < nRows/2; j++)
{
if(filler.length() == 1)
{
arr[i][j] = (char) filler.codePointAt(0);
System.out.print(" " + arr[i][j] );
fout.print(" " + arr[i][j]);}
else if (filler.length() == 0)
{
System.out.print("\nНе введено символ заповнювач");
break exit;
}
else 
{
System.out.print("\nЗабагато символів заповнювачів");
break exit;
}
}
if(nRows-nRows/2-nRows/2 == 1)
{
System.out.print("  " );
fout.print("  " );	
}
System.out.print("\n");
fout.print("\n");
}
fout.flush();
fout.close();
}
}
