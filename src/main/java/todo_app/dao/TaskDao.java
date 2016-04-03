package todo_app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import todo_app.models.Task;

@Component
public class TaskDao {
    private static RowMapper<Task> ROW_MAPPER = new BeanPropertyRowMapper<>(Task.class);

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Task> findAll() {
        return jdbcTemplate.query("SELECT * FROM tasks", ROW_MAPPER);
    }
}
