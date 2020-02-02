package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[] name;
	public ArrayList() {
		name=(T[]) new Object[0];
				}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		return name[loc];
	}
	
	public void add(T val) {
		int[] nameArray=new int[name.length+1];
	    nameArray[nameArray.length-1]=val;
		name=nameArray[];
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		
	}
	
	public boolean contains(T val) {
		
		return false;
	}
}