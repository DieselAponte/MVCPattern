package controllers;

import core.Controller;
import views.Blank2View;

public class Blank2Controller extends Controller {
    private Blank2View blank2View;

    @Override
    public void run() {
        blank2View = new Blank2View(this);
    }

    public Blank2View getView() {
        return blank2View;
    }
}
