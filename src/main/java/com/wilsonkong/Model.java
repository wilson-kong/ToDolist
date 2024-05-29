package com.wilsonkong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Model {
    Map<String, Integer> taskList;

    public Model() {
        this(new HashMap<>());
    }

    public Model(Map<String, Integer> tasks) {
        this.taskList = tasks;
    }

    public void addTasks(String taskName, int priority) {
        this.taskList.put(taskName, priority);
    }

    public Map<String, Integer> getTasks() {
        return this.taskList;
    }

    public void sortByValue() {
        List<Entry<String, Integer>> list = new ArrayList<>(this.taskList.entrySet());
        list.sort(Entry.comparingByValue());
        Collections.reverse(list);


        Map<String, Integer> result = new LinkedHashMap<>();
        for (Entry<String, Integer> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

        this.taskList = result;
    }

    @Override
    public String toString() {
        String output = "Task name, Priority.\n";
        for (Map.Entry<String, Integer> task : this.taskList.entrySet()) {
            String taskName = task.getKey();
            int priority = task.getValue();
            output += taskName + ", " + Integer.toString(priority) + "\n";
        }
        return output;
    }

}

