# leetcode_jan08
LEETCODE PROBLEMS
## Q1 Range Sum of BST
Given the root node of a binary search tree and two integers low and high, return the sum of values of all nodes with a value in the inclusive range [low, high].
<img width="433" alt="image" src="https://github.com/Poorvaahuja/leetcode_jan08/assets/122693422/a0570c03-8a0a-4565-ba3c-fbdf0ee9229b">
## Q2 Find consecutive Integers from data stream
For a stream of integers, implement a data structure that checks if the last k integers parsed in the stream are equal to value.
Implement the DataStream class:
DataStream(int value, int k) Initializes the object with an empty integer stream and the two integers value and k.
boolean consec(int num) Adds num to the stream of integers. Returns true if the last k integers are equal to value, and false otherwise. If there are less than k integers, the condition does not hold true, so returns false.
