package todo_app.view_decorators;

import lombok.Value;
import todo_app.models.Model;
import todo_app.views.utils.UrlHelper;

@Value
public class ViewDecorator<M extends Model> {

    private final M model;

    public ViewDecorator(M model) {
        this.model = model;
    }

    public String getUrl() {
        return UrlHelper.url_for(model);
    }
}
