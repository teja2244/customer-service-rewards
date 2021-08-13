Tej Customer Rewards
===============================

# A Spring Boot Application
 

A retailer offers a rewards program to its customers, awarding points based on each recorded purchase.


A customer receives 2 points for every dollar spent over $100 in each transaction, plus 1 point for every dollar spent over $50 in each transaction

(e.g. a $120 purchase = 2x$20 + 1x$50 = 90 points).
 

Given a record of every transaction during a three month period, calculate the reward points earned for each customer per month and total.


  
### Approach
Created a controller, service (and a mock for local test), repository, model sections to hold the transaction, model data of Customer Rewards.Overall business logic is kept in MyTransaction class under the model section.   

Lombok is not used and actual getters and setters are used. JAckson with JsonIgnore used sparingly.




###To Run this project locally



```shell
$ mvn package
$ mvn spring-boot: run
```

Other option is to load as Maven project in Eclipse 
and go to com.practice.service.customerrewards package, right click on CustomerRewardsApplication.java to run as Java application
