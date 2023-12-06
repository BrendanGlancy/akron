
1. Which C++ storage approaches are based on contiguous memory and which are not?  Not to include buffer overflows, what are the strengths and weaknesses of the dis-contiguous way?

When think about contiguous and non-contiguous memory in programming: some data structures come to mind. The Stack, arrays, and linked lists, there are advantages and disadvantages to using any of these, but in the end they are simply tools and which one you should use is very dependant on the case. 

Stack: The call stack in any program is inherently contiguous, it grows and shrinks in contiguous blocks as functions are called and returned. 

    Strengths: Very fast allocation and deallocation, as well as the user / programmer not having to manually manage the memory. 

    Weaknesses: Limited size, as well as being unsuitable for large or dynamic memory needs

Pure arrays in cpp (not to be confused with std vector) are also contiguous, in my opinion there advantage lies in the fact that they are easy to use (the simplist data structure). But they are weak if you have to use them dynamically as it is most likely you will have to do some kind of memcpy which is an expensive operation in terms of performance.  

Linked List: 
    
    Strengths: Unlike arrays these are very easy to grow and shrink dynamically (kind of, maybe not from the perspective of a junior). But in terms of dynamics it is a much less expensive operation to chagne the size of them computationally.

    Weaknesses: Its in the name, their is extra memory overhead for the pointers linking the items in the list. As well as it change be difficult mentally to visualize operations on this data structure (try to reverse a linked list on leetcode and you can see what I mean)
