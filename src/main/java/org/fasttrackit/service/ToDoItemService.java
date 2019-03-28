package org.fasttrackit.service;

import org.fasttrackit.domain.ToDoItem;
import org.fasttrackit.persistence.ToDoItemRepository;
import org.fasttrackit.transfer.SaveToDoItemRequest;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.TooManyListenersException;

public class ToDoItemService {
    private  ToDoItemRepository toDoItemRepository= new ToDoItemRepository();

    public ToDoItemService() throws SQLException, IOException, ClassNotFoundException {
    }

    public void  createToDoItem(SaveToDoItemRequest request) throws SQLException, IOException, ClassNotFoundException {
        System.out.println("Creating item:" + request);
         toDoItemRepository.creatToDoItem(request);
    }

    public List<ToDoItem> getToDoItems() throws IOException, SQLException, ClassNotFoundException {
        System.out.println("Getting to do items.");
        return toDoItemRepository.getToDoItems();
    }

    public void deleteToDoItem(long id) throws SQLException, IOException, ClassNotFoundException {
        System.out.println("Deleting to do item" + id);
        toDoItemRepository.deleteToDoItem(id);
        System.out.println("Deleted to do item" + id);
    }

}
