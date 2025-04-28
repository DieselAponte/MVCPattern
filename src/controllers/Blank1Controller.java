package controllers;

import core.Controller;
import views.Blank1View;

public class Blank1Controller extends Controller {
    private Blank1View blank1View;

    @Override
    public void run() {
        blank1View = new Blank1View(this);
        // ❌ NO hacer addView aquí
    }

    public Blank1View getView() {
        return blank1View;
    }
}
