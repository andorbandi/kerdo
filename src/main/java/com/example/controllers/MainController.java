package com.example.controllers;

import java.util.List;

import com.example.models.FileDataSource;
import com.example.models.Task;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class MainController {

    @FXML
    private RadioButton answer1;

    @FXML
    private RadioButton answer2;

    @FXML
    private RadioButton answer3;

    @FXML
    private RadioButton answer4;

    @FXML
    private ToggleGroup answers;

    @FXML
    private TextField idField;

    @FXML
    private TextField questionField;

    @FXML
    void checkAnswer(ActionEvent event) {

    }

    @FXML
    void nextQuestion(ActionEvent event) {

    }

    @FXML
    void previousQuestion(ActionEvent event) {

    }

    List<Task> taskList;
    @FXML
    void initialize() {
        loadData();
    }

    void loadData() {
        FileDataSource file = new FileDataSource();
        taskList = file.readData();
        if (!taskList.isEmpty()) {
            loadTask(0);
        }
    }

    void loadTask(int index) {
        Task task = taskList.get(index);
        idField.setText(task.getId());
        questionField.setText(task.getQuestion());
        answer1.setText(task.getAnswer1());
        answer2.setText(task.getAnswer2());
        answer3.setText(task.getAnswer3());
        answer4.setText(task.getAnswer4());
    }

}
