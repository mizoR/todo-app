package todo_app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import todo_app.dao.TaskDao;
import todo_app.models.Task;
import todo_app.view_decorators.ViewDecoratorFactory;

@Controller
public class TasksController {

    @Autowired
    TaskDao taskDao;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        ViewDecoratorFactory<Task> decoratorFactory = new ViewDecoratorFactory<>();
        List<Task> tasks = taskDao.findAll();

        model.addAttribute("tasks", decoratorFactory.create(tasks));

        return "index";
    }

}
