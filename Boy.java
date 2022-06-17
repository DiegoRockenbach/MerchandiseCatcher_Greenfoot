import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Boy extends Actor
{
    public void act() 
    {
       colhe();
       movement();
    }   
    
    public void movement(){
        if(Greenfoot.isKeyDown ("right")) {
            move(6);
        }
        if(Greenfoot.isKeyDown ("left")) {
            move(-6);
        }
    }
    
    public void colhe(){
        Actor a = getOneIntersectingObject(Banana.class);
        if(a != null){
            getWorld().removeObject(a);
            Counter counter = (Counter)getWorld().getObjects(Counter.class).get(0);
            counter.add(1);
        }
        Actor b = getOneIntersectingObject(Bread.class);
        if(b != null){
            getWorld().removeObject(b);
            Counter counter = (Counter)getWorld().getObjects(Counter.class).get(0);
            counter.add(1);
        }
        Actor c = getOneIntersectingObject(Orange.class);
        if(c != null){
            getWorld().removeObject(c);
            Counter counter = (Counter)getWorld().getObjects(Counter.class).get(0);
            counter.add(1);
        }
    }
}
