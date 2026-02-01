# A0 Tests

Use the table below to describe your test cases. Each row should describe one test.

| Test name | Setup (steps) | Operation | Expected result | Exception? |
| --- | --- | --- | --- | --- |
| Example: get on empty list | Create empty list | get(0) | n/a | IndexOutOfBoundsException |


TESTING add()

| testAddToEmptyList() | Create empty list, create piece of data | add(data) | the list now has data as the element at index 0. the list has a length of one | n/a |

| testAddToListWithData() | Create empty list, create two pieces of data, add one piece of data (data1) to the list | add(data2) | the list now has data2 as the element at index 1, and data1 as the element at index 0. the length of the list is two | n/a |

| addElementAtIndexToEmptyList() | Create empty list, create piece of data | add(data,0) | n/a | IndexOutOfBoundsExcption |

| addElementAtIndexToEmptyList2() | Create empty list, create piece of data | add(data,1) | n/a | IndexOutOfBoundsExcption |

| addElementAtIndexToListWithData() | create two pieces of data, add one piece of data (data1) to the list | add(data2,0) | The list now looks as follows (data2,data1) | n/a |

| addElementAtIndexToListWithDataException() | create two pieces of data, add one piece of data (data1) to the list | add(data2,1) | n/a | IndexOutOfBoundsExcption |


TESTING remove()