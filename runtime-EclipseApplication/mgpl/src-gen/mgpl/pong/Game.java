package mgpl.pong;

import java.awt.Graphics;
import java.awt.event.KeyEvent;


public class Game extends javax.swing.JPanel implements Runnable {
	private static final long serialVersionUID = 1L;
	

	
	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new GameWindow());
	}

	private static class GameWindow extends javax.swing.JFrame implements Runnable {
		private static final long serialVersionUID = 1L;

		
		public GameWindow() {
			
			add(new Game(this));
			setTitle("Pong");
			setResizable(false);
			pack(); 
			setLocationRelativeTo(null); 
			
			if (x != null)
				setLocation(x, getY());
			if (y != null)
				setLocation(getX(), y);
			
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}

		@Override
		public void run() {
			setVisible(true); 
		}
	}

	
	public static int height = 500;
	public static int width = 500;
	private static int speed = 50;
	public static Integer x = null;
	public static Integer y = null;
	private int delay; 

	
	public Game(GameWindow window) {
		
		setPreferredSize(new java.awt.Dimension(width, height));
		setDoubleBuffered(true); 
		delay = getDelay(speed);
		
		window.addKeyListener(onEvent);
	}

	
	private int getDelay(int speed) {
		speed = 100 - speed;
		return (int) (0.0899 * (speed * speed) + (speed + 1));
	}

	
	@Override
	public void addNotify() {
		super.addNotify();
		
		new Thread(this).start();
	}
	
	
	@Override
	public void run() {
		long beforeTime = System.currentTimeMillis();
		while (true) {
			
			for (Object o : objects) {
				if (o.animation_block != null)
					o.animation_block.animate(o);
			}
			
			repaint();
			long sleep = beforeTime + delay - System.currentTimeMillis();
			if (sleep <= 0)
				sleep = 1;
			try {
				Thread.sleep(sleep);
			} catch (InterruptedException e) {
				System.err.println("Interrupted: " + e.getMessage());
			}
			beforeTime = System.currentTimeMillis();
		}
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (Object o : objects)
			if (b(o.visible))
				o.draw(g);
		java.awt.Toolkit.getDefaultToolkit().sync();
	}


	private static abstract	 class Object {
		
		
		Animation animation_block;
		public int visible = 1;
		public int x;
		public int y;

		public abstract void draw(Graphics g); 

		
		public abstract java.awt.Rectangle getBounds();
	}

	
	private static class Circle extends Object {
		public int radius; 

		
		@Override
		public void draw(Graphics g) {
			g.fillOval(x, y, 2 * radius, 2 * radius);
		}

		@Override
		public java.awt.Rectangle getBounds() {
			return new java.awt.Rectangle(x, y, 2 * radius, 2 * radius);
		}
	}

	private static class Rectangle extends Object {
		public int height;
		public int width;

		@Override
		public void draw(Graphics g) {
			g.fillRect(x, y, width, height);
		}

		@Override
		public java.awt.Rectangle getBounds() {
			return new java.awt.Rectangle(x, y, width, height);
		}
	}

	private static class Triangle extends Object {
		public int height;
		public int width;

		@Override
		public void draw(Graphics g) {
			g.fillPolygon(new int[] { x, x + width, x + width / 2 }, new int[] { y, y, y + height }, 3);
		}

		@Override
		public java.awt.Rectangle getBounds() {
			return new java.awt.Rectangle(x, y, width, height);
		}
	}

	private static abstract class Animation {
		protected abstract void animate(Object object);
	}

	private boolean b(int i) {
		return i != 0;
	}

	private int i(boolean b) {
		return b ? 1 : 0;
	}

	private int or(int left, int right) {
		return i(b(left) || b(right));
	}

	private int and(int left, int right) {
		return i(b(left) && b(right));
	}

	private int eq(int left, int right) {
		return i(left == right);
	}

	private int lt(int left, int right) {
		return i(left < right);
	}

	private int le(int left, int right) {
		return i(left <= right);
	}

	private int not(int value) {
		return i(!b(value));
	}

	private int touches(Object left, Object right) {
		return i(left.getBounds().intersects(right.getBounds()));
	}

	{
		width = 400;
		height = 300;
		speed = 90;
	}

	private int _paddle_increment = 10;
	private int _ball_x_increment = 5;
	private int _ball_y_increment = 2;
	private int _paddle_width = 5;
	private int _paddle_height = 40;
	private int _ball_size = 10;
	private Rectangle _paddle = new Rectangle() {
		{
			x = (Game.width / 10) ;
			y = (Game.height / 2) ;
			width = _paddle_width;
			height = _paddle_height;
		}
	};
	private Circle _ball = new Circle() {
		{
			x = (Game.width / 2) ;
			y = (Game.height / 2) ;
			radius = (_ball_size / 2) ;
			animation_block = new Animation() {
				@Override
				protected void animate(Object object) {
					_ball_animate(object);
				}
			}
			;
		}
	};

	private Object[] objects = new Object[] { _paddle, _ball };

	{
	}
	private void _ball_animate(Object _cur_ball) {
		_ball_animate((Circle) _cur_ball);
	}
	private void _ball_animate(Circle _cur_ball) {
			if (b(or(and(lt(_cur_ball.x,0),lt(_ball_x_increment,0)), and(lt((Game.width - _ball_size),_cur_ball.x),lt(0,_ball_x_increment)))))
			{
					_ball_x_increment = -_ball_x_increment;
			}
			if (b(or(lt(_cur_ball.y,0), lt((Game.height - _ball_size),_cur_ball.y))))
			{
					_ball_y_increment = -_ball_y_increment;
			}
			if (b(touches(_cur_ball,_paddle)))
			{
					_ball_x_increment = -_ball_x_increment;
			}
			_cur_ball.x = (_cur_ball.x + _ball_x_increment);
			_cur_ball.y = (_cur_ball.y + _ball_y_increment);
	}

	java.awt.event.KeyListener onEvent = new java.awt.event.KeyAdapter() {
		@Override
		public void keyPressed(KeyEvent e) {
			switch (e.getKeyCode()) {
			case KeyEvent.VK_DOWN: {
					if (b(lt(_paddle.y,(Game.height - (2 * _paddle_increment) ))))
					{
							_paddle.y = (_paddle.y + _paddle_increment);
					}
			}
				break;
			case KeyEvent.VK_UP: {
					if (b(lt(_paddle_increment,_paddle.y)))
					{
							_paddle.y = (_paddle.y - _paddle_increment);
					}
			}
				break;
			}
		}
	};
}
