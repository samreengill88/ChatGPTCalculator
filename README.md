# ChatGPTCalculator

**Pythagorean Theorem Calculator**
This java program implements a Pythogorean Theorem Calculator to compute missing side of a right angle triangle. This program implements MVC 
design pattern i.e., Model-View-Controller design pattern since, it clearly separate application's concerns into certain packages such as: 
UI, Controller, UseCases and Entity. The program calculates lenght of missing side C which is hypoetnuse of right angle triangle based on 
other two sides (sideA and sideB).

**User Story**
A user wants to calculate length of missing side, hypoetnuse of a right angle triangle given other two sides (sideA and sideB).

**Java Version**
For this program, "20.0.2" version of java was used. The testing framework used is "JUnit 5". It provides enhanced features for testing and 
assertions.

**Code smells / Violations of SOLID**
Though the code is organized in different packages to follow clean architecture and MVC design pattern, 'CalcTheoremUIControl' class violates 
single responsibility principle since it handles userInput along with passing calculation logic. 
Also, at this point this calculator does not checks for negative values.
