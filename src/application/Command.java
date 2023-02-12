package application;

import javafx.scene.Group;

public interface  Command {
    public void Execute(Polygones P1, Polygone Pselectionne,  Group root);
    public void coller(Polygones P , Group root);

}
