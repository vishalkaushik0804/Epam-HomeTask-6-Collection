package com.vishalkaushik.epamtask6.CustomCollectionList;

/**
 * Task6 of EPAM-PEP 2020
 * Implementation of Custom Collections List
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CustomList<String> list = new CustomList<>();
        //Adding 10 elements as mentioned in the task
        list.add("Hello");
        list.add("World!");
        list.add("Elysian");
        list.add("Pivot");
        list.add("Prototype");
        list.add("GDD");
        list.add("ConceptArt");
        list.print();
        list.remove(2);
        list.print();
        
    }
}
