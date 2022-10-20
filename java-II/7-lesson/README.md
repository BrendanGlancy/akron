# Java Collections

In C++ Collections are know as templates

## Java Collections Hierarchy
![java-collection-hierarchy](https://user-images.githubusercontent.com/61941978/195114400-945500da-83f4-4bb3-9297-c208060e9528.png)

### Types of Colletions in Java:
- List
  - LinkedList
      - Deque
          - ArrayDeque
  - Vector
  - Stack
- Queue
    - PriorityQueue
- Set
  - HashSet
  - LinkedHashSet

Stack - Last In First out LIFO
Queue - First in First Out FIFO

The three types of collection we will talk about in JavaII


| Set    | List    | Map    |
|---------------- | --------------- | --------------- |
| HashSet    | ArrayList    | HashMap    |
| LinkedHashSet    | LinkedList    | LinkedHashMap    |
| TreeSet    | Vector    | HashTable, and Tree Map    |


## Mechanism of using an iterator
![java-iterator](https://user-images.githubusercontent.com/61941978/195114467-039c1a68-a2da-4191-96e2-26fb15f78aed.png)



## Map interface

We now take a look at the Map interface, one which oddly enough has no relation to the Collection interface. A Collection operates on one entity, while a Map operates on two: a unique key, e.g. a vehicle identification number, and an object related to the key, e.g. a car. To retrieve an object from a Map, you would normally use its key. Map is the root of quite a number of interfaces and classes, as depicted in Figure 2.

Hashtable, Hashmap, and LinkedHashMap
The Hashtable class was the first Collection in Java 1 that was based on the hash-table data structure. Unfortunately, like Vector, the class is deprecated because of its suboptimal performance. We can forget about it and use the other Map implementations instead. HashMap is the default implementation that you will find yourself using in most cases.

A Map usually doesn’t make any guarantee as to how it internally stores elements. An exception to this rule, however, is LinkedHashMap, which allows us to iterate the map in the order of insertion.

![map-interface-1](https://user-images.githubusercontent.com/61941978/196856560-8bdec379-34a3-4eb8-82ab-966e776bc351.png)

## SortedMap


