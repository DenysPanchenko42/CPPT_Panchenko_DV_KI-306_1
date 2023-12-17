/**
 * lab 3 package
 */
package KI_306.Panchenko.Lab3;
import java.io.*;

/**
 * interface for playing music
 */ 
interface MusicPlayer {
    void playMusic(String song);
}

/**
 * Class <code>PhoneMusic</code> A subclass that implements an interface
 */
public class PhoneMusic extends Phone implements MusicPlayer{
	
	private String NameList;
	private String MusicList;
	
	/**
	* Constructor
	* @throws FileNotFoundException is exception 
	*/
	public PhoneMusic() throws FileNotFoundException
    {
	NameList = "My list";
	MusicList = "";
	
    }

	/**
	* Constructor
	* @param NameList The name of music list
	* @throws FileNotFoundException is exception 
	*/
	public PhoneMusic(String NameList) throws FileNotFoundException
	{
	this.NameList = NameList;
	MusicList = "";
	
	}
	
	/**
	 * Implementation of the interface method for playing music
	 * @param song The song they want to play
	 */
	@Override
    public void playMusic(String song) {
		System.out.println(" \n");
		fout.print(" \n");
        if (super.isOn) {
        	if (MusicList.contains(song)) {
        		System.out.println("Відтворення пісні: " + song + " \n");
        		fout.print("Відтворення пісні: " + song + " \n");
        	}
        	else {
        		System.out.println("Пісні під назвою: " + song + " не знайдено \n");
        		fout.print("Пісні під назвою: " + song + " не знайдено \n");
        	}
        } else {
            System.out.println("Телефон вимкнено, щоб відтворити музику ввімкніть його \n");
            fout.print("Телефон вимкнено, щоб відтворити музику ввімкніть його \n");
        }
    }
	
	/**
     * Method for downloading music
     * @param song The song they want to downloading
     */
	public void downloading(String song) {
		System.out.println(" \n");
		fout.print(" \n");
		if (super.isOn) {
			if(MusicList == "") {
				MusicList += song;
			}
			else {
				MusicList += ", " + song;
			}
			System.out.println("Пісню " + song + " завантажено \n");
            fout.print("Пісню " + song + " завантажено \n");
			
		} else {
            System.out.println("Телефон вимкнено, щоб завантажити музику ввімкніть його \n");
            fout.print("Телефон вимкнено, щоб завантажити музику ввімкніть його \n");
        }
	}
	
	/**
     * Method for list display
     */
	public void listDisplay() {
		System.out.println(" \n");
		fout.print(" \n");
		if (super.isOn) {
			System.out.println("Плейлист " + NameList + " : \n");
            fout.print("Плейлист " + NameList + " : \n");
			System.out.println(MusicList + " \n");
            fout.print(MusicList + " \n");
			
		} else {
            System.out.println("Телефон вимкнено, щоб подивитись список пісень ввімкніть його \n");
            fout.print("Телефон вимкнено, щоб подивитись список пісень ввімкніть його \n");
        }
	}

}
