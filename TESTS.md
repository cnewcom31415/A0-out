# A0 Tests

Use the table below to describe your test cases. Each row should describe one test.

| Test name | Setup (steps) | Operation | Expected result | Exception? |
| --- | --- | --- | --- | --- |
| Example: get on empty list | Create empty list | get(0) | n/a | IndexOutOfBoundsException |


TESTING add()

| testAddToEmptyList() | Create empty list, create piece of data | add(data) | the list now has data as the element at index 0. the list has a length of one | n/a |

| testAddToListWithData() | Create empty list, create two pieces of data, add one piece of data (data1) to the list | add(data2) | the list now has data2 as the element at index 1, and data1 as the element at index 0 (data1,data2). the length of the list is two | n/a |

| addElementAtIndexToEmptyList() | Create empty list, create piece of data | add(data,0) | n/a | IndexOutOfBoundsException |

| addElementAtIndexToEmptyList2() | Create empty list, create piece of data | add(data,1) | n/a | IndexOutOfBoundsException |

| addElementAtIndexToListWithData() | create two pieces of data, add one piece of data (data1) to the list | add(data2,0) | The list now looks as follows (data2,data1) | n/a |

| addElementAtIndexToListWithDataException() | create two pieces of data, add one piece of data (data1) to the list | add(data2,1) | n/a | IndexOutOfBoundsException |


TESTING remove()

| testRemoveItemFromEmptyList() | create empty list, create piece of data | remove(data) | n/a | ValueDoesNotExistException or maybe MissingElementException (basically an exception that says that the value is not a part of this list) |


| testRemoveItemFromEmptyList2() | create empty list | remove(0) | n/a | IndexOutOfBoundsException |

| testRemoveFromList() | create empty list, create piece of data, add data to list | remove(data) | list is empty, and the method returns the piece of data | n/a |

| testRemoveFromList2() | create empty list, create piece of data, add data to list | remove(0) | list is empty, and the method returns the piece of data at 0 | n/a |

| testRemoveFromListDataDNE() | create empty list, create two pieces of data, add one piece of data to list (data1) | remove(data2) | n/a | ValueDoesNotExistException or maybe MissingElementException (basically an exception that says that the value is not a part of this list) |

| testRemoveFromListWrongIndex() | create empty list, create piece of data, add data to list | remove(1) | n/a | IndexOutOfBoundsException |


TESTING removeFirst()

| testRemoveFirstFromEmptyList() | create empty list | removeFirst() | n/a | IndexOutOfBoundsException |

| testRemoveFirstFromList() | create empty list, create piece of data, add data to list | removeFirst() | the list is now empty, the piece of data is returned by the method | no |

| testRemoveFirstFromLongerList() | create empty list, create two pieces of data, add both pieces of data to list such that we have (data1,data2) | removeFirst() | at index 0 we now have data2, data1 was returned by the method | n/a |


TESTING removeLast()

| testRemoveLastFromEmptyList() | create empty list | removeLast() | n/a | IndexOutOfBoundsException |

| testRemoveLastFromList() | create empty list, create a piece of data, add data to empty list  | removeLast() | the list is now empty, the peice of data is returned by the methid | n/a |

| testRemoveLastFromLongerList() | create empty list, create two pieces of data, add both pieces of data to list such that we have (data1,data2) | removeLast() | our list is now (data1), and data2 was returned by the method | n/a |



TESTING size()

| testSizeOnEmptyList | create empty list | size() | will return 0 | n/a |

| testSizeOnBiggerList | create empty list, create two pieces of data, add both pieces of data to list | size() | will return 2 | n/a |


TESTING get()

| testGetOnEmptyList() | create empty list | get(0) | n/a | IndexOutOfBoundsException |

| testGetSuccessOnNonEmptyList() | create empty list, create data1 and data2, add data1 and data2 to list | get(0) | will return data1 | n/a |

| testGetFailureOnNonEmptyList() | create empty list, create data1 and data2, add data1 and data2 to list | get(2) | n/a | IndexOutOfBoundsException |


TESTING getIndex()

| testGetIndexOnEmptyList() | create empty list, create piece of data | getIndex(data1) | n/a | ValueDoesNotExistException or maybe MissingElementException (basically an exception that says that the value is not a part of this list) |

| testGetIndexSuccessOnList() | create empty list, create data1 and data2, add data1 and data2 to list | getIndex(data1) | 0 | n/a |

| testGetIndexFailureOnList() | create empty list, create data1 and data2, add data1 to list | getIndex(data2) | n/a | ValueDoesNotExistException or maybe MissingElementException (basically an exception that says that the value is not a part of this list) |



TESTING getSublist()

| testGetSublistOnEmptyList() | create empty list | getSublist(0,1) | n/a | IndexOutOfBoundsException |

| testGetSublistOnSizeOneList() | create empty list, create data1, add data to list | getSublist(0,1) | will return another list with data1 in list. Will NOT modify the empty list | n/a |

| testGetSublistOnBiggerList() | create empty list, create data1 and data2 and data3, add all pieces of data to list | getSublist(1,3) | will return another list with (data2,data3) in that list in that order. Will NOT modify the empty list. Will not throw an IndexOutOfBoundsException because the 3 is exclusive. | n/a |

| testGetSublistOnBiggerListWithException() | create empty list, create data1 and data2 and data3, add all pieces of data to list | getSublist(1,4) | n/a | IndexOutOfBoundsException (for the 4) |

| testGetSublistOnBiggerListOutOfOrder() | create empty list, create data1 and data2 and data3, add all pieces of data to list | getSublist(2,0) | n/a | throws some kind of exception because while 2 is in bounds, 2>0, which is not possible. Example exception could be ImpossibleOrderException |



| testGetSublistOnEmptyList2() | create empty list | getSublist(0) | n/a | IndexOutOfBoundsException |

| testGetSublistOnSizeOneList2() | create empty list, create data1, add data to list | getSublist(0) | will return another list with data1 in lit. Will NOT modify the empty list | n/a |

| testGetSublistOnBiggerList2() | create empty list, create data1 and data2 and data3, add all pieces of data to list | getSublist(1) | will return another list with (data2,data3) in that list in that order. Will NOT modify the empty list. | n/a |

| testGetSublistOnBiggerListWithException2() | create empty list, create data1 and data2 and data3, add all pieces of data to list | getSublist(3) | n/a | IndexOutOfBoundsException (for the 3) |



TESTING set()

| testSetOnEmptyList() | create empty list, create data1 | set(0,data1) | n/a | IndexOutOfBoundsException |

| testSetOnList() | create empty list, create data1 and data2 and data3. Add data1 and data2 to list to read (data1,data2) | set(0,data3) | the list now looks like this (data3,data2) | n/a |

| testSetOnListException() | create empty list, create data1 and data2 and data3. Add data1 and data2 to list to read (data1,data2) | set(2,data3) | n/a | IndexOutOfBoundsException |



TESTING isEmpty()

| testIsEmptyTrue() | create empty list | isEmpty() | true | n/a |

| testIsEmptyFalse() | create empty list, create data1, add data1 to list | isEmpty() | false | n/a |



TESTING listConcat()

| testListConcat() | create two empty lists (list1 and list2), create data1-data4, add data1 and data2 to one list, and data3 and data4 to another list | list1.listConcat(list2) | we now have a list that looks like (data1,data2,data3,data4) | n/a |

| testListConcatRepitition() | create two empty lists (list1 and list2), create data1-data4, add data1 and data2 to one list, and data3, data3, and data4 to another list | list1.listConcat(list2) | we now have a list that looks like (data1,data2,data2,data3,data4) | n/a |














