# Chapter 1

What is a system: **A collection of part that work together to achieve a goal**

What is an information system: **A system that deals with information**

## Three components of computer information system:

- Computer
- Network
- Data

## Basic Concepts of system analysis and design

**Software**

- System Software, talks to the hardware
- Application Software, User interaction software

**Computer Application (App)** - a computer software program that executes on a
computing device to carry out a specific set of functions

- Modest Scope

**Information System** - a set of interrelated components that collects,
processes and provides as output the information needed to complete business
tasks

- Broader scope than "app"
- Includes database and related manual processes

## Analysis

- System analysis
  - What is required for the new system to solve a problem
- Systems design
  - How the system will operate to solve a problem

### Software Development

User stories are a key part of agile software development. They are short,
simple descriptions of a software feature or functionality from the perspective
of a user. User stories are written in plain language and are intended to be
easily accessible. They are used to capture requirements in an agile project and
help the development team understand the needs and expectations of the users.

This is where we decide what features our software product needs, and then we
imagine how that will effect the design **required features effect the design**
think of a truck and a race car

Its the same for information systems, based on the features which you get from
user stories, you develop the design requirements

### Structured Analysis and Design

**Waterfall** Approach to Software development

- Too ridged
- Focuses on compartmentalizing projects into several phases.

**Agile** Approach

- Focuses on self-adaptive processes with an emphasis on individual talents.

### Different types on Information Systems

Transaction Processing System (EX. ATM)

Combine a Transaction Processing System and data analytics system types to
provide overall support systems

**Management information systems** (MIS): Help middle managers plan and control
workflow.

**Decision support systems** (DSS): Computer-based systems that support business
or organizational decision-making.

**Executive information systems** (EIS): A type of DSS that helps senior
executives make decisions.

### The SDLC (Software Development Life Cycle) generally follows these seven stages:

- Plan and brainstorm
- Analyze requirements
- Design the mock-ups
- Develop the code
- Test the product
- Implement and launch the product
- Maintenance

**Project** - a planned undertaking that has a beginning and end and that
produces some definite result

- Used to develop an information system
- Requires knowledge of systems analysis and systems design tools and techniques

### Agile Development

Software Development

- More like inventing a gadget then building a house
- Big requirements upfront not a viable option
- So instead "Build a little, review a little, revise a little"

**Scrum** is an agile methodology that involves a small team led by a Scrum
master. The team works in short cycles called sprints. The team meets daily to
discuss tasks and any obstacles that need to be removed. The Scrum master's job
is to remove any obstacles to getting work done.

# Week 2

`Functional Decomposition` - is a method of analysis that breaks down a complex
process into smaller, more manageable pasts. The goal is to simplify the system
so that it is easier to understand.

**7 components of an Information system**

- Hardware
- Software
- Data
- People
- Outputs
- Inputs
- Procedures

A lot of organizations user applications from different vendors This creates a
situation where you need Enterprise Application Integration

`Assignment Week 2`

PE 1-5. Read the I2C2 case study in Appendix A for I2C2’s existing clinic and
pharmacy business and the project to update I2C2’s systems supporting that
business. Consider that for this clinic and pharmacy business, I2C2 has an
existing, well-understood set of business processes. Further, the systems
supporting that business run well and already provide many of the features that
I2C2 needs. Finally, I2C2 has been able to clearly describe the new software
features needed to enhance those systems. Given this, explain the following:

a. How much is this systems project like inventing a new gadget? b. How much is
this systems project like creating blueprints to add rooms to a house? c. Given
the previous points, would you suggest an agile approach using emergent
requirements versus a plan-driven approach using big requirements up front
(BRUF)? Why?

### Business Analysis Modeling:

- Business Processes (This chapter)
- Key Concept (Chapter 3)
- User Stories (Chapter 4)
- User Experience / User Interface (Chapter 4)

Fundamental Types of Models in SYSA&D

- Two fundamental types of models in SA&D
  - Models of the real world context and systems as part of it (analysis models)
  - Models of the internal structure of the information systems that enable the
    real-world systems to work (design models)

**Model** - Representation of the real world EX: model airplanes & cars

### Modeling for Software Development

- Software modeling is shaped by 4 interweaved factors:

  1. How the real world is seen
  2. How software is defined
  3. The process of development and
  4. the modeling language

- UML can do (Unified modeling language)

1. Behavioral modeling (Use cases, their dependencies, generalization,
   separating and combining)
2. Structural modeling (Classes, relationships, multiplicity, aggregation,
   interfaces) and
3. Dynamic modeling (methods in the classes, sequence diagrams, activity
   diagrams, statechart diagrams, collaboration diagrams)

### Our focus: Business Process Modeling

- Tool UML Activity diagram, a widely used tool for behavioral modeling
  - determining what actions and activities take place in the context of the
    area of interest
