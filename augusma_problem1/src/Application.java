// Reneau Augusma
// COP 3330, Spring 2020
// Programming Assignment 4 - Problem 1

public class Application
{
    public static void main(String[] args)
    {
        DuplicateRemover program = new DuplicateRemover();
        program.remove("problem1.txt");
        program.write("unique_words.txt");
    }
}
