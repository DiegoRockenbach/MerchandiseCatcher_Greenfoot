import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class background extends World {
    public background()
    {    
        super(600, 400, 1); 
        addObject(new Boy(), 300, 300);
        Counter counter = new Counter();
        addObject(counter,77,56);
    }
    
    public void act(){
        criadorBanana();
        criadorBread();
        criadorOrange();
    }
        
    public void criadorBanana(){
        if  (Greenfoot.getRandomNumber(600) < 5) {
            int x = Greenfoot.getRandomNumber(500);
            int y = 10;
            addObject(new Banana(), x, y);
        }
    }
        
    public void criadorBread(){
        if  (Greenfoot.getRandomNumber(600) < 5) {
            int x = Greenfoot.getRandomNumber(500);
            int y = 10;
            addObject(new Bread(), x, y);
        }
    }
        
    public void criadorOrange(){
        if  (Greenfoot.getRandomNumber(600) < 5) {
            int x = Greenfoot.getRandomNumber(500);
            int y = 10;
            addObject(new Orange(), x, y);
        }
    }
}
