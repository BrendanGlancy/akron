# Java Collections

In C++ Collections are know as templates

## Java Collections Hierarchy

![java-collection-hierarchy](https://user-images.githubusercontent.com/61941978/195114400-945500da-83f4-4bb3-9297-c208060e9528.png)

### Types of Colletions in Java:

- List
  - LinkedList
    - Deque
      - ArrayDeque
  - Vector
  - Stack
- Queue
  - PriorityQueue
- Set
  - HashSet
  - LinkedHashSet

Stack - Last In First out LIFO
Queue - First in First Out FIFO

The three types of collection we will talk about in JavaII

| Set           | List       | Map                     |
| ------------- | ---------- | ----------------------- |
| HashSet       | ArrayList  | HashMap                 |
| LinkedHashSet | LinkedList | LinkedHashMap           |
| TreeSet       | Vector     | HashTable, and Tree Map |

## Mechanism of using an iterator

![java-iterator](https://user-images.githubusercontent.com/61941978/195114467-039c1a68-a2da-4191-96e2-26fb15f78aed.png)

## Map interface

We now take a look at the Map interface, one which oddly enough has no relation to the Collection interface. A Collection operates on one entity, while a Map operates on two: a unique key, e.g. a vehicle identification number, and an object related to the key, e.g. a car. To retrieve an object from a Map, you would normally use its key. Map is the root of quite a number of interfaces and classes, as depicted in Figure 2.

Hashtable, Hashmap, and LinkedHashMap
The Hashtable class was the first Collection in Java 1 that was based on the hash-table data structure. Unfortunately, like Vector, the class is deprecated because of its suboptimal performance. We can forget about it and use the other Map implementations instead. HashMap is the default implementation that you will find yourself using in most cases.

A Map usually doesn’t make any guarantee as to how it internally stores elements. An exception to this rule, however, is LinkedHashMap, which allows us to iterate the map in the order of insertion.

![map-interface-1](https://user-images.githubusercontent.com/61941978/196856560-8bdec379-34a3-4eb8-82ab-966e776bc351.png)

---

# Test Prep

Tuesday, Oct. 25, 2022 in POL 222 during class time. It will cover the following material: Chapters 13, 14 and Sections 1 thru 4 in Chapter 18. It will be all multiple choice.

## Chapter 13, Advance JavaFX Controls

- Styling JavaFX Applications with CSS
  ```java
    label.setStyle("-fx-font-size: 24px; -fx-text-fill: red;");
    button.setStyle("-fx-font-size: 24px; -fx-text-fill: blue;");
  ```
- RadioButton Controls
  - RadioButton(): creates a radiobutton with an empty string
  - getText(): returns the textLabel for radio button
  - isSelected() returns a bool which indicates whether a button is selected or not
  - setSelected() sets whether a radiobutton is selected or not
  - setToggleGroup sets the toggle group for the radiobutton
  - fire() toggle the state of the radio button if and only if the RadioButton has not already been selected or is not part of a ToggleGroup
- Checkbox Controls

  ```java
  import javafx.scene.control.CheckBox;

  CheckBox checkBox = new CheckBox("someValue");
  ```

- ListView Controls

  ```java
  import javafx.scen.control.ListView;

  ListView<String> listView = new ListView<String>();
  ```

- ComboBox Controls

  ```java
  import javafx.scene.control.ComboBox;

  ComboBox<String> comboBox = new ComboBox<String>();
  ```

- Slider Controls
- TextArea Controls
- Menus
  ```java
  import javafx.scene.control.Menu;
  import javafx.scene.control.MenuBar;
  import javafx.scene.control.MenuItem;
  import javafx.scene.control.RadioMenuItem;
  import javafx.scene.control.CheckMenuItem;
  ```
  - addAll adds all items to a menu
  - hide() and show()
  - getItems() returns the items of the menu
- The FileChooser Class

## Chapter 14, JavaFX, Graphics, Effects, and Media

- Drawing Shapes
  - Example import
  ```java
  import javafx.scene.shape.Circle
  ```
  - Basically you import the shape and then define its dimesions
- Animations
  ```java
  import javafx.animation.TranslateTransition;
  ```
  - TranslateTransition takes a duration argument and shape
  - getStartFromX and getStartFromY take a starting position
  - setToX and setToY sets the ending position
- Effect
- Playing Sound Files
  - For media files including playing a video
  ```java
  import javafx.scene.media.Media;
  import javafx.scene.media.MediaPlayer;
  ```
- Playing Videos
  - Methods for both:
    - play()
    - pause()
    - stop()
- Handling Key Events
- Handling Mouse Events

  - Mouse and Key events in JavaFX are handled in similar ways
  - EventHandler<MouseEvent>
  - EventHandler<KeyEvent>

  ```java
    // example of an event handling a button click
    Button button = new Button("Click me");

    button.setOnAction(event -> {
        int count = Integer.parseInt(label.getText());
        count++;
        label.setText(Integer.toString(count));
      });
  ```

- Common Errors to Avoid

# Chapter 18, Collection and the Stream API

- Introduction to the Java Colletions Framework
  - Iterating a collection
  - Java Functional Interfaces
- Lists
  - List in java provides the facility to main the ordered collection
  - Contains methods to insert, update, delete, and search the elements
- Sets
  - The set interface is present in the java.util package
  - This interface contains the method inherited form the collection interface and adds a feature that restricts the insertion of duplicate elements.
  - There are two interfaces that extent the set implementation SortedSet and NavigableSet
- Maps
  - Contain a key and a value
  - Subtype of the Collection interface behaves differently from the rest of colletion types, A map contains unique keys
