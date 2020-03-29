package org.example;

import java.time.LocalDateTime;

public enum Applicationmain {
    APPLICATION;

    public void run(String [] args){
        Personnel p1 = new Personnel
                .Builder("P1", "P1")
                .Telephone("+23333333").Naissance(LocalDateTime.of(1912,12,12,12,12)).Fonction("salariéYYY")
                .build();
    }
    public static void main(String [] args)
    {
        APPLICATION.run(args);
    }
}
