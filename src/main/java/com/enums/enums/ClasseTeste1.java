package com.enums.enums;

import com.enums.EnumsPlanetas;

public class ClasseTeste1 {
    EnumsPlanetas planeta;

    ClasseTeste1(String planeta) {
        this.planeta = EnumsPlanetas.valueOf(planeta);

    }

    public void viajarPlaneta() {
        switch (planeta) {
            case MERCURIO:
                System.out.println("Quente po lá");
                break;
            case TERRA:
                System.out.println("Já estamos aqui!");
            default:
                System.out.println("Planeta não encontrado!");
                break;
        }
    }
}
