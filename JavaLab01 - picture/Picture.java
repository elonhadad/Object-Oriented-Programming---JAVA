/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2006.03.30
 */
public class Picture
{
	private Square wall;
	private Square window;
	private Triangle roof;
	private Circle sun;
	private Circle sun_2;
	private boolean isBlackAndWhite;

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
		wall = new Square();
		wall.moveVertical(80);
		wall.changeSize(100);
		wall.makeVisible();
		wall.changeColor("blue");

		window = new Square();
		window.changeColor("black");
		window.moveHorizontal(20);
		window.moveVertical(100);
		window.makeVisible();

		roof = new Triangle();  
		roof.changeSize(50, 140);
		roof.moveHorizontal(60);
		roof.moveVertical(70);
		roof.makeVisible();
		roof.changeColor("red");

		sun = new Circle();
		sun.changeColor("yellow");
		sun.moveHorizontal(180);
		sun.moveVertical(-10);
		sun.changeSize(60);
		sun.makeVisible();

		sun_2 = new Circle();
		sun_2.changeColor("yellow");
		sun_2.moveHorizontal(10);
		sun_2.moveVertical(-10);
		sun_2.changeSize(60);
		sun_2.makeVisible();
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
			sun_2.changeColor("black");
			isBlackAndWhite = true;
		}
	}

	/**
	 * Change this picture to use color display
	 */
	public void setColor()
	{
		if(wall != null)   // only if it's painted already...
		{
			wall.changeColor("blue");
			window.changeColor("black");
			roof.changeColor("red");
			sun.changeColor("yellow");
			sun_2.changeColor("yellow");
			isBlackAndWhite = false;
		}
	}

	public void setColor(boolean isColor)
	{
		if (isColor == true && isBlackAndWhite)
		{
			setColor();
		}
		else
		{
			setBlackAndWhite();
		}

	}
	public void sunset ()
	{
		sun.slowMoveVertical(180);
		sun.makeInvisible();
		sun_2.slowMoveVertical(180);
		sun_2.makeInvisible();
		setBlackAndWhite();
	}
}
