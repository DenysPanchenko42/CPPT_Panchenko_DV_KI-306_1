/**
* lab 2 package
*/
package KI_306.Panchenko.Lab2;
import static java.lang.System.out;
import java.io.*;
/**
* Phone Application class implements main method for 
* Phone class abilities demonstration
*/
public class PhoneApp  
{
/**
* @param args is arguments
* @throws FileNotFoundException is exception 
*/
	public static void main(String[] args) throws FileNotFoundException
	{
	// TODO Auto-generated method stub
	Phone myPhone = new Phone("SamsungA10", 30,"+0987654321", 120);
	
	
	myPhone.call("+0912345678");
	
	myPhone.turnOn();
	
	myPhone.call("+0912345678");
	
	myPhone.checkBattery();
	
	myPhone.chargeBattery(60);
	
	myPhone.checkBalance();
	
	myPhone.replenishBalance(40);
	
	myPhone.connectDevice("Навушники");
	
	myPhone.bluetoothOn();
	
	myPhone.connectDevice("Навушники");
	
	myPhone.changeLoudness(5,"more");
	
	myPhone.changeLoudness(2,"less");
	
	myPhone.disconnectDevice("Годинник");
	
	myPhone.disconnectDevice("Навушники");
	
	myPhone.sendSMS("0912345678","Привіт");
	
	myPhone.changeNameDevice("Мій пристрій");
	
	myPhone.info();
	
	myPhone.turnOff();
	
	myPhone.dispose();
	
	}	
}
