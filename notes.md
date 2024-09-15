Java Development Kit consits of - JRE + Development Tools and JRE consists of JVM + Library Classes and JVM consists of Interpreter + JIT Compiler + Garbage Collector

JDK = JRE + Development Tools
JRE = JVM + Library Classes
JVM = Interpreter + JIT Compiler + Garbage Collector

# difference between while and do while ?
while loop checks the condition before entering the loop, do while loop checks the condition after executing the statements inside the loop. So, do while loop will execute the statements inside the loop atleast once even if the condition is false.

# What is the difference between == and equals() method in Java?
== is used to compare the reference of the objects, whereas equals() method is used to compare the content of the objects.

# switch case in Java

switch(expression) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // code
}

# enchanced switch case in Java 12

switch(expression) {
    case value1 -> System.out.println("Value 1");
    case value2 -> System.out.println("Value 2");
    default -> System.out.println("Default");
}

# nested switch case in Java

switch(expression1) {
    case value1:
        switch(expression2) {
            case value2:
                // code
                break;
            case value3:
                // code
                break;
        }
        break;
    case value4:
        // code
        break;
}

# null in java is a reference type, it means it is a reference to a memory location. It is used to indicate that the object is not pointing to any memory location.
String str = null; // null is a reference to a memory location
int a = null; // null can not be assigned to primitive data types


# primitives - In Java, primitive data types are the predefined data types that can not be broken down further like int, char, float, double, boolean, etc. and String is not a primitive data type, because it can be broken down further into characters just like arrays. But in Javascript String is a primitive data type. Primitives are stored in stack memory.


# Arrays in Java
int[] arr = new int[5]; // Declaration and Initialization
# 5 in new int[5] is the size of the array not index, so the index will be from 0 to 4

# In cpp arrays are in continous memory location, but in Java it'll totaly depend on the JVM, it may or may not be in continous memory location. Array objects are in heap and heap objects are not in continous memory location, but stack objects are in continous memory location.


# toString() method in Java - eg - System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5] - It is used to print the content of the array.

# ArrayList - ArrayList is a part of Collection Framework and it is present in java.util package. It provides us dynamic arrays in Java. It can be used to store the elements of different data types. It can be used to store the duplicate elements. It maintains the insertion order and is non-synchronized. It allows random access because array works at the index basis. It is better than the array because it can grow and shrink dynamically.

arrayList.add(1); // add element to the arrayList