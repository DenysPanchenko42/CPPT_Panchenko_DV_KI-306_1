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
	private PrintWriter fout2;
	/**
	* Constructor
	* @throws FileNotFoundException is exception 
	*/
	public PhoneMusic() throws FileNotFoundException
    {
	NameList = "My list";
	MusicList = "";
	fout2 = new PrintWriter(new File("Music.txt"));
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
	fout2 = new PrintWriter(new File("Music.txt"));
	}
	
	/**
	 * Implementation of the interface method for playing music
	 * @param song The song they want to play
	 */
	@Override
    public void playMusic(String song) {
		System.out.println(" \n");
		fout2.print(" \n");
        if (super.isOn) {
        	if (MusicList.contains(song)) {
        		System.out.println("Відтворення пісні: " + song + " \n");
        		fout2.print("Відтворення пісні: " + song + " \n");
        	}
        	else {
        		System.out.println("Пісні під назвою: " + song + " не знайдено \n");
        		fout2.print("Пісні під назвою: " + song + " не знайдено \n");
        	}
        } else {
            System.out.println("Телефон вимкнено, щоб відтворити музику ввімкніть його \n");
            fout2.print("Телефон вимкнено, щоб відтворити музику ввімкніть його \n");
        }
    }
	
	/**
     * Method for downloading music
     * @param song The song they want to downloading
     */
	public void downloading(String song) {
		System.out.println(" \n");
		fout2.print(" \n");
		if (super.isOn) {
			if(MusicList == "") {
				MusicList += song;
			}
			else {
				MusicList += ", " + song;
			}
			System.out.println("Пісню " + song + " завантажено \n");
            fout2.print("Пісню " + song + " завантажено \n");
			
		} else {
            System.out.println("Телефон вимкнено, щоб завантажити музику ввімкніть його \n");
            fout2.print("Телефон вимкнено, щоб завантажити музику ввімкніть його \n");
        }
	}
	
	
	/**
     * Method for list display
     */
	public void listDisplay() {
		System.out.println(" \n");
		fout2.print(" \n");
		if (super.isOn) {
			System.out.println("Плейлист " + NameList + " : \n");
            fout2.print("Плейлист " + NameList + " : \n");
			System.out.println(MusicList + " \n");
            fout2.print(MusicList + " \n");
			
		} else {
            System.out.println("Телефон вимкнено, щоб подивитись список пісень ввімкніть його \n");
            fout2.print("Телефон вимкнено, щоб подивитись список пісень ввімкніть його \n");
        }
	}
	
	
	 /**
	 * Method releases used recourses
	 */
	 public void dispose2()
	 { fout2.close(); }
	
	
	
	
	
}
