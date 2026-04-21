# Inheritance Project (Java)

## Description
This project demonstrates object-oriented programming concepts in Java, especially inheritance, polymorphism, and method overriding.

A base class `Employee` is implemented, with two child classes `Developer` and `Tester`. Each subclass extends the functionality of the parent class and overrides selected methods.

A `ProjectTeam` class manages a collection of employees using an ArrayList and provides operations such as adding employees, printing team members, calculating total cost, and filtering specific roles.

The `Main` class contains a simple test scenario that creates objects and demonstrates polymorphism and casting.

---

## Classes

### 1. Employee (Parent Class)
- Stores common employee data (ID, name, salary)
- Contains methods like:
    - `introduceYourself()`
    - `toString()`
    - `equals()`
    - `hashCode()`

---

### 2. Developer (Child Class)
- Extends Employee
- Adds developer-specific fields (e.g. technologies, experience)
- Overrides methods from Employee
- Includes method:
    - `printTechnologies()`

---

### 3. Tester (Child Class)
- Extends Employee
- Adds tester-specific fields (automationTester, scenarioCount)
- Overrides methods from Employee
- Includes method:
    - `runTestingReport()`

---

### 4. ProjectTeam
- Manages a list of employees using `ArrayList<Employee>`
- Methods include:
    - `addEmployee()`
    - `printTeamMembers()`
    - `calculateTotalCost()`
    - `findById()`
    - `printDevelopers()`
    - `printAutomationTesters()`

---

### 5. Main
- Contains a simple test scenario
- Demonstrates:
    - object creation
    - polymorphism
    - instanceof and casting
    - method overriding

---

## Concepts Used
- Inheritance
- Polymorphism
- Method overriding (`@Override`)
- ArrayList
- instanceof and casting
- Encapsulation