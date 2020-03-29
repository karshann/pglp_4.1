package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;

public final class Personnel implements Composite {
    private final String nom;
    private final String prenom;
    private final String fonction;
    private final LocalDateTime naissance;
    private final ArrayList<String> telephone;

    private Personnel(Builder builder) {
        //Required
        nom = builder.nom;
        prenom = builder.prenom;

        //Optional
        naissance = builder.naissance;
        telephone =new ArrayList<String>();
        fonction = builder.fonction;
    }

    @Override
    public void print() {
        System.out.println("Nom " + this.nom);
    }

    public static class Builder {
        //Required
        private final String nom;
        private final String prenom;

        //Optional
        private LocalDateTime currentTime = LocalDateTime.now();
        private LocalDateTime naissance = currentTime.withDayOfMonth(1).withYear(1990).withMonth(1);
        private ArrayList<String> telephone=new ArrayList<String>();
        private String fonction;

        public Builder(String nom, String prenom) {
            this.nom = nom;
            this.prenom = prenom;
        }

        public Builder naissance(LocalDateTime naissance) {
            naissance = naissance;
            return this;
        }

        public Builder telephone(String phone) {
            this.telephone.add(phone);
            return this;
        }

        public Builder fonction(String fonction) {
            this.fonction=fonction;
            return this;
        }

        public Personnel build() {
            return new Personnel(this);
        }

    }

}