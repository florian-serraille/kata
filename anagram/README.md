# Anagram
## About this Kata
This Kata was posted as the problem to be solved in a “self-documenting code contest”.

The results of the code contest can be found here.

# Problem Description
## Step 1
Write a program that generates all two-word anagrams of the string “documenting”. You must focus on the readability of your code, and you must not include any kind of documentations to it. The goal is to create a code that everybody can read and understand easily.
Here’s a word list you might want to use.

## Step 2
Try to improve the performance of your solution but keep in mind that making it faster affects readability.
Continue to focus on readability first.

## Comments from those who are working on this Kata
After programing the first version with TDD appraoch it is very interesing to take different appraoches to this problem and reuse your tests.

If you use parallel/multi-threading - will your tests still verify your solution or will they fail cuz they assumed a particular order?

What is the most time consuming operation in your solution? Can you go crazy optimizing it and still be sure you solution works thanks to tests?

A note for .NET programers: sorting takes quite some time, can you do it faster? (I think I did, check it out here: https://github.com/inwenis/anagrams_kata2