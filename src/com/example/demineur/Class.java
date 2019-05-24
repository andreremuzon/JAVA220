package com.example.demineur;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JToggleButton;
import javax.swing.border.Border;

public class Class 
    	private Case[] voisins = new Case[8]
    	private JToggleButton butto n

    	public Class()
        		button = new JToggleButton(
        		Border lineBorder
                = BorderFactory.createLineBorder(Color.GRAY, 1
        		button.setBorder(lineBorder
        		button.setOpaque(true
    


    
	public JComponent getComponent()
        		return butto
    


    
	public Case getVoisin(IndexVoisin iv)
        		return voisins[iv.ordinal()
    

    
	public Case setVoisin(IndexVoisin iv, Case c)
        		return voisins[iv.ordinal()
    
	}
}

enum IndexVoisin
    
	VOISIN_NOR
    , VOISIN_NORD_ES
    , VOISIN_ES
    , VOISIN_SUD_ES
    , VOISIN_SUD, VOISIN_SUD_OUEST, VOISIN_OUES
    
	VOISIN_NORD_OUEST;
}