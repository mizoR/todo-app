package todo_app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import todo_app.dao.TaskDao;
import todo_app.models.Task;
import todo_app.view_decorators.ViewDecoratorFactory;

@Controller
public class TasksController {

    @Autowired
    TaskDao taskDao;

    @Autowired
    ViewDecoratorFactory<Task> decoratorFactory;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        List<Task> tasks = taskDao.findAll();

        model.addAttribute("tasks", decoratorFactory.create(tasks));

        return "tasks/index";
    }

    @RequestMapping(value = "/tasks/{id:^[1-9][0-9]*$}", method = RequestMethod.GET)
    public String show(@PathVariable int id, Model model) {
        Task task = taskDao.find(id);

        model.addAttribute("task", decoratorFactory.create(task));

        return "tasks/show";
    }

}
