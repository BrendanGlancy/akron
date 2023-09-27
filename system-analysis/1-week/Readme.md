# Chapter 1

What is a system:
**A collection of part that work together to achieve a goal**

What is an information system:
**A system that deals with information**

## Three components of computer information system:

- Computer
- Network
- Data

## Basic Concepts of system analysis and design

**Software**
- System Software, talks to the hardware
- Application Software, User interaction software

**Computer Application (App)** - a computer software program that executes on a computing device to carry out a specific set of functions 
- Modest Scope

**Information System** - a set of interrelated components that collects, processes and provides as output the information needed to complete business tasks
- Broader scope than "app"
- Includes database and related manual processes

## Analysis 

- System analysis
    - What is required for the new system to solve a problem
- Systems design
    - How the system will operate to solve a problem

### Software Development 

User stories are a key part of agile software development. They are short, simple descriptions of a software feature or functionality from the perspective of a user. User stories are written in plain language and are intended to be easily accessible. They are used to capture requirements in an agile project and help the development team understand the needs and expectations of the users.

This is where we decide what features our software product needs, and then we imagine how that will effect the design **required features effect the design** think of a truck and a race car

Its the same for information systems, based on the features which you get from user stories, you develop the design requirements

### Structured Analysis and Design

**Waterfall** Approach to Software development
- Too ridged
- Focuses on compartmentalizing projects into several phases.

**Agile** Approach
- Focuses on self-adaptive processes with an emphasis on individual talents.

### Different types on Information Systems

Transaction Processing System (EX. ATM)

Combine a Transaction Processing System and data analytics system types to provide overall support systems

**Management information systems** (MIS): Help middle managers plan and control workflow.

**Decision support systems** (DSS): Computer-based systems that support business or organizational decision-making.

**Executive information systems** (EIS): A type of DSS that helps senior executives make decisions.

### The SDLC (Software Development Life Cycle) generally follows these seven stages:

- Plan and brainstorm
- Analyze requirements
- Design the mock-ups
- Develop the code
- Test the product
- Implement and launch the product
- Maintenance

**Project** - a planned undertaking that has a beginning and end and that produces some definite result

- Used to develop an information system
- Requires knowledge of systems analysis and systems design tools and techniques

### Agile Development 

Software Development
- More like inventing a gadget then building a house
- Big requirements upfront not a viable option
- So instead "Build a little, review a little, revise a little"


**Scrum** is an agile methodology that involves a small team led by a Scrum master. The team works in short cycles called sprints. The team meets daily to discuss tasks and any obstacles that need to be removed. The Scrum master's job is to remove any obstacles to getting work done.

# Week 2

`Functional Decomposition` - is a method of analysis that breaks down a complex process into smaller, more manageable pasts. The goal is to simplify the system so that it is easier to understand.

**7 components of an Information system**

- Hardware
- Software 
- Data
- People 
- Outputs
- Inputs 
- Procedures

A lot of organizations user applications from different vendors
This creates a situation where you need Enterprise Application Integration

``Assignment Week 2``

PE 1-5. Read the I2C2 case study in Appendix A for I2C2’s existing clinic and pharmacy business and the project to update I2C2’s systems supporting that business. Consider that for this clinic and pharmacy business, I2C2 has an existing, well-understood set of business processes. Further, the systems supporting that business run well and already provide many of the features that I2C2 needs. Finally, I2C2 has been able to clearly describe the new software features needed to enhance those systems. Given this, explain the following:

a. How much is this systems project like inventing a new gadget?
b. How much is this systems project like creating blueprints to add rooms to a house?
c. Given the previous points, would you suggest an agile approach using emergent requirements versus a plan-driven approach using big requirements up front (BRUF)? Why?

### Business Analysis Modeling:

- Business Processes (This chapter)
- Key Concept (Chapter 3)
- User Stories (Chapter 4)
- User Experience / User Interface (Chapter 4)

Fundamental Types of Models in SYSA&D

- Two fundamental types of models in SA&D
    - Models of the real world context and systems as part of it (analysis models)
    - Models of the internal structure of the information systems that enable the real-world systems to work (design models)

**Model** - Representation of the real world
EX: model airplanes & cars

### Modeling for Software Development 

- Software modeling is shaped by 4 interweaved factors:
    1. How the real world is seen
    2. How software is defined
    3. The process of development and
    4. the modeling language

- UML can do (Unified modeling language)
1. Behavioral modeling (Use cases, their dependencies, generalization, separating and combining)
2. Structural modeling (Classes, relationships, multiplicity, aggregation, interfaces) and 
3. Dynamic modeling (methods in the classes, sequence diagrams, activity diagrams, statechart diagrams, collaboration diagrams)

### Our focus: Business Process Modeling

- Tool UML Activity diagram, a widely used tool for behavioral modeling
    - determining what actions and activities take place in the context of the area of interest
- Purpose: Articulating activities and specific rules for control and object flows that specify the way in which and organized group of actors (typically human beings) act to achieve a goal

### Chapter 3: Identifying and Documenting Key Concepts of the Domain of Interest

Entity Relationship Diagram (ERD or ER diagram)

- Are there any tangible things? Are there any organizational units? Sites/Location? Are there incidents or events that need to be recorded

