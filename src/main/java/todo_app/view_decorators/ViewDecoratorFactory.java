package todo_app.view_decorators;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import todo_app.models.Model;

@Component
public class ViewDecoratorFactory<M extends Model> {

    public ViewDecorator<M> create(M model) {
        return new ViewDecorator<M>(model);
    }

    public List<ViewDecorator<M>> create(List<M> models) {
        return models.stream().map(m -> create(m)).collect(Collectors.toList());
    }
}
