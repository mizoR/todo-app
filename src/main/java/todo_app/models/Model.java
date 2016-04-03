package todo_app.models;

abstract public class Model {
    abstract public int getPrimaryKey();

    public String getModelName() {
        return getClass().getSimpleName();
    }
}
