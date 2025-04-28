package core;

public interface Model {
    void attach(View view); //Attaches an observer in the model
    void detach(View view); //Detaches a view from the model
    void notifyViews(); //Notify all attached views in the model
}
