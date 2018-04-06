package at.RefugeesCode.my_list_to_do.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Todo {
    @Id
    private String id;
    private String task;

    public void setId(String id) {
        this.id = id;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    private Boolean done;


    public String getId() {
        return id;
    }

    public String getTask() {
        return task;
    }

    public Boolean getDone() {
        return done;
    }
    public Todo (String task,Boolean done){
        this.task=task;
        this.done=done;
    }


}
