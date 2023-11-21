package org.hbrs.se1.ws23.uebung4_2;

import org.hbrs.se1.ws23.uebung3.persistence.PersistenceStrategy;
import org.hbrs.se1.ws23.uebung3.persistence.PersistenceStrategyStream;
import org.hbrs.se1.ws23.uebung4_2.controller.InputDialog;
import org.hbrs.se1.ws23.uebung4_2.model.ContainerGeneric;
import org.hbrs.se1.ws23.uebung4_2.model.UserStory;

public class Main {
    public static void main(String[] args) {
        ContainerGeneric<UserStory> c = ContainerGeneric.getInstance();

        PersistenceStrategy<UserStory> stream = new PersistenceStrategyStream<>();
        c.setPersistenceStrategy(stream);


        InputDialog i = new InputDialog();
        i.input();
    }
}