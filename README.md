# Chapter 2
THIS PAGE CONTAINS several exercises adapted from Chapter 2 of 
[Introduction to Programming Using Java](http://math.hws.edu/javanotes/index.html).
For each exercise, a possible solution is provided in a previous commit of this repo. 
Each solution includes a discussion of how a programmer might approach the problem and 
interesting points raised by the problem or its solution, as well as complete 
source code of the solution.
 
## Exercise 2.1:
Write a program (`PrintInitials.java`) that will print your initials to standard output in letters that 
are nine lines tall. Each big letter should be made up of a bunch of `*`'s. 
For example, if your initials were `DJE`, then the output would look something like:

```
******           *************        **********
**    **                **            **
**     **               **            **
**      **              **            **
**      **              **            ********
**      **       **     **            **
**     **         **    **            **
**    **           **  **             **
*****               ****              ********** 
```

## Exercise 2.2:
Write a program (`RollTheDice.java`) that simulates rolling a pair of dice. 
You can simulate rolling one die by choosing one of the integers 1, 2, 3, 4, 5, 
or 6 at random. The number you pick represents the number on the die after it is 
rolled. As pointed out in Section 2.5, the expression:

  `(int)(Math.random()*6) + 1`
  
does the computation to select a random integer between 1 and 6. You can assign this value to a variable to represent one of the dice that are being rolled. Do this twice and add the results together to get the total roll. Your program should report the number showing on each die as well as the total roll. For example:

```
The first die comes up 3
The second die comes up 5
Your total roll is 8
```

## Exercise 2.3:
Write a program (`Greeting.java`) that asks the user's name, and then greets the user by name. 
Before outputting the user's name, convert it to upper case letters. 
For example, if the user's name is "Fred", then the program execution would be:

```
Please enter your name: Fred
Hello, FRED, nice to meet you!
```

## Exercise 2.4:
Write a program (`CountChange.java`) that helps the user count change (in AUD). The program should ask how 
many 5c, 10c, 20c, 50c, $1 and $2 they have. Then the program should tell the user how much money they have, 
expressed in dollars. Here is an example:

```
Enter the number of 5c:  0
Enter the number of 10c: 3
Enter the number of 20c: 2
Enter the number of 50c: 1
Enter the number of $1:  1
Enter the number of $2:  2
The total in dollars is: $6.20
```

## Exercise 2.5:
If you have `N` eggs, then you have `N/12` dozen eggs, with `N%12` eggs left 
over. (This is essentially the definition of the / and % operators for 
integers.) Write a program (`Dozens.java`) that asks the user how many eggs they 
have and then tells the user how many dozen eggs they have and how many extra 
eggs are left over. For example, if the user says that they have `13` eggs, 
then your program would look like this:
```
How many eggs do you have?  13
Your number of eggs is 1 dozen and 1
```

A gross of eggs is equal to `144` eggs. Extend your program (`GrossAndDozens.java`) 
so that it will tell the user how many gross, how many dozen, and how many left 
over eggs they have. For example, if the user says that they have `1342` eggs, 
then your program would respond with:

```
Your number of eggs is 9 gross, 3 dozen, and 10
since 1342 is equal to 9*144 + 3*12 + 10.
```

## Exercise 2.6:
This exercise asks you to write a program (`FirstNameLastName.java`) that tests some of the built-in 
subroutines for working with **Strings**. The program should ask the user to 
enter their first name and their last name, separated by a space. Read 
the user's response using `TextIO.getln()`. Break the input string up into 
two strings, one containing the first name and one containing the last name. 
You can do that by using the `indexOf()` subroutine to find the position of the 
space, and then using `substring()` to extract each of the two names. Also 
output the number of characters in each name, and output the user's initials. 
(The initials are the first letter of the first name together with the first 
letter of the last name.) A sample run of the program should look something 
like this:

```
Please enter your first name and last name, separated by a space.
? Mary Smith
Your first name is Mary, which has 4 characters
Your last name is Smith, which has 5 characters
Your initials are MS
```

## Exercise 2.7:
Suppose that a file at path `"resources/testdata.txt"` contains the following information: 
The first line of the file is the name of a student. Each of the next three 
lines contains an integer. The integers are the student's scores on three 
exams. Write a program (`FindAverage.java`) that will read the information in the file and 
display (on standard output) a message that contains the name of the student 
and the student's average grade on the three exams. The average is obtained 
by adding up the individual exam grades and then dividing by the number of 
exams.