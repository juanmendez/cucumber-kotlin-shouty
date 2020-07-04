# Pluralsight: BDD With Cucumber and Gherkin

**Features and Scenarios**

- A feature is a piece of useful functionality we deliver to the users
- A feature can be made of several scenarios, and the combination of scenarios make user stories.

<img width="703" alt="image" src="https://user-images.githubusercontent.com/3371622/86518114-35c51600-bdf4-11ea-9565-2b1c5c11d289.png">
<img width="769" alt="Screen Shot 2020-07-04 at 12 46 26" src="https://user-images.githubusercontent.com/3371622/86518146-9c4a3400-bdf4-11ea-9c29-7fee666b6673.png">

A background section bootstraps data in a feature in order to be used multiple times by different scenarios

<img width="789" alt="Screen Shot 2020-07-04 at 12 50 26" src="https://user-images.githubusercontent.com/3371622/86518178-f64af980-bdf4-11ea-9fcc-4df2d8370788.png">

This is a scenario which is hard to read

<img width="768" alt="Screen Shot 2020-07-04 at 12 54 22" src="https://user-images.githubusercontent.com/3371622/86518223-81c48a80-bdf5-11ea-9391-667e41f050ef.png">

But can be simplified with a table

<img width="842" alt="Screen Shot 2020-07-04 at 12 55 45" src="https://user-images.githubusercontent.com/3371622/86518236-b33d5600-bdf5-11ea-9832-641c25943db4.png">

The sky is the limit, we can even use tables to make our data description richer and simpler than just writing sentences

<img width="806" alt="image" src="https://user-images.githubusercontent.com/3371622/86518281-162eed00-bdf6-11ea-8026-e512b5abd368.png">

<img width="833" alt="Screen Shot 2020-07-04 at 13 01 23" src="https://user-images.githubusercontent.com/3371622/86518317-82115580-bdf6-11ea-8349-6cf6720e5ca1.png">


**Scenario Outlines**

When you write several scenarios which follow the same pattern you can combine them into a `Scenario Outline`.
Here for example the `When` and `Then` can be simplified by using placeholders 

<img width="763" alt="image" src="https://user-images.githubusercontent.com/3371622/86518378-4e82fb00-bdf7-11ea-9fac-e92cc3b2af14.png">

<img width="745" alt="image" src="https://user-images.githubusercontent.com/3371622/86518396-6a869c80-bdf7-11ea-9fbd-fcee2633f194.png">

**Anatomy of Cucumber Testing**

<img width="802" alt="image" src="https://user-images.githubusercontent.com/3371622/86519662-5eeca300-be02-11ea-89d3-497ca22916b0.png">