- Purpose: Articulating activities and specific rules for control and object
  flows that specify the way in which and organized group of actors (typically
  human beings) act to achieve a goal

### Chapter 3: Identifying and Documenting Key Concepts of the Domain of Interest

Entity Relationship Diagram (ERD or ER diagram)

- Are there any tangible things? Are there any organizational units?
  Sites/Location? Are there incidents or events that need to be recorded

Association - A naturally occurring relationship between classes (UML term)

**Minimum and Maximum Multiplicity**

- Associations have minimum and maximum constraints
  - Minimum is zero, the association is optional
  - If the minimum is at least one, the association is mandatory

| ERD Terminology        | UML Class Diagrams                          | Description                                                                                                    |
| ---------------------- | ------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| Entity                 | Class                                       | Represents a thing with stored information.                                                                    |
| Attribute              | Attribute                                   | Describes a property of an entity or class.                                                                    |
| Relationship           | Association                                 | Describes how entities or classes relate to each other.                                                        |
| Primary Key            | Key Constraint                              | A unique identifier for records in an entity or objects in a class.                                            |
| Foreign Key            | N/A (Explicitly shown through associations) | A field in an entity that links to the primary key of another entity.                                          |
| Composite Attribute    | N/A (Broken down into simpler attributes)   | An attribute that can be divided into sub-parts, representing more basic attributes with independent meanings. |
| Multi-valued Attribute | Collection Attribute                        | An attribute that holds multiple values.                                                                       |
| Derived Attribute      | Derived Attribute                           | An attribute whose value can be derived from other attributes in the database.                                 |
| Weak Entity            | Dependent Class                             | An entity that depends on another entity for its existence.                                                    |
| Cardinality            | Multiplicity                                | Indicates the maximum number of times an instance in one entity can relate to instances of another entity.     |
| ISA (Is a)             | Inheritance                                 | Represents an inheritance relationship between a superclass and subclass.                                      |

### UML Domain Class Notation

- Domain class a name and attributes (no methods)
- Class name is always capitalized

`0..1`: Zero or one instance (Optional relationship) `1`: Exactly one instance
(Mandatory relationship) `0..*`: Zero or more instances `1..*`: One or more
instances `n`: Exactly n instances, where n is a specific integer

# Week 4

`Next Monday We'll have the first Exam`

UML Domain Class Notation

- Domain class a name and attributes (no methods)
- Class name is always capitalized
- Attribute names are not capitalized and use camelback notation (words run
  together and second word is capitalized)

**Unary relationship**

- A unary relationship, also known as a reflexive relationship, is a
  relationship in which a class is associated with itself. For example, consider
  a Person class where each Person object may have a relationship to a 'parent'
  who is also a Person. This kind of relationship would be a unary relationship,
  since it involves only one class.

**One-to-one relationship**

- In a one-to-one (1:1) relationship, an instance of class A is associated with
  exactly one instance of class B, and an instance of class B is associated with
  exactly one instance of class A. For instance, consider two classes, Human and
  Heart. Each Human object has one Heart, and each Heart object belongs to one
  Human. This relationship would be modeled as one-to-one. **One-to-many
  relationship**
- In a one-to-many (1:N) relationship, an instance of class A can be associated
  with zero, one, or multiple instances of class B, but each instance of class B
  is associated with exactly one instance of class A. For example, consider a
  Teacher class and a Student class. One Teacher can have multiple Students, but
  each Student has exactly one Teacher. This is a one-to-many relationship.

In UML class diagrams, these relationships are often depicted with lines
connecting the classes involved. The multiplicity (1, 1.., 0..1, etc.) is
usually indicated at each end of the line to specify the type of relationship.
For example, for a one-to-many relationship between Teacher and Student, the
line might have a "1" at the end touching the Teacher class and a "" at the end
touching the Student class, indicating that one Teacher can have many Students.

**Association class -** an association that is treated as a class in many to
many association because it has attributes that need to be remembered (such as
grade)

In simple terms, both composition and aggregation are ways to describe
relationships between two things (or "classes" in programming lingo) where one
is considered a part of another. However the key difference lies in how tightly
connected these two thing are

**Composition** - In composition, if the whole goes away or is destroyed, the
part goes away with it.

**Aggregation** - In aggregation, even if the whole goes away, the part can
still exist.

Aggregation is a design concept in object-oriented programming (OOP) that
represents a "has-a" or "part-of" relationship between two classes.

`To review for the test read chapters 1-4`

### User Stories

**Three parts to a user story**

- **Who:** the type of user
- **What:** What the user wants to accomplish
- **Why:** The benefit or reason the user wants this feature

Heres an exmaple of a user story, each line represents one of the three parts in
order from above

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

