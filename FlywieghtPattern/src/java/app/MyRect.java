package app;

import java.awt.Color;
import java.awt.Graphics;

class MyRect
{

/*	private int x,y,width,height; */ 
	private Color color;
/*	private Graphics graphic; */

/*	public MyRect(Graphics g ,  int newX, int newY, int newWidth, int newHeight,Color newColor)
	{
	this.x = newX;
	this.y = newY;
	this.width = newWidth;
	this.height = newHeight;
	this.color = newColor;
	this.graphic = g ; 
	}
*/
	public MyRect(Color color)
	{
	this.color = color;
	}





	public void draw(Graphics graphic, int x ,int y, int width, int height)
	{
		graphic.setColor(color);
		graphic.fillRect(x,y,width,height);
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}

}
