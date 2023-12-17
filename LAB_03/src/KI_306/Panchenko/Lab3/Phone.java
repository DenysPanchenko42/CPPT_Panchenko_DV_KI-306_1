/**
* lab 3 package
*/
package KI_306.Panchenko.Lab3;
import java.io.*;
/**
* Class <code>Phone</code> implements phone
*/

public class Phone {
	private String nameDevice;
	public boolean isOn;
    private int batteryLevel;
    private String numberOfThisPhone;
    private boolean bluetooth;
    private double balance;
    private String connectedDevices;
    private int loudness;
    public PrintWriter fout;
    
    /**
    * Constructor
    * @throws FileNotFoundException is exception 
    */
    public Phone() throws FileNotFoundException
    {
    nameDevice = "This phone";
    isOn = false;
    batteryLevel = 0;
    numberOfThisPhone = "+380933333333";
    bluetooth = false;
    balance = 0;
    connectedDevices = "";
    loudness = 0;
    fout = new PrintWriter(new File("Log.txt"));
    }
    
    /**
    * Constructor
    * @param nameDevice The name of this phone
    * @param batteryLevel This phone's battery level
    * @param numberOfThisPhone The number of this phone
    * @param balance This phone's balance
    * @throws FileNotFoundException is exception 
    */
    public Phone(String nameDevice, int batteryLevel, String numberOfThisPhone, double balance) throws FileNotFoundException
    {
    this.nameDevice = nameDevice;
    isOn = false;
    this.batteryLevel = batteryLevel;
    this.numberOfThisPhone = numberOfThisPhone;
    this.balance = balance;
    bluetooth = false;
    connectedDevices = "";
    loudness = 0;
    fout = new PrintWriter(new File("Log.txt"));
    }
    
    /**
     * Method for turning on a phone
     */
    public void turnOn() {
    	System.out.println(" \n");
		fout.print(" \n");
    	isOn = true;
        System.out.println("Телефон " + nameDevice + " увімкнено \n");
        fout.print("Телефон " + nameDevice + " увімкнено \n");
    }
    
    /**
     * Method for turning off a phone
     */
    public void turnOff() {
    	System.out.println(" \n");
		fout.print(" \n");
    	isOn = false;
        bluetooth = false;
        connectedDevices = "";
        System.out.println("Телефон " + nameDevice + " вимкнено \n");
        fout.print("Телефон " + nameDevice + " вимкнено \n");
    }

    /**
     * Method for check the battery charge level
     */
    public void checkBattery() {
    	System.out.println(" \n");
		fout.print(" \n");
    	System.out.println("Заряд батареї: " + batteryLevel + " % \n");
        fout.print("Заряд батареї: " + batteryLevel + " % \n");
    }
    
    /**
     * Method for charging a phone battery
     * @param time The battery charging time in minutes
     */
    public void chargeBattery(int time) {
    	System.out.println(" \n");
		fout.print(" \n");    
    	if (batteryLevel + time/2 >= 100) {
                batteryLevel = 100;
            } else { batteryLevel += time/2;}
            System.out.println("Батарея заряджалась " + time + " хвилин \n" + "Заряд батареї: " + batteryLevel + " % \n");
            fout.print("Батарея заряджалась " + time + " хвилин \n" + "Заряд батареї: " + batteryLevel + " % \n");
    }
    
    /**
     * Method for sending an SMS message
     * @param phoneNumber Recipient's phone number
     * @param message Message text
     */
    public void sendSMS(String phoneNumber, String message) {
    	System.out.println(" \n");
		fout.print(" \n");
    	if (isOn) {
    		System.out.println("Відправляємо SMS на номер " + phoneNumber + ": " + message + "\n" + "SMS успішно надіслано \n");
            fout.print("Відправляємо SMS на номер " + phoneNumber + ": " + message + "\n" + "SMS успішно надіслано \n");
    	} else {
            System.out.println("Телефон вимкнено, щоб надіслати SMS ввімкніть його \n");
            fout.print("Телефон вимкнено, щоб надіслати SMS ввімкніть його \n");
        }
    }
    
    /**
     * Method for calling the number
     * @param phoneNumber The phone number to call
     */
    public void call(String phoneNumber) {
    	System.out.println(" \n");
		fout.print(" \n");
    	if (isOn) {
    		System.out.println("Дзвінок на номер " + phoneNumber + "...\n");
            fout.print("Дзвінок на номер " + phoneNumber + "...\n"); 
        } else {
            System.out.println("Телефон вимкнено, щоб здійснити дзвінок ввімкніть його \n");
            fout.print("Телефон вимкнено, щоб здійснити дзвінок ввімкніть його \n");
        }
    }
    