Answer the questions at the end of the exercise and label them properly. No
hand-written answers. You should be able to reason what you include in the
answer even though in this case you only need to create a UML Domain Class
Diagram. You do need to identify the classes, their attributes, associations and
multiplicity. You may do the domain model in Visio, paste it in Word and upload
the Word document. There are other software available online to do UML diagrams.
DO NOT give me links to diagrams done in these software. These links don't work.

Answers should be in a Word and text file with your name near the top of the
page. This file should be uploaded to the dropbox in Brightspace. The dropbox is
available through Assessments or right under this assignment.

## Using activity diagrams to Identify user stories

Approaches include:

- using activity diagrams: to ID user stories within a business process epic
  - User/system interactions
  - System automated functions
- Identifying collectionsm of related but otherwise independent user stories
  - individual reports in a data warehouse

### Agile Modeling prinicpals

- Software is your primary goal
- Next effort is your secondary goal
- Minimize remodeling
- Embrace change, change incrementally
- Model with a Purpose
- Build multiple modelsHihg quality modes, get feedback
- Focus on content not Representation
- Communcate and learn

### The Unified process (UP) - Phases

UP SDLC - iterates into four phases

- Inception
  - develop an approximate vision of the system
- Elaboration
  - Define the vision
- construction
  - Iteratively implement the remaining lower rise, element and prepare for
    deployment
- Transition
  - Complete the beta test and deploy

### XP Cores Values and Practices

- Communication
- Simplicity
- Feedback
- Courage

**XP Practices**

1. Pair programming
2. Test-Driven Development / Testing
3. Continuous Integration
4. Refactoring
5. Simple Design
6. Collective Code Ownership
7. System Metaphor
8. Small Releases
9. Simple design
10. Customer Reviews
11. Code Standards
12. 40-hour week

**XP Project Approach**

1. Create user stories
2. Create System Metaphor
3. Create acceptance test
4. Plan releases
5. acceptance test
6. start next release

## Scrum

- Scrum sprints
  - A time controlled mini-project to implement part of the system

1. Create product backlog
2. Scrum Planning meeting
3. Scrum Master Scrum team start working on the backlog
4. Scrum Sprint (daily meetings)
5. Incremental Software results
   - Plan for the next sprint

**Agile Approach to release planning**

1. Assign the highest priority product backlog stories to the Sprint 1 backlog
2. After Sprint 1, review the process updates remaining in the product backlog
3. Assign the (revised) highest-priority product backlog stories to the Sprint 2
   backlog
4. Pattern repeats for all the remaining sprints

**Hybrid Approach to release planning**

1. Unified Planning: Combine the broad timeline and milestones of traditional
   methods with Agile's user stories to create a prioritized product backlog.
   Ensure high-value features are addressed early while aligning with project
   goals and milestones.

2. Iterative Development with Checkpoints: Work in sprints, delivering
   increments of the product. After each sprint or at predefined intervals,
   review progress against the high-level plan and milestones, making necessary
   adjustments.

3. Feedback and Refinement: After each release or demo, gather feedback and
   adjust the product backlog accordingly. Reprioritize based on evolving
   requirements, ensuring alignment with initial objectives.

4. Conclusive Phase: As the product nears its final release, conduct
   comprehensive testing and complete essential documentation, ensuring that the
   deliverable is robust and meets the set milestones.

# Chapter 7

**ERP Implementation activities**

1. Construction
2. Glue Code (GC)
3. Change Management
4. Deployment
5. Maintenance

`Lab-03 - PE 4-6 not difficult but long`

### Use Cases

Typically includes:

- Use case name
- Scenario
- Brief description
- actors
- Related use cases
- Stakeholders
- Preconditions
- Postconditions

Guideline for writing effective use cases

1. Write each set in form of subject-verb-direct object (and sometimes preposition-indirect object)
2. Make sure it is clear who the initiator of the step is
3. Write the steps form the perspective of the independent observer
4. Write each step at about the same level of abstraction
5. Ensure the use case has a sensible set of steps 
6. Apply KISS principals liberally
7. Write repeating instructions after the set of steps to be repeated


**Four types of actors**

1. Primary business actor
2. Primary system actor
3. External server actor
4. External receiver actor

### Use case diagrams

**Abstract use case** - use case that reduces redundancy in two or more other use cases by combining common steps found in both

**Depends on** - use case relationship that specify which other use cases must be performed before the current use case
`<<depends on>>`

## Use-Case Ranking and Priority Matrix

| Use-Case          | Priority | Business Value | Implementation Complexity | Rank |
|-------------------|----------|----------------|---------------------------|------|
| User Registration | High     | High           | Low                       | 1    |
| User Login        | High     | Medium         | Low                       | 2    |
| Data Backup       | Medium   | High           | High                      | 3    |
| Search Feature    | Low      | Medium         | Medium                    | 4    |
| User Profile Edit | Medium   | Low            | Low                       | 5    |

