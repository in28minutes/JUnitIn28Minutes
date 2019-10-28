# JUnitIn28Minutes

Git hub repository for the free Udemy course : 
[https://www.udemy.com/course/junit-tutorial-for-beginners-with-java-examples/](https://www.udemy.com/course/junit-tutorial-for-beginners-with-java-examples/)


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

## About in28Minutes

At in28Minutes, we ask ourselves one question everyday
> How do we create more amazing course experiences? 
> We use 80-20 Rule. We discuss 20% things used 80% of time in depth.

We are creating amazing learning experiences for learning Spring Boot with AWS, Azure, GCP, Docker, Kubernetes and Full Stack. 300,000 Learners rely on our expertise.  [Find out more.... ](https://github.com/in28minutes/learn#best-selling-courses)

![in28MinutesLearningRoadmap-July2019.png](https://github.com/in28minutes/in28Minutes-Course-Roadmap/raw/master/in28MinutesLearningRoadmap-July2019.png)
