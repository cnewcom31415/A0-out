/**
 * Interface to describe the behavior of a List
 * Author: Claire Newcom cnewcom@smith.edu
 * 
 * assume there is a constructor that creates an empty list (just a simple instance of the ListADT class)
 * [not sure how this would work but also maybe have a constructor that can take in a collection
 *      and populate a list from that collection]
 * 
 * General assumptions about lists:
 * -Items in the List don't randomly appear or disappear
 * -Items in the List don't randomly move around (there is an order and it matters)
 * -Information about each of the elements can be accessed
 */
public interface ListADT<T> {


    /**
     * Adds a new item to the end of the list.
     * @param newItem The new item of type T to be added to the end of the list
     */
    public void add(T newItem);


    /**
     * Adds a new item to the list at the specified index. Index of list starts
     * at 0. Pushes items on and after that index up one index. For example, 
     * take the list 0,1,2. If we wanted to add an item called 3 to the list at index 
     * 1, the new list would be 0,3,1,2.
     * Throws a runtime exception if the given index does not exist.
     * @param newItem the new item of type T to be added to the list
     * @param index the index the item will be inserted at.
     */
    public void add(T newItem, int index);


    /**
     * Removes the first instance of the item from the list. If the item does not exist in the list, throws
     * a runtime exception.
     * @param item the item to be removed
     * @return the item that was removed from the list
     */
    public T remove(T item);

    
    /**
     * Removes the item at the specified index from the list.
     * If there is no item at the specified index, throw a runtime error.
     * @param index the index of the item to remove
     * @return the item that was removed from the list.
     */
    public T remove(int index);

    
    /**
     * Removes the first item from the list, shifts all other items down.
     * Throws a runtime exception if the list is empty.
     * @return the item that was removed from the list.
     */
    public T removeFirst();


    /**
     * Removes the last item from the list.
     * Throws a runtime exception if the list is empty.
     * @return the item that was removed from the list.
     */
    public T removeLast();



    /**
     * Returns the total number of elements in this list
     * @return the total number of elements in this list
     */
    public int size();


    /**
     * Gets the item at the specified index.
     * If the specified index does not exist, throw a runtime error.
     * @param index the index of the desired item
     * @return the item at the given index
     */
    public T get(int index);

    /**
     * Gets the index of the specified item.
     * Throws a runtime exception if that item is not an element of the list.
     * @param item the desired item
     * @return the index of the desired item
     */
    public int getIndex(T item);


    /**
     * Gets the sublist of items between the specified indices. The start index is inclusive,
     * the end index is exclusive. NOTE: Sublist does not modify the original list.
     * Throws a runtime exception if the start index is greater than the end index.
     * Throws a runtime exception if either index does not exist.
     * @param startIndex the index of the first element desired for the sublist (inclusive)
     * @param endIndex the index of the last element desired for the sublist (exclusive)
     * @return a list of elements from this list between the given indices.
     */
    public ListADT<T> getSublist(int startIndex, int endIndex);


    /**
     * Gets the sublist of items from the start index to the end of the list.
     * The start index is inclusive. NOTE: Sublist does not modify the original list.
     * Throws a runtime exception if the start index does not exist
     * @param startIndex the index of the first element desired for the sublist (inclusive)
     * @return a sublist of elements from this list from the given index to the end of the list
     */
    public ListADT<T> getSublist(int startIndex);


    /**
     * Sets the value at this index to the new value.
     * Throws a runtime exception if the index does not exist. 
     * (this means set will not work on an empty list, nor will it be able to add to the end of a list)
     * @param index the index of the value to be set
     * @param newValue the new value to be set at the specified index
     */
    public void set(int index, T newValue);


    /**
     * Checks whether or not this list is empty
     * @return true if this list is empty, false if there are elements in this list.
     */
    public boolean isEmpty();


    /**
     * Concatanates otherList to the end of this list. Does not account for repeated values.
     * @param otherList the other list that will be concatenated onto the end of this list.
     * @return the combined list.
     */
    public ListADT<T> listConcat(ListADT<T> otherList);
   
   


}