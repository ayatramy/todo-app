# To-Do App

A simple console-based task management application built with Java. It allows users to add tasks, view their task list, mark tasks as completed, and delete tasks they no longer need.

## Features

- **Add Tasks:** Add new tasks by entering their titles.
- **View All Tasks:** Display all tasks along with their completion status.
- **Mark Tasks as Completed:** Mark a selected task as done.
- **Delete Tasks:** Remove tasks by selecting their task numbers.
- **Input Validation:** Handles non-numeric input, invalid menu choices, and invalid task numbers without crashing.
- **Interactive Menu:** Navigate through the application using a numbered menu.

## Technologies Used

- Java
- `ArrayList` for storing tasks.
- `Scanner` for reading user input.
- Object-Oriented Programming (OOP).

## Requirements

- Java Development Kit (JDK) 17 or later.
- A terminal or command prompt.

## How to Run

1. Install JDK 17 or a newer version.
2. Clone or download this repository.
3. Open a terminal in the project directory containing `Main.java` and `Task.java`.
4. Compile the source files:

   ```bash
   javac Task.java Main.java
   ```

5. Run the application:

   ```bash
   java Main
   ```

## Menu Options

The application provides the following options:

```text
1. Add task
2. Show tasks
3. Mark task as done
4. Delete task
0. Exit
```

Enter the corresponding number to select an option.

## Example Output

The following example illustrates a typical interaction with the application:

```text
1. Add task
2. Show tasks
3. Mark task as done
4. Delete task
0. Exit
1
Enter title:
Study Java
1. Add task
2. Show tasks
3. Mark task as done
4. Delete task
0. Exit
2
1. Study Java [ ]
1. Add task
2. Show tasks
3. Mark task as done
4. Delete task
0. Exit
3
Enter task number:
1
1. Add task
2. Show tasks
3. Mark task as done
4. Delete task
0. Exit
2
1. Study Java [done]
1. Add task
2. Show tasks
3. Mark task as done
4. Delete task
0. Exit
0
Bye
```

## Current Limitations

- Tasks are stored in memory and are not saved after the application closes.
- The application uses a console-based interface.

## Future Improvements

- Save tasks to a file so they persist between sessions.
- Add task priorities and due dates.
- Improve task display and user interaction.

## Author

Ayat-Allah Ramy