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
		T[] nameArray=(T[]) new Object[name.length+1];
		for(int i=0; i<nameArray.length-1; i++) {
			nameArray[i]=name[i];
		}
	    nameArray[nameArray.length-1]=val;
		name=nameArray;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] nameArray=(T[]) new Object[name.length+1];
		for(int i=0; i<nameArray.length; i++) {
			if(i<loc) {
			nameArray[i]=name[i];
			}
			else if(i==loc) {
				nameArray[loc]=val;
			}
			else if(i>loc) {
				nameArray[i]=name[i-1];
			}
		}
		name=nameArray;
	}
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		name[loc]=val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] nameArray=(T[]) new Object[name.length-1];
		for(int i=0; i<nameArray.length; i++) {
			if(i>=loc) {
			nameArray[i]=name[i+1];
			}
			else {
			nameArray[i]=name[i];
			}
		}
		name=nameArray;
	}
	
	public boolean contains(T val) {
		for(int i=0; i<name.length; i++) {
			if(name[i]==val) {
				return true;
			}
		}
		return false;
	}
	public int size() {
		return name.length;
	}
}