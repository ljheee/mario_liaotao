package com.mojang.mario;

import java.awt.Font;

import javax.swing.JApplet;
import javax.swing.UIManager;


public class AppletLauncher extends JApplet
{
    private static final long serialVersionUID = -2238077255106243788L;

    private MarioComponent mario;
    private boolean started = false;

    public void init()
    {
    }

    public void start()
    {
    	UIManager.put("Applet.font", new Font("º£¶¦Áú", Font.PLAIN, 14));
        if (!started)
        {
        	setSize(640, 480);
            started = true;
            mario = new MarioComponent(getWidth(), getHeight());
            setContentPane(mario);
            setFocusable(false);
            mario.setFocusCycleRoot(true);

            mario.start();
//            addKeyListener(mario);
//            addFocusListener(mario);
        }
    }

    public void stop()
    {
        if (started)
        {
            started = false;
            removeKeyListener(mario);
            mario.stop();
            removeFocusListener(mario);
        }
    }
}