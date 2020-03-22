// Reneau Augusma
// COP 3330, Spring 2020
// Programming Assignment 4 - Problem 2

import java.io.*;
import java.util.*;

public class DuplicateCounter
{
    private Map<String, Integer> wordCounter;

    public DuplicateCounter()
    {
        this.wordCounter = new HashMap<>();
    }

    public void count(String dataFile)
    {
        Scanner input = null;
        List<String> words = new ArrayList<>();

        try
        {
            input = new Scanner(new File(dataFile));

            while (input.hasNext())
                words.add(input.next());

            for (String s : words)
            {
                if (wordCounter.containsKey(s))
                    wordCounter.put(s, wordCounter.get(s) + 1);

                else
                    wordCounter.put(s, 1);
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        finally
        {
            input.close();
        }
    }

    public void write(String outputFile)
    {
        BufferedWriter output;

        try
        {
            output = new BufferedWriter(new FileWriter(outputFile));

            for (Map.Entry<String, Integer> pair : wordCounter.entrySet())
                output.write("Word: " + pair.getKey() + ", Times Occurred: " + pair.getValue() + "\n");

            output.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
