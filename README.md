# JUnitIn28Minutes
Get started with Junit

* [Course Overview](#topics)
  - [Section 1 Foundation](#section-1-foundation)
  - [Section 2 First JUnit Example](#section-2-first-junit-example)
  - [Section 3 Second JUnit Example](#section-3-second-junit-example)
  - [Section 4 JUnit Simple Test Scenarios](#section-4-junit-simple-test-scenarios)
  - [Section 5 JUnit Intermediate Test Scenarios](#section-5-junit-intermediate-test-scenarios)
  - [Section 6 JUnit Best Practices](#section-6-junit-best-practices)
  - [Starting Examples](#starting-examples)
* [About in28Minutes](#about-in28minutes)
  - [Our Beliefs](#our-beliefs)
  - [Our Approach](#our-approach)
  - [Find Us](#useful-links)
  - [Other Courses](#other-courses)

##Topics
###Section 1 Foundation
- What is JUnit?
- Why Unit Testing?

###Section 2 First JUnit Example
@Test Annotation
- Running JUnit
- No Failure = Success
- Basic Assert methods

###Section 3 Second JUnit Example
- assertTrue and assertFalse methods
- @Before @After annotations
- @BeforeClass @AfterClass annotations

###Section 4 JUnit Simple Test Scenarios
- Comparing Arrays
- Testing Exceptions
- Performance Unit Tests

###Section 5 JUnit Intermediate Test Scenarios 
- Parameterized Tests
- Test Suites

###Section 6 JUnit Best Practices
- Naming Test Methods
- Highlight Important Values in Tests
- Handle Exceptions Properly
- Readable Assert Statements

###Starting Examples
```
package com.in28minutes.junit.helper;

public class StringHelper {

	public String truncateAInFirst2Positions(String str) {
		if (str.length() <= 2)
			return str.replaceAll("A", "");

		String first2Chars = str.substring(0, 2);
		String stringMinusFirst2Chars = str.substring(2);

		return first2Chars.replaceAll("A", "") 
				+ stringMinusFirst2Chars;
	}

	public boolean areFirstAndLastTwoCharactersTheSame(String str) {

		if (str.length() <= 1)
			return false;
		if (str.length() == 2)
			return true;

		String first2Chars = str.substring(0, 2);

		String last2Chars = str.substring(str.length() - 2);

		return first2Chars.equals(last2Chars);
	}

}

```


##About in28Minutes
- At in28Minutes, we ask ourselves one question everyday. How do we create more effective trainings?
- We use Problem-Solution based Step-By-Step Hands-on Approach With Practical, Real World Application Examples. 
- Our success on Udemy and Youtube (2 Million Views & 12K Subscribers) speaks volumes about the success of our approach.
- While our primary expertise is on Development, Design & Architecture Java & Related Frameworks (Spring, Struts, Hibernate) we are expanding into the front-end world (Bootstrap, JQuery, Angular JS). 

###Our Beliefs
- Best Course are interactive and fun.
- Foundations for building high quality applications are best laid down while learning.

###Our Approach
- Problem Solution based Step by Step Hands-on Learning
- Practical, Real World Application Examples.
- We use 80-20 Rule. We discuss 20% things used 80% of time in depth. We touch upon other things briefly equipping you with enough knowledge to find out more on your own. 
- We will be developing a demo application in the course, which could be reused in your projects, saving hours of your effort.
- All the code is available on Github, for most steps.

###Useful Links
- [Our Website](http://www.in28minutes.com)
- [Youtube Courses](https://www.youtube.com/user/rithustutorials/playlists)
- [Udemy Courses](https://www.udemy.com/user/in28minutes/)
- [Facebook](http://facebook.com/in28minutes)
- [Twitter](http://twitter.com/in28minutes)
- [Google Plus](https://plus.google.com/u/3/110861829188024231119)

###Other Courses
- [Spring Framework](https://www.udemy.com/spring-tutorial-for-beginners/)
- [Maven](http://www.in28minutes.com/p/maven-tutorial-for-beginners.html)
- [Eclipse](http://www.in28minutes.com/p/eclipse-java-video-tutorial.html)
- Java
  * [Java](https://www.youtube.com/watch?v=Y4ftqcYVh5I&list=PLE0D4634AE2DFA591&index=1)
  * [Java Collections](http://www.in28minutes.com/p/java-collections-framework-video.html)
  * [Java OOPS Concepts](https://www.udemy.com/learn-object-oriented-programming-in-java/) 
- [Design Patterns](http://www.in28minutes.com/p/design-patterns-tutorial.html)
- [JUnit](https://www.udemy.com/junit-tutorial-for-beginners-with-java-examples/)
- [C](https://www.udemy.com/c-tutorial-for-beginners-with-puzzles/)
- [C Puzzles](https://www.udemy.com/c-puzzles-for-beginners/)
- [Javascript](https://www.youtube.com/watch?v=6TZdD-FR6CY)
- [More Courses on Udemy](https://www.udemy.com/user/in28minutes/)
  * Java Servlets and JSP : Your first web application in 25 Steps
  * Learn Spring MVC in 25 Steps 
  * Learn Struts in 25 Steps 
  * Learn Struts in 25 Steps   
