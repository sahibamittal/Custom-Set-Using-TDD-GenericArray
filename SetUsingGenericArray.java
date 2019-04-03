// Author : Sahiba_Mittal

package src;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public class SetUsingGenericArray<E> implements Set<E>{

	private Object[] mySet = {}; // array of generic type to implement the concept of Set

	@Override
	public boolean add(E arg0) {
		
		if(this.contains(arg0))
			return true;
		Object[] temp = Arrays.copyOf(mySet, mySet.length+1);
		temp[mySet.length] = arg0;
		mySet = temp;
		return true;
	}

	@Override
	public boolean addAll(Collection<? extends E> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		
		mySet = Arrays.copyOf(mySet, 0);
	}

	@Override
	public boolean contains(Object arg0) {
		
		for(Object o : mySet) {
			
			if(o.equals(arg0))
				return true;
		}
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		
		return (mySet.length == 0);
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return (Iterator<E>) Arrays.asList(mySet).iterator();
	}

	@Override
	public boolean remove(Object arg0) {
		
		if(this.contains(arg0)) {
			
			int i;
			for(i=0; i<this.size(); i++){
				if(mySet[i].equals(arg0)){
					break;
				}
			}
			if(i<this.size()){
				for(int j=i; j<this.size()-1; j++){
					mySet[j] = mySet[j+1];
				}
				mySet = Arrays.copyOf(mySet, mySet.length-1);
			}
			return true;
		}
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
	
		return mySet.length;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Object get(int index) {
		
		return mySet[index];
	}

	public void reverse() {
		
		Arrays.sort(mySet, Collections.reverseOrder());
	}
	
}
