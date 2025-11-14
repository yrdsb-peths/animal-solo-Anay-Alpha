import greenfoot.*;

public class MyWorld extends World {
    public int score = 0;
    Label labelScore;
    
    public MyWorld() {
        super(600, 400, 1);
        
        Elephant elephant  = new Elephant();
        addObject(elephant, 300, 300);    
        
        labelScore = new Label(0, 60);
        addObject(labelScore, 20, 20);
        
        spawnApple();
    }
    
    public void spawnApple()
    {
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
    
    public void gameOver()
    {
        Label gameOver = new Label("Game over", 100);
        addObject(gameOver, 300, 200);
    }
    
    public void increaseScore()
    {
        score++;
        labelScore.setValue(score);
    }

}
