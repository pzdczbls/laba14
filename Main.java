package com.company;
class SuperHero{
    private static SuperHero SuperHero=new SuperHero();
    private int force;
    private SuperHero(){
        this.force=21;
    }
    public static SuperHero getInstance() {
        return SuperHero;
    }
    public int getForce(){
        return force;
    }
    public void setForce(int force){
        this.force=force;
    }
}
public class Main {
    public static void main(String[] args) {
        SuperHero SHero = SuperHero.getInstance();
        System.out.println(SHero.getForce());
        SHero.setForce(50);
        SuperHero SHero1 = SuperHero.getInstance();
        System.out.println((SHero1.getForce()));
        if (SHero1.hashCode() == SHero.hashCode()) {
            System.out.println("OK");
        } else {
            System.out.println("Error");
        }
    }
}