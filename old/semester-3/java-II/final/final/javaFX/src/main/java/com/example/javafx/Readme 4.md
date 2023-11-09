# Multithreading

Multithreading is the ability of a program or an operating system to enable
more than one user at a time without requiring multiple copies of the program running on the computer.

## Concurrency

Concurrency is the ability of different parts or units of a program, algorithm, or problem to be
executed out-of-order or in a partial order without affecting the final outcome. This allows for parallel
execution of the concurrent units, which can significantly improve the overall speed of the execution
in multi-processor and multi-core systems.

**Professor definition:**
If we have multiple threads / a program having multiple task that are progressing simultaneously
then we say that those task / threads they are running concurrently

If they are making progress at the same time its concurrently

Running simultaneously parallelism

## Parallelism

Parallelism about multiple tasks or subtasks of the same task that literally run at the same time
on a piece of hardware with multiple computing resources like multi-core processor

## Life cycle of a thread

- New
  - Runnable
    - Waiting
    - Time waiting
    - Blocked
    - Terminated (Dead)

```
New (Program Starts a thread)
  Runnable (Wait Sleep) -> Timed Waiting
  Runnable (Wait) -> Waiting
  Runnable (Task completes) -> Terminated
  Runnable ( Enter Synchronized Statement / issue I/O request ) -> Blocked

  Waiting ( notify / notify all ) -> Runnable

  Timed Waiting (interval expires / notify / notify all) -> Runnable

  Blocked (interrupt / I/O completes) -> Runnable
Terminated
```
