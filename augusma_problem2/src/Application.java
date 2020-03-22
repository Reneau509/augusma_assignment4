// Reneau Augusma
// COP 3330, Spring 2020
// Programming Assignment 4 - Problem 2

public class Application
{
    public static void main(String[] args)
    {
        DuplicateCounter program = new DuplicateCounter();
        program.count("problem2.txt");
        program.write("unique_word_counts.txt");
    }
}
