# quiz-4-corrections

QUESTION 5:

I want to print each character of a String one-by-one on a separate line. The number of characters in the String is unknown. You may assume the String is stored in a variable called str. How can I do this? Select all that apply.

Correct Answers:

B: 
int i = 0;
int length = str.length();

while (i < length) {
    System.out.println(str.charAt(i));
}

D:
for (int i = 0; i < str.length(); i++) {
    System.out.println(str.charAt(i));
}

I had only selected D as the correct answer, probably because I though there was only one asnwer to the question. B is also a correct answer be cause it is the exact implementation of the for loop but in while loop form. Thus, it will successfully iterate through all of the characters of the string.


QUESTION 8:

Consider the following method definition.

public static void saySomething(String something) {
    System.out.println(something);
}
Now, consider the following usages of this method.

saySomething("hello, there.");        // first usage

String message = "hello, there.";     // second usage
saySomething(message);

String something = "hello, there.";   // third usage
saySomething(something);
From the perspective of what is output to the console, what is the difference between the three ways in which the method is called?

Correct Answer:

D:
There is no difference.

This is the correct answer because it doesn't matter what you call the variable that you store the string in that you wish to print through the method. I thought you could not do so during the exam.
