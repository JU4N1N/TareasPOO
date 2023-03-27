package org.example;

public class tarea {
    private int agua;
    private int cafe;
    private int crema;
    private int vaso;

    public tarea() {
    }


    public tarea(int agua, int cafe, int crema, int vaso) {
        this.agua = agua;
        this.cafe = cafe;
        this.crema = crema;
        this.vaso = vaso;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        if(agua <= 5000) {
            this.agua = agua;
        }else{
            System.out.println("Lo siento pero la máquina no acepta esa cantidad de agua");
        }
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        if(cafe <= 1000) {
            this.cafe = cafe;
        }else{
            System.out.println("Lo siento pero la máquina no acepta esa cantidad de café");
        }
    }

    public int getCrema() {
        return crema;
    }

    public void setCrema(int crema) {
        if(crema <= 1500) {
            this.crema = crema;
        }else{
            System.out.println("Lo siento pero la máquina no acepta esa cantidad de crema");
        }
    }

    public int getVaso() {
        return vaso;
    }

    public void setVaso(int vaso) {
        if(vaso <= 50) {
            this.vaso = vaso;
        }else{
            System.out.println("Lo siento pero la máquina no acepta esa cantidad de vasos");
        }
    }

    @Override
    public String toString() {
        return "Main{" +
                "agua=" + agua +
                ", cafe=" + cafe +
                ", crema=" + crema +
                ", vaso=" + (vaso) +
                '}';
    }

    public void Americano(){
        System.out.println("La máquina cuenta con " + agua + " ml de Agua, " + cafe + " g de café, " + crema + " ml de crema y " + vaso + " vasos");
        if(agua <= 100){
            System.out.println("Lo siento la máquina no tiene sufiencientes recursos, regresa mañana");
        } else if (cafe <= 14) {
            System.out.println("Lo siento la máquina no tiene sufiencientes recursos, regresa mañana");
        } else if (crema <= 70) {
            System.out.println("Lo siento la máquina no tiene sufiencientes recursos, regresa mañana");
        } else if (vaso == 0) {
            System.out.println("Lo siento la máquina no tiene sufiencientes recursos, regresa mañana");
        }else{
            System.out.println("Preparando...");
            int ame = agua - 180;
            int ame2 = cafe -15;
            int ame3 = vaso - 1;
            System.out.println("Tú café está listo (:");
            System.out.println("Ahora los valores son " + ame + " de agua, " + ame2 + " de café, " + crema + " de crema y " + ame3 + " vasos.");
        }
    }


    public void Expreso(){
        System.out.println("La máquina cuenta con " + agua + " ml de Agua, " + cafe + " g de café, " + crema + " ml de crema y " + vaso + " vasos");
        if(agua <= 100){
            System.out.println("Lo siento la máquina no tiene sufiencientes recursos, regresa mañana");
        } else if (cafe <= 14) {
            System.out.println("Lo siento la máquina no tiene sufiencientes recursos, regresa mañana");
        } else if (crema <= 70) {
            System.out.println("Lo siento la máquina no tiene sufiencientes recursos, regresa mañana");
        } else if (vaso == 0) {
            System.out.println("Lo siento la máquina no tiene sufiencientes recursos, regresa mañana");
        }else{
            System.out.println("Preparando...");
            int exp1 = agua - 120;
            int exp2 = cafe -20;
            int exp3 = vaso - 1;
            System.out.println("Tú café está listo (:");
            System.out.println("Ahora los valores son " + exp1 + " de agua, " + exp2 + " de café, " + crema + " de crema y " + exp3 + " vasos.");
        }
    }

    public void Capuchino(){
        System.out.println("La máquina cuenta con " + agua + " ml de Agua, " + cafe + " g de café, " + crema + " ml de crema y " + vaso + " vasos");
        if(agua <= 100){
            System.out.println("Lo siento la máquina no tiene sufiencientes recursos, regresa mañana");
        } else if (cafe <= 14) {
            System.out.println("Lo siento la máquina no tiene sufiencientes recursos, regresa mañana");
        } else if (crema <= 70) {
            System.out.println("Lo siento la máquina no tiene sufiencientes recursos, regresa mañana");
        } else if (vaso == 0) {
            System.out.println("Lo siento la máquina no tiene sufiencientes recursos, regresa mañana");
        }else{
            System.out.println("Preparando...");
            int cap1 = agua - 100;
            int cap2 = cafe -14;
            int cap3 = crema - 70;
            int cap4= vaso - 1;
            System.out.println("Tú café está listo (:");
            System.out.println("Ahora los valores son " + cap1 + " de agua, " + cap2 + " de café, " + cap3 + " de crema y " + cap4 + " vasos.");
        }
    }
}