Association - A naturally occurring relationship between classes (UML term)

**Minimum and Maximum Multiplicity**

- Associations have minimum and maximum constraints
    - Minimum is zero, the association is optional
    - If the minimum is at least one, the association is mandatory


| ERD Terminology       | UML Class Diagrams       | Description |
|-----------------------|--------------------------|-------------|
| Entity                | Class                    | Represents a thing with stored information. |
| Attribute             | Attribute                | Describes a property of an entity or class. |
| Relationship          | Association              | Describes how entities or classes relate to each other. |
| Primary Key           | Key Constraint           | A unique identifier for records in an entity or objects in a class. |
| Foreign Key           | N/A (Explicitly shown through associations) | A field in an entity that links to the primary key of another entity. |
| Composite Attribute   | N/A (Broken down into simpler attributes) | An attribute that can be divided into sub-parts, representing more basic attributes with independent meanings. |
| Multi-valued Attribute| Collection Attribute     | An attribute that holds multiple values. |
| Derived Attribute     | Derived Attribute        | An attribute whose value can be derived from other attributes in the database. |
| Weak Entity           | Dependent Class          | An entity that depends on another entity for its existence. |
| Cardinality           | Multiplicity             | Indicates the maximum number of times an instance in one entity can relate to instances of another entity. |
| ISA (Is a)            | Inheritance              | Represents an inheritance relationship between a superclass and subclass. |

### UML Domain Class Notation

- Domain class a name and attributes (no methods)
- Class name is always capitalized

`0..1`: Zero or one instance (Optional relationship)
`1`: Exactly one instance (Mandatory relationship)
`0..*`: Zero or more instances
`1..*`: One or more instances
`n`: Exactly n instances, where n is a specific integer

# Week 4 

`Next Monday We'll have the first Exam`

UML Domain Class Notation

- Domain class a name and attributes (no methods)
- Class name is always capitalized 
- Attribute names are not capitalized and use camelback notation (words run together and second word is capitalized)


**Unary relationship** 
- A unary relationship, also known as a reflexive relationship, is a relationship in which a class is associated with itself. For example, consider a Person class where each Person object may have a relationship to a 'parent' who is also a Person. This kind of relationship would be a unary relationship, since it involves only one class.

**One-to-one relationship**
- In a one-to-one (1:1) relationship, an instance of class A is associated with exactly one instance of class B, and an instance of class B is associated with exactly one instance of class A. For instance, consider two classes, Human and Heart. Each Human object has one Heart, and each Heart object belongs to one Human. This relationship would be modeled as one-to-one.
**One-to-many relationship**
- In a one-to-many (1:N) relationship, an instance of class A can be associated with zero, one, or multiple instances of class B, but each instance of class B is associated with exactly one instance of class A. For example, consider a Teacher class and a Student class. One Teacher can have multiple Students, but each Student has exactly one Teacher. This is a one-to-many relationship. 


In UML class diagrams, these relationships are often depicted with lines connecting the classes involved. The multiplicity (1, 1.., 0..1, etc.) is usually indicated at each end of the line to specify the type of relationship. For example, for a one-to-many relationship between Teacher and Student, the line might have a "1" at the end touching the Teacher class and a "" at the end touching the Student class, indicating that one Teacher can have many Students.

**Association class -** an association that is treated as a class in many to many association because it has attributes that need to be remembered (such as grade)

In simple terms, both composition and aggregation are ways to describe relationships between two things (or "classes" in programming lingo) where one is considered a part of another. However the key difference lies in how tightly connected these two thing are 

**Composition** - In composition, if the whole goes away or is destroyed, the part goes away with it. 

**Aggregation** - In aggregation, even if the whole goes away, the part can still exist. 

Aggregation is a design concept in object-oriented programming (OOP) that represents a "has-a" or "part-of" relationship between two classes. 

`To review for the test read chapters 1-4`

### User Stories 

**Three parts to a user story**

- **Who:** the type of user
- **What:** What the user wants to accomplish
- **Why:** The benefit or reason the user wants this feature

Heres an exmaple of a user story, each line represents one of the three parts in order from above

```
As a frequent traveler,
I want to be able to check into my flights via a mobile app,
So that I can save time avoid long lines at the airport.
```

Evaluating user stories with the INVEST Model:

- Independent (of other user stories)
- Negotiable (one that leaves space for negotiation during construction)
- Valuable (for the client)
- Estimate (one that provides a sufficient foundation for a good approximation)
- Small (allows its completion within a specific constrution cycle)
- Testable (Particulary when Evaluated togehter with accpetance criteria)

### Lab -03

Do exercise labeled PE 3-6 at the end of Chapter 03 in the text. 

Answer the questions at the end of the exercise and label them properly. No hand-written answers. You should be able to reason what you include in the answer even though in this case you only need to create a UML Domain Class Diagram. You do need to identify the classes, their attributes, associations and multiplicity. You may do the domain model in Visio, paste it in Word and upload the Word document. There are other software available online to do UML diagrams. DO NOT give me links to diagrams done in these software. These links don't work.

Answers should be in a Word and text file with your name near the top of the page. This file should be uploaded to the dropbox in Brightspace. The dropbox is available through Assessments or right under this assignment.
