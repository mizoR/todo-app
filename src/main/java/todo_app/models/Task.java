package todo_app.models;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Task extends Model {
    int id;
    String summary;
    Date createdAt;
    Date updatedAt;

    @Override
    public int getPrimaryKey() {
        return getId();
    }
}
