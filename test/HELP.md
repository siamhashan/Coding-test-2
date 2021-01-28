**Problem:**
Given a string _s_, find the longest palindromic substring in _s_. You may assume that the maximum length of _s_ is 1000.

**Solution:**
Write a Spring Boot micro-service that completes the following:

1. Receives string input over an API
2. Stores the longest palindrome in provided database
3. Retrieves the stored palindrome over an API

You should be able to run your micro-service locally and use an API client (such as PostMan) to test your results.


Created couple of endpoints.
1. get all the saved palindromes from the DB (http://localhost:8080/test/getsaved/palindromes)
2. Find the palindrome from a string and save it in the DB.(http://localhost:8080/save/palindrome/{String})

We can further enhance it by adding controller advise for the error handling and logging.
