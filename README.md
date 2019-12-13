# Reverse Polish Notation (RPN) Calculator
Command-line based RPN calculator using Java Language

# Introduction
Command-line RPN calculator which uses standard input and standard output as interfaces.

Available operators are +, -, *, /

The calculator waits for user input in the form of strings. The input string contains list of numbers and operator separated by whitespace.

The output is displayed in the next line in the standard output

Numbers are pushed on to the stack and operators operate on numbers that are on the stack. Operators pop their parameters off the stack, and push their results back onto the stack. If an operator cannot find a sufficient number of parameters on the stack, a message is displayed

# Technical Specification
Implemented and tested using Java 8 and JUnit
Maven used for compiling and building the project dependencies 

# How to Compile, Test, Run
Compile: mvn compile

Test: mvn test

Run: mvn exec:java

Packaging: mvn package, compiled jar in target/ folder