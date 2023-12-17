package KI_306.Panchenko.Lab6;

import java.util.*;
import java.io.*;


/**
* Class <code>DictionaryDriver</code> Driver class for class Dictionary
* @author Panchenko
*/

public class DictionaryDriver {

	/**
	 * @param args is arguments
	 */
	
	public static void main(String[] args) 
	{
	Dictionary <? super Data> dictionary = new Dictionary <Data>();
	
	dictionary.AddData(new Term("Термін-1"));
	dictionary.AddData(new Definition("Визначення-1" ));
	dictionary.AddData(new Term("Термін-21" ));
	dictionary.AddData(new Definition("Визначення-21" ));
	
	Data res = dictionary.findMax();
	System.out.print("Найдовший текст: \n");
	res.print();
	
	dictionary.getArrSize();
	
	dictionary.DeleteData(2);
	
	dictionary.printDataAtIndex(1);
	
	dictionary.PrintAllData();
	
	dictionary.clearDictionary();
	
	dictionary.PrintAllData();

	}

	
}

/**
* Class <code>Dictionary</code> Parameterized class
* @author Panchenko
*/

class Dictionary <T extends Data>
{
	private ArrayList<T> arr;
	public Dictionary()
	{
		arr = new ArrayList<T>();
	}
	
	public T findMax()
	{
		if (!arr.isEmpty())
		{
			T max = arr.get(0);
			for (int i=1; i< arr.size(); i++)
			{
				if ( arr.get(i).compareTo(max) > 0 )
					max = arr.get(i);
			}
			return max;
		}
		return null;
	}
	
	public void AddData(T data)
	{
		arr.add(data);
		System.out.print("Додано елемент: ");
		data.print();
	}
	
	public void DeleteData(int i)
	{
		arr.remove(i);
	}
	
	
	public void getArrSize()
	{
		System.out.print("Кількість елементів: " + arr.size() + ";\n\n");	
	}
	
	public void printDataAtIndex(int i) {
	    if (i >= 0 && i < arr.size()) {
	        T data = arr.get(i);
	        System.out.println("Елемент за індексом " + i + ": ");
	        data.print();
	    } else {
	        System.out.println("Елементу за цим індексом не знайдено;\n\n");
	    }
	}
	
	public void clearDictionary() {
	    arr.clear();
	    System.out.println("Словник очищено;\n");
	}
	
	public void PrintAllData() {
		if (arr.isEmpty()) {
	        System.out.println("Словник порожній;\n\n");
	    } 
		else {
			System.out.println("Всі дані словника:\n--------------------------------------------");
			for (T item : arr) {
				item.print();
			}
			System.out.println("--------------------------------------------\n");
	    }
	}
	
	
}

interface Data extends Comparable<Data>
{
	public int getSize();
	public void print();
}

class Term  implements Data
{
	private String word;
	private int size;

	public Term (String w)
	{
		word = w;
		size = w.length();
	}
	
	public String getTerm()
	{
		return word;
	}
	public void setTerm(String w)
	{
		word = w;
	}

	public int getSize()
	{
	return size;
	}
	
	public int compareTo(Data w)
	{
	Integer s = size;
	return s.compareTo(w.getSize());
	}
	
	
	public void print()
	{
		System.out.print("Термін: " + word + ", розмір: " + size + ";\n\n");
	}
	
	
}

class Definition implements Data
{
	private String description;
	private int size;
	
	public Definition(String d) 
	{
		description = d;
		size = d.length();;
	}
	
	public String getDefinition()
	{
		return description;
	}
	public void setDefinition(String d)
	{
		description = d;
	}
	
	public int getSize()
	{
	return size;
	}
	
	public int compareTo(Data d)
	{
	Integer s = size;
	return s.compareTo(d.getSize());
	}
	
	public void print()
	{
		System.out.print("Визначення: " + description + ", розмір: " + size  + ";\n\n");
	}
	
}