    /**
     * Method to change device name
     * @param newName New name
     */
    public void changeNameDevice(String newName) {
    	System.out.println(" \n");
		fout.print(" \n"); 
    	if (isOn) {
    		 nameDevice = newName;
    	     System.out.println("Назву цього пристрою змінено, нова назва - " + newName + "\n");
    	     fout.print("Назву цього пристрою змінено, нова назва - " + newName + "\n");
    	    } else {
    	    	System.out.println("Телефон вимкнено, щоб змінити ім'я ввімкніть його \n");
                fout.print("Телефон вимкнено, щоб змінити ім'я ввімкніть його \n");
    	    }
    }
    
    /**
     * Method for changing number of this phone
     * @param newNumber New number of this phone
     */
    public void changeNumberOfThisPhone(String newNumber) {
    	System.out.println(" \n");
		fout.print(" \n");
    	if (isOn) {
    		numberOfThisPhone = newNumber;
    		System.out.println("Номер телефону цього пристрою змінено, новий номер - " + newNumber + "\n");
    		fout.print("Номер телефону цього пристрою змінено, новий номер - " + newNumber + "\n");
    		} else {
    			System.out.println("Телефон вимкнено, щоб змінити номер ввімкніть його \n");
    			fout.print("Телефон вимкнено, щоб змінити номер ввімкніть його \n");
    		}
    }
    
    /**
     * Method for check the balance
     */
    public void checkBalance() {
    	System.out.println(" \n");
		fout.print(" \n");
    	if (isOn) {
    		System.out.println("Стан балансу: " + balance + " грн \n");
    		fout.print("Стан балансу: " + balance + " грн \n");
    		} else {
    			System.out.println("Телефон вимкнено, щоб перевірити баланс ввімкніть його \n");
    			fout.print("Телефон вимкнено, щоб перевірити баланс ввімкніть його \n");
    		}
    }
    
    /**
     * Method for replenishing the balance
     * @param sum The balance replenishment amount
     */
    public void replenishBalance (int sum) {
    	System.out.println(" \n");
		fout.print(" \n");
    	if (isOn) {
    		balance += sum;
    		System.out.println("Баланс поповнено на " + sum + " грн \n" + "Поточний баланс: " + balance + " грн \n");
    		fout.print("Баланс поповнено на " + sum + " грн \n" + "Поточний баланс: " + balance + " грн \n");
    		} else {
    			System.out.println("Телефон вимкнено, щоб змінити баланс ввімкніть його \n");
				fout.print("Телефон вимкнено, щоб змінити баланс ввімкніть його \n");
    		}
    }
 
    /**
     * Method for turning on a Bluetooth
     */
    public void bluetoothOn() {
    	System.out.println(" \n");
		fout.print(" \n");
    	if (isOn) {
    		bluetooth = true;
            System.out.println("Bluetooth увімкнено " + "\n");
            fout.print("Bluetooth увімкнено " + "\n");
    	} else {
    		System.out.println("Телефон вимкнено, щоб керувати Bluetooth ввімкніть його \n");
            fout.print("Телефон вимкнено, щоб керувати Bluetooth ввімкніть його \n");
    	}
    }
    
    /**
     * Method for turning off a Bluetooth
     */
    public void bluetoothOff() {
    	System.out.println(" \n");
		fout.print(" \n");
    	if (isOn) {
    		bluetooth = false;
    		connectedDevices = "";
        	System.out.println("Bluetooth вимкнено, усі під'єднані пристрої від'єднано \n");
            fout.print("Bluetooth вимкнено, усі під'єднані пристрої від'єднано \n");
    	} else {
    		System.out.println("Телефон вимкнено, щоб керувати Bluetooth ввімкніть його \n");
            fout.print("Телефон вимкнено, щоб керувати Bluetooth ввімкніть його \n");
    	}
    }
    
    /**
     * Method for connect the device
     * @param newDevice The device we want to connect
     */
    public void connectDevice(String newDevice) {
    	System.out.println(" \n");
		fout.print(" \n");
    	if (isOn) {
    		if (bluetooth) {
    			if (connectedDevices == "") {
    				connectedDevices = newDevice;
    			}
    			else {
    				connectedDevices += ", " + newDevice;
    			}
            	System.out.println("Під'єднано новий пристрій: " + newDevice + " \n" + "Під'єднані пристрої: " + connectedDevices + " \n");
                fout.print("Під'єднано новий пристрій: " + newDevice + " \n" + "Під'єднані пристрої: " + connectedDevices + " \n");		
    		}
    		else {
    			System.out.println("Bluetooth вимкнено, щоб під'єднати пристрій ввімкніть його \n");
    			fout.print("Bluetooth вимкнено, щоб під'єднати пристрій ввімкніть його \n");
    		}
    		
    	} else {
    		System.out.println("Телефон вимкнено, щоб керувати Bluetooth ввімкніть його \n");
            fout.print("Телефон вимкнено, щоб керувати Bluetooth ввімкніть його \n");
    	}
    }
    
