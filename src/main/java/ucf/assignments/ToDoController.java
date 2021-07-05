package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class ToDoController
{
    @FXML private ListView myListView;

    // ObservableList is a List
    protected ObservableList<String> list;

    @FXML
    public void getList(KeyEvent keyEvent)
    {
        //If key pressed is enter
            //Get text from app
            //Check if lists exists in masterMap with getList()
                //If exists, display
                //return
            //newList(text)
            //Display newList
    }

    public ToDoList newList(String title)
    {
        //Create new empty list
        //Add to masterMap
        return null;
    }

    @FXML
    public void deleteCurrent(MouseEvent mouseEvent)
    {
        //Set view list to null/empty
        //Delete list from masterMap
    }

    @FXML
    public void newTask(MouseEvent mouseEvent)
    {
        //Get current description from app
            //If task with desc exists, add 1 to check
            //If null, return and do not create
        //Get selected date from app
            //If task with date exists, add 1 check
            //If null, return and do not create
        //If check is 2
            //return
        //addItem(desc, date)
        //Update viewer
    }

    @FXML
    public void filterComplete(MouseEvent mouseEvent)
    {
        //Send mode 1 to displayList
        //Update viewer
    }

    @FXML
    public void filterUncompleted(MouseEvent mouseEvent)
    {
        //Send mode 2 to displayList
        //Update viewer
    }

    @FXML
    public void showAll(MouseEvent mouseEvent)
    {
        //Send mode 0 to displayList
        //Update viewer
    }

    @FXML
    public void importList(ActionEvent actionEvent)
    {
        //Open dialog box
        //Get user location for list import
        //Read first line as list title and create newList

        //Assuming (task description,date) format....

        //While EOF
            //Read strings by line
            //Separate into two string by comma
            //Create Task with date and desc
            //Add task to newList
        //Update viewer
    }

    @FXML
    public void exportList(ActionEvent actionEvent)
    {
        //Create file variable that will be stored in resources
        //Open file writer
        //Get current list displayed

        //For loop through toDoList
            //toString() current element
            //Print string to file
        //close file writer
    }
}
