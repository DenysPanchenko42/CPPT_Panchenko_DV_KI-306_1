/**
 * lab 3 package
 */
package KI_306.Panchenko.Lab3;

import java.io.FileNotFoundException;

/**
 * Phone Music Application class implements main method for PhoneMusic class abilities demonstration
 */
public class PhoneMusicApp {

	/**
	 * @param args is arguments
	 * @throws FileNotFoundException is exception
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		PhoneMusic myPhoneMusic = new PhoneMusic("Playlist");	
	
		myPhoneMusic.listDisplay();
		
		myPhoneMusic.dispose2();
	
	}

}
