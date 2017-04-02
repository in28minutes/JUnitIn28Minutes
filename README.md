# JUnitIn28Minutes

Git hub repository for the free Udemy course : 
[https://www.udemy.com/junit-tutorial-for-beginners-with-java-examples/](https://www.udemy.com/junit-tutorial-for-beginners-with-java-examples/)


## Get started with Junit

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

## Topics
### Section 1 Foundation
- What is JUnit?
- Why Unit Testing?

### Section 2 First JUnit Example
@Test Annotation
- Running JUnit
- No Failure = Success
- Basic Assert methods

### Section 3 Second JUnit Example
- assertTrue and assertFalse methods
- @Before @After annotations
- @BeforeClass @AfterClass annotations

### Section 4 JUnit Simple Test Scenarios
- Comparing Arrays
- Testing Exceptions
- Performance Unit Tests

### Section 5 JUnit Intermediate Test Scenarios 
- Parameterized Tests
- Test Suites

### Section 6 JUnit Best Practices
- Naming Test Methods
- Highlight Important Values in Tests
- Handle Exceptions Properly
- Readable Assert Statements

### Starting Examples
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


## About in28Minutes
- At in28Minutes, we ask ourselves one question everyday. How do we create more effective trainings?
- We use Problem-Solution based Step-By-Step Hands-on Approach With Practical, Real World Application Examples. 
- Our success on Udemy and Youtube (2 Million Views & 12K Subscribers) speaks volumes about the success of our approach.
- While our primary expertise is on Development, Design & Architecture Java & Related Frameworks (Spring, Struts, Hibernate) we are expanding into the front-end world (Bootstrap, JQuery, Angular JS). 

### Our Beliefs
- Best Course are interactive and fun.
- Foundations for building high quality applications are best laid down while learning.

### Our Approach
- Problem Solution based Step by Step Hands-on Learning
- Practical, Real World Application Examples.
- We use 80-20 Rule. We discuss 20% things used 80% of time in depth. We touch upon other things briefly equipping you with enough knowledge to find out more on your own. 
- We will be developing a demo application in the course, which could be reused in your projects, saving hours of your effort.
- All the code is available on Github, for most steps.

### Other Courses

- [Most Watched Courses on YouTube - 30,000 Subscribers](https://www.youtube.com/watch?v=bNFoN956P2A&list=PLBBog2r6uMCQhZaQ9vUT5zJWXzz-f49k1)
- [25 Videos and Articles for Beginners on Spring Boot](http://www.springboottutorial.com/spring-boot-tutorials-for-beginners)
- Our Best Courses with 66,000 Students and 4,000 5-Star Ratings
  * [Java Interview Guide : 200+ Interview Questions and Answers](https://www.udemy.com/java-interview-questions-and-answers/?couponCode=JAVA_INTER_GIT)
  * [First Web Application with Spring Boot](https://www.udemy.com/spring-boot-first-web-application/?couponCode=SPRING-BOOT-1-GIT)
  * [Spring Boot Tutorial For Beginners](https://www.udemy.com/spring-boot-tutorial-for-beginners/?couponCode=SPRING-BOOT-GIT)
  * [Mockito Tutorial : Learn mocking with 25 Junit Examples](https://www.udemy.com/mockito-tutorial-with-junit-examples/?couponCode=MOCKITO_GIT)
  * [Java EE Made Easy - Patterns, Architecture and Frameworks](https://www.udemy.com/java-ee-design-patterns-architecture-and-frameworks/?couponCode=EEPATTERNS-GIT)
  * [Spring MVC For Beginners : Build Java Web App in 25 Steps](https://www.udemy.com/spring-mvc-tutorial-for-beginners-step-by-step/?couponCode=SPRINGMVC-GIT)
  * [JSP Servlets For Beginners : Build Java Web App in 25 Steps](https://www.udemy.com/learn-java-servlets-and-jsp-web-application-in-25-steps/?couponCode=JSPSRVLT-GIT)
  * [Maven Tutorial - Manage Java Dependencies in 25 Steps](https://www.udemy.com/learn-maven-java-dependency-management-in-20-steps/?couponCode=MAVEN_GIT)
  * [Java OOPS in 1 Hours](https://www.udemy.com/learn-object-oriented-programming-in-java/?couponCode=OOPS-GIT)
  * [C Puzzle for Interview](https://www.udemy.com/c-puzzles-for-beginners/?couponCode=CPUZZLES-GIT)
  
### Useful Links
- [Our Website](http://www.in28minutes.com)
- [Facebook](http://facebook.com/in28minutes)
- [Twitter](http://twitter.com/in28minutes)
- [Google Plus](https://plus.google.com/u/3/110861829188024231119)