    /**
     * Method for disconnect the device
     * @param disDevice The device we want to disconnect
     */
    public void disconnectDevice(String disDevice) {
    	System.out.println(" \n");
		fout.print(" \n");
    	if (isOn) {
    		if (bluetooth) {
    			if (connectedDevices.contains(", " + disDevice)) {
    				connectedDevices = connectedDevices.replace(", " + disDevice, "");
    				System.out.println("Від'єднано пристрій: " + disDevice + " \n" + "Під'єднані пристрої: " + connectedDevices + " \n");
                    fout.print("Від'єднано пристрій: " + disDevice + " \n" + "Під'єднані пристрої: " + connectedDevices + " \n");
    			}
                    else {
                    	if (connectedDevices.contains(disDevice)) {
                    		connectedDevices = connectedDevices.replace(disDevice, "");
            				System.out.println("Від'єднано пристрій: " + disDevice + " \n" + "Під'єднані пристрої: " + connectedDevices + " \n");
                            fout.print("Від'єднано пристрій: " + disDevice + " \n" + "Під'єднані пристрої: " + connectedDevices + " \n");
                    	}
                    	else {
                    		System.out.println("Пристрій: " + disDevice + " не було під'єднано \n" + "Під'єднані пристрої: " + connectedDevices + " \n");
                    		fout.print("Пристрій: " + disDevice + " не було під'єднано \n" + "Під'єднані пристрої: " + connectedDevices + " \n");
                    	}
                    }		
    		}
    		else {
    			System.out.println("Bluetooth вимкнено, а отже усі пристрої від'єднано \n");
    			fout.print("Bluetooth вимкнено, а отже усі пристрої від'єднано \n"); }
    	}
    	else {
    	System.out.println("Телефон вимкнено, щоб керувати Bluetooth ввімкніть його \n");
        fout.print("Телефон вимкнено, щоб керувати Bluetooth ввімкніть його \n"); } 	
    }
    
    /**
     * Method for displaying information about a phone
     */
    public void info() {
    	System.out.println(" \n");
		fout.print(" \n");
    	if (isOn) {
    		System.out.println("Назва пристрою: " + nameDevice + " \n");
    		fout.print("Назва пристрою: " + nameDevice + " \n");
    		System.out.println("Номер телефону: " + numberOfThisPhone + " \n");
    		fout.print("Номер телефону: " + numberOfThisPhone + " \n");
    		System.out.println("Заряд батареї: " + batteryLevel + " % \n");
    		fout.print("Заряд батареї: " + batteryLevel + " % \n");
    		System.out.println("Баланс: " + balance + " грн \n");
    		fout.print("Баланс: " + balance + " грн \n");
    		if (bluetooth) { 
    			System.out.println("Bluetooth: увімкнено\n");
    			fout.print("Bluetooth: увімкнено\n");
    		}
    		else {
    			System.out.println("Bluetooth: вимкнено\n");
    			fout.print("Bluetooth: вимкнено\n");
    		}
    		System.out.println("Під'єднані пристрої: " + connectedDevices + " \n");
    		fout.print("Під'єднані пристрої: " + connectedDevices + " \n");
    		System.out.println("Гучність: " + loudness + "/15 \n");
    		fout.print("Гучність: " + loudness + "/15 \n");
    	}
    	else {
    		System.out.println("Телефон вимкнено, щоб переглянути інформацію про нього - ввімкніть його \n");
            fout.print("Телефон вимкнено, щоб переглянути інформацію про нього - ввімкніть його \n");
    	}
    }
    
    /**
     * Method to change loudness
     * @param clicks Number of clicks
     * @param button more or less buttons
     */
    public void changeLoudness(int clicks, String button) {
    	System.out.println(" \n");
		fout.print(" \n");
    	if (isOn) {
    		if (button == "more") {
    			for (int i = 0; i < clicks; i++) {
    				loudness ++;
    				if (loudness > 15) { loudness = 15;} 
    			    System.out.println("Гучність - " + loudness + "\n");
    			    fout.print("Гучність - " + loudness + "\n");
    			}
    		}
    		else {
    			if(button == "less") {
    				for (int i = 0; i < clicks; i++) {
        				loudness --;
        				if (loudness < 0) { loudness = 0;} 
        			    System.out.println("Гучність - " + loudness + "\n");
        			    fout.print("Гучність - " + loudness + "\n");
    				}
    			}
    			else {
    				System.out.println("Такої кнопки немає \n");
    			    fout.print("Такої кнопки немає \\n");
    			}
    		}
    		
    	} else {
    		System.out.println("Телефон вимкнено, щоб змінювати гучність ввімкніть його \n");
            fout.print("Телефон вимкнено, щоб змінювати гучність ввімкніть його \n");
    	}
    }
    
    /**
    * Method releases used recourses
    */
    public void dispose()
    { fout.close(); }
    
    
}
