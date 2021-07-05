package ucf.assignments;

import javafx.fxml.FXML;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class ToDoController
{
    @FXML
    public void getList(KeyEvent keyEvent)
    {
        //If key pressed is enter
            //Get text from app
            //Check if lists exists in masterMap
                //If exists, display
                //return
            //Create new empty list
            //Display list
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
            //If exists, add 1 to check
            //If null, return and do not create
        //Get selected date from app
            //If exists, add 1 check
            //If null, return and do not create
        //If check 2
            //return
        //Create new undone task with date and description
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
}
