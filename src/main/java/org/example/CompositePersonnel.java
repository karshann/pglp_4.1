package org.example;

import java.util.ArrayList;
import java.util.List;

public class CompositePersonnel implements Composite {
    /**
     *
     */
    private List<Composite> enfantComposite = new ArrayList<Composite>();

    /**
     *
     */
    @Override
    public void print() {
        for (Composite composite : enfantComposite) {
            composite.print();
        }
    }

    /**
     *
     * @param composite
     */
    public void add(Composite composite) {
        enfantComposite.add(composite);
    }

    /**
     *
     * @param composite
     */
    public void remove(Composite composite) {
        enfantComposite.remove(composite);
    }
}
