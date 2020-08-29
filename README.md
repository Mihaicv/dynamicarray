# Project Rewrite - Dynamic array

## Story

> This kind of exercise is a classic: your task is to reimplement some basic
> built-in features of a language or its standard library for pedagogical
> reasons without using the feature itself or similar features.
> Caveat: don’t use such code in your commercial projects!

In computer science, a _dynamic array_, **growable array, resizable array, dynamic table, mutable array, or array list** is a random access, variable-size list data structure that allows elements to be added or removed. It is supplied with standard libraries in many modern mainstream programming languages. Dynamic arrays overcome a limit of static arrays, which have a fixed capacity that needs to be specified at allocation.

A dynamic array is not the same thing as a dynamically allocated array, which is an array whose size is fixed when the array is allocated, although a dynamic array may use such a fixed-size array as a back end.

On the average, a well-implemented and properly used dynamic array has the following time complexity characteristics:

- _get_ a value by index: `O(1)`
- _insert/delete_ value at the end: `O(1)`
- _insert/delete_ value in the middle: `O(n)`

Many programming languages have dynamic array as a data type and this is the reason to get familiar with it.
For example Java's _ArrayList<>_, python's _list_ or _List<>_ in C# are both dynamic arrays.

Now it's your turn to implement a Dynamic array. Let's start!

## What are you going to learn?

- you will get familiar with a fundamental data structure named `Dynamic array`
- get experience in managing arrays efficiently
- how to run unit test suite in your IDE

## Tasks

1. How many elements can be added to the collection in all?
Implement the necessary method and constructors to define it.
    - The `DynamicArray` can be created by defining its starting capacity like follows: `DynamicArray myArray = new DynamicArray(15)`
    - The `DynamicArray` can be created without any parameter when the capacity is set to 4 as a default value
    - There is a `getCapacity()` method which returns the actual capacity of the array

2. Implement the `size()` method: returns the amount of elements inserted.
    - Method `size()` returns zero in case of empty array.
    - Method `size()` returns with the amount of inserted/added element in case of non-empty array.
e.g. the size of this array [0, 1, 2, 42, 3, 4] is 6

3. What's the point of a collection if I can't add any value to it. Implement `add(int)` method: place new element at the end of the array.
    - The implemention only using `int[]` as inner storage
    - Method `add()` inserts new value at the end of the array
    - Method `add()` double the capacity and insert the new value after the last element in case the array capacity is full

4. Implement the `get(int)` method: return the value based on its index. If the given index is bigger than the size of your array signal it with an appropriate exception.
    - Method `get()` returns the value for an existing element in the array
    - Method `get()` throws `ArrayIndexOutOfBoundEception` for an non-existing index.

5. Implement the `insert()` method: Inserts a value at an index into the array shifting elements if necessary.
    - Method `insert()` places value as a last element if the index equals to the size of the list
e.g. the result of inserting 42 at index 5 into an array
`[0, 1, 2, 3, 4]` is 
`[0, 1, 2, 3, 4, 42]`
    - Method `insert()` places value at given index and shift all other elements back
e.g. the result of inserting 42 at index 3 into an array
`[0, 1, 2, 3, 4]` is
`[0, 1, 2, 42, 3, 4]`
    - In case of negative index the method throws `ArrayIndexOutOfBoundException`
    - In case of the given index is bigger than size of the array, the new value inserted as a last item
e.g. the result of inserting 42 at index 50 into an array
`[0, 1, 2, 3, 4]` is 
`[0, 1, 2, 3, 4, 42]`

6. Implement the `remove()` method: removes a value from the array at a given index
    - Method `remove(int)` removes the element at the given index
    - In case of negative index the method throws `ArrayIndexOutOfBoundException`
    - In case of the given index is bigger than size of the array, the method throws `ArrayIndexOutOfBoundException`

7. Override the `toString()` method: returns the string representation of the array content
    - In case of empty array `toString()` returns with "[]"
    - In case of non-empty array the `toString()` method returns with the inserted elements in the following form: "[1, 5, 10, 654]"

## General requirements

- All test result is green.
- All code is pushed to GitHub repository by atomic commits.
The implemention related commits managed on separated feature branch
and merged by a pull request to the `master` branch.

## Hints

- The project contains tests as well which can help you validate and verify your implementation.
    You can run tests in your IDE easily as follows:

    ![Run tests in your IDE](https://learn.code.cool/media/java/run-tests.gif)

    > You don't need to modify the test files. Later this topic will be covered in detail. Currently it is enough to run them and check your work.
- We suggest to follow the order of unit tests when your are implementing. The tests are guiding the full implementation gradually step by step.
- There is a really useful class for joining strings which was brought by Java 8. You won't find out the name of it: [StringJoiner](https://www.baeldung.com/java-string-joiner)

## Starting your project

To start your project click [this link](https://journey.code.cool/v2/project/solo/blueprint/rewrite-dynamic-array/java).

## Background materials

- <i class="far fa-exclamation"></i> [Dynamic array](https://en.wikipedia.org/wiki/Dynamic_array)
- <i class="far fa-exclamation"></i> <i class="far fa-video"></i> [Static VS Dynamic arrays](https://www.youtube.com/watch?v=qTb1sZX74K0)
- <i class="far fa-exclamation"></i> [Arrays](https://learn.code.cool/full-stack/#/../pages/java/arrays)
