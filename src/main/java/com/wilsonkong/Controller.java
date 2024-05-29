package com.wilsonkong;

public class Controller {

    private View view;
    private Model model;

    public Controller() {
        this.view = new View();
        this.model = new Model();
    }

    public void run() {
        while (true) {
            processInput();
            redraw();
            this.model.sortByValue();
            System.out.println("sorted.");
            redraw();
        }
    }

    public void redraw() {
        this.view.redraw(this.model.getTasks());
    }

    public void processInput() {
        String wholeTask = this.view.prompt();
        String[] splited = wholeTask.split(",");
        this.model.addTasks(splited[0].strip(), Integer.parseInt(splited[1].strip()));
    }
}
