package demo.mohinh_MVC.view;

import demo.mohinh_MVC.controller.StudentController;

public class Main {
    public static void main(String[] args) {
        StudentController studentController =new StudentController();
        studentController.displayMenu();
    }
}
