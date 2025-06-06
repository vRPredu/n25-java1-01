import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Está é uma classe que representará uma Abelha.
 * 
 * @author Pedro 
 * @version 2025-06-04
 */
public class Abelha extends Actor
{
    /**
     * Act - do whatever the Abelha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        verificarPosicao();
        move(5);
        if (Greenfoot.isKeyDown("left")) {
            turn(-5);
            
            
        }
        if (Greenfoot.isKeyDown("right")){
            turn(5);
            
        }
        
    }
    
    public void verificarPosicao (){
        if(estaNoTopo()) {
            setLocation( getX(),getWorld(). getHeight()-10);
        }
        if(estaNaBase()) {
            setLocation(getX(),10);
        }
        if (estaNaDireita()){
            setLocation(10,getY());
        }
        if(estaNaEsquerda()){
            setLocation(getWorld(). getWidth()-10, getY());
            
        }
    }
    /**
     * Método que verifica se a Abelha está no topo
     */
    public boolean estaNoTopo (){
        if (getY()<10) {
            return true;
            
        } else {
            return false;
        }
    }
    public boolean estaNaBase () {
        return getY()>getWorld() .getHeight() -10;
      }
    public boolean estaNaEsquerda () {
        return getX() <10;
    }
    public boolean estaNaDireita () {
        return getX ()>getWorld() .getWidth() -10;
    }
}
