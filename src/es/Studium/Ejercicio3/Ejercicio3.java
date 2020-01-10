package es.Studium.Ejercicio3;
import java.awt.*;
/**
 * @author alvaro
 *
 */

public class Ejercicio3 extends Frame
{
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
	
	public Ejercicio3()
	{
		setLayout(new FlowLayout());
		setTitle("Botones de Opción"); //Titulo de la ventana
		add(chk1);
		add(chk2);
		add(chk3);
		add(chk4);
		add(chk5);
		add(chk6);
		add(chk7);
		add(chk8);
		add(chk9);
		add(chk10);
		add(btnBoton1);
		setLocationRelativeTo(null);
		setSize(400,150);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new Ejercicio3();//Muestra el Checkbox
	}
}