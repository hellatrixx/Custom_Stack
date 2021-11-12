package com.company;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int maxSize = Integer.parseInt(sc.nextLine());
        Stack newStack = new Stack(maxSize);
       //Matcher looks for patterns in the scanned string (\\n+ is 0-9 with one or more)
        for (int i = 0; i < maxSize; i++) {
            Matcher m = Pattern.compile("-?\\d+").matcher(sc.nextLine());
            String group = m.find() ? m.group() : null;
            //if m.find() is true then m.group() runs, if not group is null
            if(group == null) {
                //if group is null aka the there is no number therefore the input is POP
                if (!newStack.isEmpty())
                    newStack.pop();
            }
            else
                newStack.push(Integer.parseInt(group));

        }
        if(newStack.isEmpty())
            System.out.println("empty");
        else
            for (int i = 0; i < maxSize; i++)
                System.out.println(newStack.pop());
    }

}
