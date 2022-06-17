import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Orange extends Actor
{
    int velocidade = 5;
    
    public void act() 
    {
        cai();
    } 
    
    public void cai(){
       this.setLocation(this.getX(), this.getY()+velocidade); 
       if(isAtEdge()){
         Perdeu p = new Perdeu();
         getWorld().addObject(p, 300, 200);
         Greenfoot.stop();
        }
    }  
}
