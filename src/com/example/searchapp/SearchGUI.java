package com.example.searchapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.Arrays;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
//import org.controlsfx.control.textfield.TextFields;

public class SearchGUI extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create UI components
        TextField searchField = new TextField();
        searchField.setPromptText("Enter search keywords");

//        // Set up autocomplete (make sure to include ControlsFX in your project dependencies)
//        TextFields.bindAutoCompletion(searchField, "Example 1", "Example 2", "Example 3");

        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll("Filter 1", "Filter 2", "Filter 3");
        comboBox.setPromptText("Select Filter");

        Button searchButton = new Button("Search");
        TableView<SearchResult> tableView = new TableView<>();
        setUpTableView(tableView);

        ListView<String> resultList = new ListView<>();

        // Layout
        VBox layout = new VBox(10); // 10 is the spacing between elements
        layout.getChildren().addAll(searchField, comboBox, searchButton, tableView, resultList);

        // Set up the button click action
        searchButton.setOnAction(event -> {
            String query = searchField.getText();
            String filter = comboBox.getValue();
            resultList.getItems().clear(); // Clear previous results
            resultList.getItems().addAll(search(query)); // Assume search returns a List<String>
            updateTable(tableView, query, filter);
        });

        // Set the scene
        Scene scene = new Scene(layout, 300, 500);
        primaryStage.setTitle("Search Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void setUpTableView(TableView<SearchResult> tableView) {
        TableColumn<SearchResult, String> resultColumn = new TableColumn<>("Results");
        resultColumn.setCellValueFactory(new PropertyValueFactory<>("result"));
        tableView.getColumns().add(resultColumn);
    }

    private void updateTable(TableView<SearchResult> tableView, String query, String filter) {
        ObservableList<SearchResult> data = FXCollections.observableArrayList(
                new SearchResult("Filtered Result 1"),
                new SearchResult("Filtered Result 2")
        );
        tableView.setItems(data);
    }

    private List<String> search(String query) {
        // Dummy data, replace with call to your search service
        return Arrays.asList("Result 1", "Result 2", "Result 3");
    }

    public static void main(String[] args) {
        launch(args);
    }
}