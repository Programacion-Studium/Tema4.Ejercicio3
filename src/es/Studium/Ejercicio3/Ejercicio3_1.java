package es.Studium.Ejercicio3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
/**
 * @author alvaro
 *
 */

public class Ejercicio3_1 extends Frame implements WindowListener, ActionListener
{
	Panel pnlPanel1 = new Panel();
	Panel pnlPanel2 = new Panel();
	Panel pnlPanel3 = new Panel();
	
	private static final long serialVersionUID = 1L;
	//En este caso, se pueden elegir todas las opciones que queramos
	//Las opciones se mostraran en el orden introducido
	Checkbox chk1 = new Checkbox("Correr");
	Checkbox chk2 = new Checkbox("Nadar");
	Checkbox chk3 = new Checkbox("Andar");
	Checkbox chk4 = new Checkbox("Leer");
	Checkbox chk5 = new Checkbox("Ir al Cine");
	Checkbox chk6 = new Checkbox("Bailar");
	Checkbox chk7 = new Checkbox("Fútbol");
	Checkbox chk8 = new Checkbox("Tenis");
	Checkbox chk9 = new Checkbox("Baloncesto");
	Checkbox chk10 = new Checkbox("Deportes de Vela");
	Button btnBoton1 = new Button("Comprobar");
	
	public Ejercicio3_1()
	{
		setLayout( new GridLayout( 3,1 ) );
		setTitle("Botones de Opción"); //Titulo de la ventana
		pnlPanel1.add(chk1);
		pnlPanel1.add(chk2);
		pnlPanel1.add(chk3);
		pnlPanel1.add(chk4);
		pnlPanel1.add(chk5);
		pnlPanel2.add(chk6);
		pnlPanel2.add(chk7);
		pnlPanel2.add(chk8);
		pnlPanel2.add(chk9);
		pnlPanel3.add(chk10);
		pnlPanel3.add(btnBoton1);
		add(pnlPanel1);
		add(pnlPanel2);
		add(pnlPanel3);
		setLocationRelativeTo(null);
		setSize(400,150);
		this.addWindowListener(this);
		btnBoton1.addActionListener(this);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new Ejercicio3_1();//Muestra el Checkbox
	}
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		String resultado="";
		if (chk1.getState()==true ) {
			resultado=resultado+"Correr\n";
		}
		if (chk2.getState()==true ) {
			resultado=resultado+"Nadar\n";
				}
		if (chk3.getState()==true) {
			resultado=resultado+"Andar\n";
		}
		if (chk4.getState()==true ) {
			resultado=resultado+"Leer\n";
		}
		if (chk5.getState()==true) {
			resultado=resultado+"Ir al cine\n";
		}
		if (chk6.getState()==true) {
			resultado=resultado+"Bailar\n";
		}
		if (chk7.getState()==true ) {
			resultado=resultado+"Futbol\n";
		}
		if (chk8.getState()==true) {
			resultado=resultado+"Tenis\n";
		}
		if (chk9.getState()==true ) {
			resultado=resultado+"Baloncesto\n";
		}
		if (chk10.getState()==true ) {
			resultado=resultado+"Deportes de vela\n";
		}
		System.out.println(resultado);
	}
	@Override
	public void windowOpened(WindowEvent we) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent we) {
		
			System.exit(0); 
	}
	@Override
	public void windowClosed(WindowEvent we) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent we) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent we) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent we) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent we) {
		// TODO Auto-generated method stub
		
	}
}