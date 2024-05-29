package com.wilsonkong;

import java.util.Map;
import java.util.Scanner;

public class View {

    private Scanner scanner = new Scanner(System.in);

    // public View() {
    //     this.scanner = new Scanner(System.in);
    // }

    public String prompt() {
        System.out.println("Please enter a task to be added. (Task, Priority)");
        String wholeTask = scanner.nextLine();

        return wholeTask;
    }

    public void redraw(Map<String, Integer> tasks) {
        String output = "Task name, Priority.\n";
        for (Map.Entry<String, Integer> task : tasks.entrySet()) {
            String taskName = task.getKey();
            int priority = task.getValue();
            output += taskName + ", " + Integer.toString(priority) + "\n";
        }
        System.out.println(output);
    }
}
