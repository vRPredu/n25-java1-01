import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Definição da Classe Beeworld.
 * 
 * @author (Pedro) 
 * @version (2025-06-04)
 */
public class BeeWorld extends World
{
    //Fields
    private int score;
    private final int PONTOS = 100;
    private Abelha abelha;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public BeeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
        score=0;
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Aranha aranha = new Aranha();
        addObject(aranha,800,300);
        
        abelha = new Abelha();
        addObject(abelha,45,152);
        
         for (int qtd=0; qtd<20;qtd++){
             int posX = Greenfoot.getRandomNumber(800);
             int posY = Greenfoot.getRandomNumber(600);
             int vel = Greenfoot.getRandomNumber(3)+1;
             int rot = Greenfoot.getRandomNumber(360)+1;
             addObject(new Mosca(vel,rot), posX, posY); 
            }
            
            //mostrando texto
        TextoColorido txt= new TextoColorido(
        "Mensagem teste",500,50,18,Color.BLUE, Color.GRAY);

             addObject(txt,500,50);
    }
    //getter do Score
    public int getScore(){
        return score;
    }
    /**
     * Método para atualizar o Score da Abelha
     */
    public void updateScore(){
        score += PONTOS;//score - score + PONTOS
        showText("Score: "+score ,100, 10);
        
    }
    public Abelha getAbelha(){
        return abelha;
    }
}
