import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Aqui é a classe Mosca.
 * 
 * @author Pedro 
 * @version 03-06-2025
 */
public class Mosca extends Actor
{
    /**
     * Act - Método responsável pelas ações da mosca quando os botões Act ou
     * Run são pressionados
     */
    public void act()
    {
        // Add your action code here.
        move(1);
        turn(-1);
    }
}
