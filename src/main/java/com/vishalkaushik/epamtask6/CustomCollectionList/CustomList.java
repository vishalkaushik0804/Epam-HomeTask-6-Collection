package com.vishalkaushik.epamtask6.CustomCollectionList;

import java.util.*;

public class CustomList<T> {
	private int Size=0;
	private int Capacity=10;
	private Object list[];
	public CustomList()
	{
		list = new Object[Capacity];
	}
	public void print()
	{
		System.out.print("[");
		for(int i=0;i<Size;i++)
		{
			System.out.print(list[i]);
			if(i!=Size-1)
				System.out.print(", ");
		}
		System.out.println("]");
	}
	public void add(T element)
	{
		if(Size==Capacity)
			listDoubling();
		list[Size++]=element;
	}
	private void listDoubling() {
		Capacity*=2;
		list = Arrays.copyOf(list, Capacity);
		
	}
	@SuppressWarnings("unchecked")
	public T fetch(int index)
	{
		if(index<0 || index>=Size)
			throw new IndexOutOfBoundsException("List Index Out of Range");
		return (T)list[index];
	}
	public void remove(int index)
	{
		if(index<0 || index>=Size)
			throw new IndexOutOfBoundsException("List Index of Bounds");
		if(index==Size-1)
			list[index] = null;
		else {
			for(int i=index;i<Size-1;i++) {
				list[i] = list[i+1];
			}
			list[Size-1] = null;
		}
		Size--;
	}
	public int getSize()
	{
		return Size;
	}
	public void setSize(int size) {
		this.Size = size;
	}
	public int getCapacity() {
		return Capacity;
	}
	public void setCapacity(int capacity) {
		this.Capacity = capacity;
	}
	public Object[] getList() {
		return list;
	}
	public void setList(Object[] list) {
		this.list = list;
	}
	
	
	
	
}
