package todo_app.views.utils;

import org.atteo.evo.inflector.English;
import org.springframework.stereotype.Component;

import todo_app.models.Model;

@Component
public class UrlHelper {
    public static String url_for(Model model) {
        String resourceName = English.plural(model.getModelName().toLowerCase());
        return "/" +  resourceName + "/" + model.getPrimaryKey();
    }
}
