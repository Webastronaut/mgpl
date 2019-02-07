package mgpl.invaders;

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
			setTitle("Invaders");
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
		width = 500;
		height = 500;
		x = 300;
		y = 200;
		speed = 85;
	}

	private int _alien_increment = 6;
	private int _alien_y_increment = 0;
	private int _bullet_increment = 17;
	private int _counter = 0;
	private int _i;
	private Circle[] _aliens = new Circle[] { new Circle(), new Circle(), new Circle(), new Circle(), new Circle(), new Circle(), new Circle(), new Circle(), new Circle(), new Circle() };
	private Rectangle[] _bullets = new Rectangle[] { new Rectangle(), new Rectangle(), new Rectangle(), new Rectangle(), new Rectangle() };
	private Triangle _gun = new Triangle() {
		{
			x = 250;
			y = 50;
			height = 25;
			width = 25;
		}
	};

	private Object[] objects = new Object[] { _aliens[0], _aliens[1], _aliens[2], _aliens[3], _aliens[4], _aliens[5], _aliens[6], _aliens[7], _aliens[8], _aliens[9], _bullets[0], _bullets[1], _bullets[2], _bullets[3], _bullets[4], _gun };

	{
			for (_i = 0; b(lt(_i,5)); _i = (_i + 1)) 
			{
					_bullets[_i].width = 2;
					_bullets[_i].height = 20;
					_bullets[_i].visible = 0;
					_bullets[_i].animation_block = new Animation() {
						@Override
						protected void animate(Object object) {
							_bullet_animate(object);
						}
					}
					;
			}
			for (_i = 0; b(lt(_i,10)); _i = (_i + 1)) 
			{
					_aliens[_i].radius = 4;
					_aliens[_i].animation_block = new Animation() {
						@Override
						protected void animate(Object object) {
							_alien_animate(object);
						}
					}
					;
			}
			_aliens[0].animation_block = new Animation() {
				@Override
				protected void animate(Object object) {
					_lead_alien_animate(object);
				}
			}
			;
			_aliens[0].x = 250;
			_aliens[0].y = 300;
			_aliens[1].x = 230;
			_aliens[1].y = 320;
			_aliens[2].x = 270;
			_aliens[2].y = 320;
			_aliens[3].x = 210;
			_aliens[3].y = 340;
			_aliens[4].x = 250;
			_aliens[4].y = 340;
			_aliens[5].x = 290;
			_aliens[5].y = 340;
			_aliens[6].x = 190;
			_aliens[6].y = 360;
			_aliens[7].x = 230;
			_aliens[7].y = 360;
			_aliens[8].x = 270;
			_aliens[8].y = 360;
			_aliens[9].x = 310;
			_aliens[9].y = 360;
	}
	private void _lead_alien_animate(Object _lead_alien) {
		_lead_alien_animate((Circle) _lead_alien);
	}
	private void _lead_alien_animate(Circle _lead_alien) {
			if (b(or(lt((Game.width - 100),(_lead_alien.x + _alien_increment)), lt((_lead_alien.x + _alien_increment),100))))
			{
					_alien_increment = -_alien_increment;
			}
			if (b(le(2,_counter)))
			{
					_alien_y_increment = -1;
					_counter = 0;
			}
			else
			{
					_counter = (_counter + 1);
					_alien_y_increment = 0;
			}
			_lead_alien.x = (_lead_alien.x + _alien_increment);
			_lead_alien.y = (_lead_alien.y + _alien_y_increment);
	}
	private void _alien_animate(Object _alien) {
		_alien_animate((Circle) _alien);
	}
	private void _alien_animate(Circle _alien) {
			_alien.x = (_alien.x + _alien_increment);
			_alien.y = (_alien.y + _alien_y_increment);
	}
	private void _bullet_animate(Object _cur_bullet) {
		_bullet_animate((Rectangle) _cur_bullet);
	}
	private void _bullet_animate(Rectangle _cur_bullet) {
			if (b(_cur_bullet.visible))
			{
					for (_i = 0; b(lt(_i,10)); _i = (_i + 1)) 
					{
							if (b(and(_aliens[_i].visible,touches(_cur_bullet,_aliens[_i]))))
							{
									_aliens[_i].visible = 0;
									_cur_bullet.visible = 0;
							}
					}
					_cur_bullet.y = (_cur_bullet.y + _bullet_increment);
					if (b(lt(Game.height,_cur_bullet.y)))
					{
							_cur_bullet.visible = 0;
					}
			}
	}

	java.awt.event.KeyListener onEvent = new java.awt.event.KeyAdapter() {
		@Override
		public void keyPressed(KeyEvent e) {
			switch (e.getKeyCode()) {
			case KeyEvent.VK_LEFT: {
					if (b(lt(50,_gun.x)))
					{
							_gun.x = (_gun.x - 5);
					}
			}
				break;
			case KeyEvent.VK_RIGHT: {
					if (b(lt(_gun.x,(Game.width - 50))))
					{
							_gun.x = (_gun.x + 5);
					}
			}
				break;
			case KeyEvent.VK_SPACE: {
					for (_i = 0; b(lt(_i,5)); _i = (_i + 1)) 
					{
							if (b(not(_bullets[_i].visible)))
							{
									_bullets[_i].visible = 1;
									_bullets[_i].x = (_gun.x + (_gun.width / 2) );
									_bullets[_i].y = (_gun.y + _gun.height);
									_i = 6;
							}
							else
							{
									_bullets[_i].visible = 0;
							}
					}
			}
				break;
			}
		}
	};
}