### Priority Levels:
- **High:** Must be implemented in the first release.
- **Medium:** Can be deferred to subsequent releases but is still important.
- **Low:** Can be deferred or might not be implemented depending on time and resources.

### Business Value:
- **High:** Critical for the business operations or revenue.
- **Medium:** Important but not critical.
- **Low:** Nice to have.

### Implementation Complexity:
- **High:** Requires significant effort and time.
- **Medium:** Requires a moderate amount of effort.
- **Low:** Can be implemented quickly with minimal effort.

### SSD System Sequence Diagram

A System Sequence Diagram (SSD) is a visual representation that depicts interactions between an external actor and the system under design. It provides a high-level view of the ordered sequence of interactions related to a specific use case scenario. The main objective is to illustrate the flow of messages in the system and how the system will respond to external events.

We are thinking about function calls in this notation, this step it where you begin to think about how your program is going to be written


#### Notation

In the context of SSDs, we are essentially mapping user or external system actions into system operations or function calls. This visualization step helps software designers and developers start thinking about the actual implementation.

- **Actor**: This is an external entity, often a user, that interacts with the system. It's represented by a "stick figure."
  
- **System**: This represents the system or software that's being designed. It's usually represented as a big rectangle.

- **Message**: Arrows pointing from the actor to the system denote function calls or messages sent to the system. These arrows are often annotated with conditions or iterative markers when needed.

- **Lifeline**: This is a dotted line that descends from each object, representing the object's existence over time.

- **Return Message**: Arrows pointing from the system back to the actor denote return values or messages sent from the system to the actor.

#### Example

Let's use a "User Login" scenario to help illustrate:

```
User System
| |
| login(username, password) |
|------------------->|
| |
| return success/failure |
|<-------------------|
| |
```

In the SSD above:

1. The "User" (actor) sends a `login` message (function call) to the system with the parameters `username` and `password`.
2. The system processes the message and sends back a return message indicating either a success or failure of the login operation.

#### Importance of SSDs

- **Design Thinking**: Helps developers think about the function signatures and potential parameters.
  
- **Communication**: Provides a clear communication tool among stakeholders, ensuring everyone understands the system's primary interactions.
  
- **Requirements Validation**: Acts as a validation step to ensure the system's design will meet the requirements.

- **Blueprint**: Acts as a blueprint for developers when they start implementing specific functionalities.

In summary, System Sequence Diagrams serve as an essential bridge between the high-level requirements and the detailed design, helping stakeholders envision how the system will operate.

## CRUD Matrix

| Entity/Functionality | Create | Read | Update | Delete |
|----------------------|--------|------|--------|--------|
| User Profile         |   X    |  X   |   X    |   X    |
| Orders               |   X    |  X   |   X    |   X    |
| Inventory            |   X    |  X   |   X    |        |
| Blog Posts           |   X    |  X   |   X    |   X    |
| Comments             |   X    |  X   |        |   X    |

Legend:
- **X**: Supported operation.
- (Empty Cell): Unsupported operation.

## Integrating Requirements Models

Use case Diagrams
- Use case descriptions
- Activity diagrams
- System sequence diagrams (ssd)

Domain model class diagram
- (SSD) System sequence diagrams
- State machine diagrams

# Chapter 9 - Architectural Context for Systems Development

**Dimensions of Enterprise Architecture**
- Business Architecture
- Data Architecture
- Application Architecture
- Technology Architecture

### Zachman Framework for Enterprise Architectures

- the Zachman Framework, in brief
- A well known mechanism for organizing Enterprise Architecture 
- Five actor roles: Planner, Owner, Designer, builder, subcontractor

# Zachman Framework

| Stakeholder / Abstraction | Data (What)                          | Process (How)                | Network (Where)                 | People (Who)                     | Time (When)                     | Motivation (Why)              |
|---------------------------|--------------------------------------|-----------------------------|--------------------------------|---------------------------------|--------------------------------|------------------------------|
| Planner (Scope)           | High-level data entities             | Business goals & strategies | Geographic locations & network | Organizational units & structure | Business events & cycles       | Business objectives           |
| Owner (Business Model)    | Business entities & relationships    | Business process diagrams   | Business logistics             | Roles & responsibilities         | Business schedules              | Business rules & regulations  |
| Designer (System Model)   | Logical data model                   | System functionality        | System architecture            | System user roles & interfaces  | System processing schedules    | System rationale & objectives |
| Builder (Technology Model)| Physical data schema                 | Technology processes        | Technology infrastructure      | Software components & modules   | System execution timing        | System constraints & limits   |
| Subcontractor (Detailed Representations) | Data tables & structures | Code & scripts            | Network configurations          | Interface designs               | Event-driven architectures     | Implementation justifications |
| Working System            | Actual data                          | Running applications       | Deployed network & servers     | Active users & sessions         | Real-time system clocks        | Active motivations & drivers  |

