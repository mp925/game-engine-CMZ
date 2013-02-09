package defaultpackage;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.Timer;


@SuppressWarnings("serial")
public class LandScape extends JPanel implements ActionListener {
	//	public class LandScape extends JPanel {
    private Timer timer;
    private Sprite sprite;

    public LandScape() {

        addKeyListener(new TAdapter());
        setFocusable(true);
        setBackground(Color.BLACK);
        setDoubleBuffered(true);

        sprite = new Sprite();

        timer = new Timer(5, (ActionListener) this);
        timer.start();
    }


    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D)g;
        g2d.drawImage(sprite.getImage(), sprite.getX(), sprite.getY(), this);

        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }

    //Fix This
    public void repaint(Graphics g) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D)g;
        g2d.drawImage(sprite.getImage(), sprite.getX(), sprite.getY(), this);

        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }

    private class TAdapter extends KeyAdapter {

        public void keyReleased(KeyEvent e) {
            sprite.keyReleased(e);
        }

        public void keyPressed(KeyEvent e) {
            sprite.keyPressed(e);
        }
        
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	}

