// Reneau Augusma
// COP 3330, Spring 2020
// Programming Assignment 4 - Problem 1

import java.io.*;
import java.util.*;

public class DuplicateRemover
{
    private List<String> uniqueWords;

    public DuplicateRemover()
    {
        this.uniqueWords = new ArrayList<>();
    }

    public void remove(String dataFile)
    {
        Set<String> removeDuplicates = new HashSet<>();
        Scanner input = null;

        try
        {
            input = new Scanner(new File(dataFile));

            while (input.hasNext())
                removeDuplicates.add(input.next());
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        finally
        {
            uniqueWords.addAll(removeDuplicates);
            input.close();
        }
    }

    public void write(String outputFile)
    {
        BufferedWriter output;
        try
        {
            output = new BufferedWriter(new FileWriter(outputFile));

            for (String s : uniqueWords)
                output.write(s + "\n");

            output.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
