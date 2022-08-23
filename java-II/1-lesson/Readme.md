# Lesson 1 Java II

**Week one lecture day 1 of 2**

In this lecture we created a number of java programs to demonstrate reading and writing different data to files.
- Writing / Reading
  - Binary
  - Random Access file
  - Bank account class

### Important Java objects and imports used:
- java.io
  - FileOutputStream
  - FileInputStream

These imported objects include methods such as:
- writeInt()
  - public final void writeInt():
  - Writes an into to the underlying output stream as four bytes, high byte first. If no exeception is thrown, the counter written is incremented by 4

```java
  FileOutputStream fos = new FileOutputStream("binary.dat");
  DataOutputStream outputFile = new DataOutputStream(fos);

  // Write the array to the binary file
  for (int i = 0; i < array.length; i++) {
      outputFile.writeInt(array[i]);
  }
```

**Similar methods:**
- write()
- writeBoolean()
- writeByte / writeBytes
- Char / Chars
- Double & Float
- Long & Short
- UTF

**Note** All of the functions start with write so Char would be writeChar


## Reading data from the file
- Similar to writing data we used a FileInputStream and DataInputStream object to view the data we wrote to a file
- A while loop with nested try catch was used to read data from our binary output file

```java
  // eof is end of file
  while (!eof) {
      try {
          num = inputStream.readInt();
          System.out.println(num + " ");
      } catch (EOFException e) {
          eof = true;
      }

  }
```

**Random Access File**

```java
// uses the RandomAccessFile object which takes two parameters
// the rw stands fro read and write
RandomAccessFile raf = new RandomAccessFile("letters.dat", "rw");
```
