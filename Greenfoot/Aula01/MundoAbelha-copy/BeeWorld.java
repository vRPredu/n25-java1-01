import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Definição da Classe Beeworld.
 * 
 * @author (Pedro) 
 * @version (2025-06-04)
 */
public class BeeWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public BeeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Aranha aranha = new Aranha();
        addObject(aranha,43,270);
        aranha.setLocation(91,272);
        aranha.setLocation(88,272);
        aranha.setLocation(89,272);
        Abelha abelha = new Abelha();
        addObject(abelha,541,222);
        aranha.setLocation(42,215);
        Mosca mosca = new Mosca();
        addObject(mosca,453,89);
        mosca.setLocation(38,96);
        aranha.setLocation(31,332);
        mosca.setLocation(47,91);
        Mosca mosca2 = new Mosca();
        addObject(mosca2,89,31);
        Mosca mosca3 = new Mosca();
        addObject(mosca3,93,151);
        Mosca mosca4 = new Mosca();
        addObject(mosca4,158,85);
        Mosca mosca5 = new Mosca();
        addObject(mosca5,155,207);
        abelha.setLocation(70,250);
    }
}
