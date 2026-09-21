# Quiz Score Transmuter

A simple Java console application that converts raw quiz scores into percentage scores and calculates the overall quiz average.

## Features

* Accepts **2 to 5 quizzes**
* Takes the **raw score** and **perfect score** for each quiz
* Converts each score into a percentage
* Displays the transmuted percentage of every quiz
* Calculates the overall quiz average
* Uses arrays, methods, loops, and `Scanner` input

## Formula

Each quiz score is converted using:

```text
Percentage = (Raw Score × 100) / Perfect Score
```

The program then calculates the average of all quiz percentages.

## Example

### Input

```text
Transmute, Compute % Quiz Average
How many quizzes(2..5)? 3

Enter Quiz RawScore and PerfectScore:
Example: 15 20 (no comma)

Quiz 1: 15 20
Quiz 2: 18 20
Quiz 3: 10 10
```

### Output

```text
Transmutation: Base 0
Quiz1: 15 / 20 = 75 %
Quiz2: 18 / 20 = 90 %
Quiz3: 10 / 10 = 100 %
Quiz Average: 88.333336%
```

## How to Run

Make sure Java is installed on your computer.

### 1. Clone the repository

```bash
git clone https://github.com/yourusername/quiz-score-transmuter.git
```

### 2. Open the project folder

```bash
cd quiz-score-transmuter
```

### 3. Compile the program

```bash
javac quizaverager.java
```

### 4. Run the program

```bash
java quizaverager
```

## Technologies Used

* Java
* Java Scanner
* Arrays
* Methods
* Loops

## Project Purpose

This project was created to practice basic Java programming concepts such as user input, arrays, methods, loops, calculations, and program organization.

## Author

**Clint Joshua C. Estinopo**
