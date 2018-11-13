# Spring Caching

A skeleton project to demo enabling caching on a Spring managed bean.

The application enables caching on a simple book repository.

## Getting Started

You can get started by cloning the project to your local machine:
```
$ git clone https://github.com/amitchell94/spring-caching.git
```

### Prerequisites

In order to execute this program you will need have the Java JDK installed.

## Running the Application

The application can be run by packaging everything in a single, executable JAR file, driven by a Java `main()` method. 

After running the application, you should see something like this:
```
2016-09-01 11:12:47.033  .. : .... Fetching books
2016-09-01 11:12:50.039  .. : isbn-1234 -->Book{isbn='isbn-1234', title='Some book'}
2016-09-01 11:12:53.044  .. : isbn-4567 -->Book{isbn='isbn-4567', title='Some book'}
2016-09-01 11:12:53.045  .. : isbn-1234 -->Book{isbn='isbn-1234', title='Some book'}
2016-09-01 11:12:53.045  .. : isbn-4567 -->Book{isbn='isbn-4567', title='Some book'}
2016-09-01 11:12:53.045  .. : isbn-1234 -->Book{isbn='isbn-1234', title='Some book'}
2016-09-01 11:12:53.045  .. : isbn-1234 -->Book{isbn='isbn-1234', title='Some book'}
```
This excerpt from the console shows that the first time to fetch each title took three seconds, but each subsequent call was near instantaneous.

## Built With

* [Gradle](https://gradle.com/) - Dependency Management

## Authors

* **Andy Mitchell** - *Initial work* - [GitHub](https://github.com/amitchell94)

## Acknowledgments

* Created using the [Spring Data Caching Tutorial](https://spring.io/guides/gs/caching/) 
