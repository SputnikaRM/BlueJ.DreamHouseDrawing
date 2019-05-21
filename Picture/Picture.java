
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square grass;
    private Square grass2;
    private Square grass3;
    private Square grass4;
    private Square wall;
    private Square wall2;
    private Square window;
    private Square window2;
    private Square window3;
    private Square window4;
    private Square window5;
    private Square window6;
    private Triangle roof;
    private Triangle roof2;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        grass = new Square ();
        grass.moveVertical(180);
        grass.moveHorizontal(-60);
        grass.changeSize(75);
        grass.makeVisible();
        grass.changeColor("green");
        
        grass2 = new Square ();
        grass2.moveVertical(180);
        grass2.moveHorizontal(0);
        grass2.changeSize(100);
        grass2.makeVisible();
        grass2.changeColor("green");
        
        grass3 = new Square ();
        grass3.moveVertical(180);
        grass3.moveHorizontal(100);
        grass3.changeSize(75);
        grass3.makeVisible();
        grass3.changeColor("green");
        
        grass4 = new Square ();
        grass4.moveVertical(180);
        grass4.moveHorizontal(170);
        grass4.changeSize(75);
        grass4.makeVisible();
        grass4.changeColor("green");
        
        wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.makeVisible();
        wall.changeColor("yellow");
        
        wall2 = new Square ();
        wall2.moveVertical(80);
        wall2.moveHorizontal(90);
        wall2.changeSize(100);
        wall2.makeVisible();
        wall2.changeColor("yellow");
        

        window = new Square();
        window.changeColor("white");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();
        
        window2 = new Square ();
        window2.changeColor("white");
        window2.moveHorizontal(70);
        window2.moveVertical(100);
        window2.makeVisible();
        
        window3 = new Square ();
        window3.changeColor("white");
        window3.moveHorizontal(20);
        window3.moveVertical(140);
        window3.makeVisible();
        
        window4 = new Square ();
        window4.changeColor("white");
        window4.moveHorizontal(150);
        window4.moveVertical(100);
        window4.makeVisible();
        
        window5 = new Square ();
        window5.changeColor("red");
        window5.moveHorizontal(100);
        window5.moveVertical(150);
        window5.makeVisible();
        
        window6 = new Square ();
        window6.changeColor("red");
        window6.moveHorizontal(100);
        window6.moveVertical(130);
        window6.makeVisible();
        
        

        roof = new Triangle();
        roof.changeSize(100, 140);
        roof.moveHorizontal(77);
        roof.moveVertical(15);
        roof.changeColor("black");
        roof.makeVisible();
        
        roof2 = new Triangle();
        roof2.changeSize(70, 100);
        roof2.moveHorizontal(150);
        roof2.moveVertical(45);
        roof2.changeColor("black");
        roof2.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(220);
        sun.moveVertical(-50);
        sun.changeSize(60);
        sun.makeVisible();
        
        
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("yellow");
            window.changeColor("black");
            roof.changeColor("red");
            sun.changeColor("yellow");
        }
    }

}
