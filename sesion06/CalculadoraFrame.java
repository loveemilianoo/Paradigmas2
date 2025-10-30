import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;


public class CalculadoraFrame extends JFrame implements ActionListener{
	private JLabel lblNumero1, lblNumero2, lblResultado;
	private JTextField txtNumero1, txtNumero2, txtResultado;
	private JButton btnGuardar;

	public CalculadoraFrame (){
		comoponentes();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(500,350);
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(false);
		setTitle("Calculadora");
	}

	public void comoponentes(){
		lblNumero1= new JLabel();
		lblNumero1.setText("Ingrese el primer número");
		lblNumero1.setBounds(90,10,160,20);
		add(lblNumero1);
		txtNumero1 = new JTextField ();
		txtNumero1.setBounds(270,10,160,20);
		add(txtNumero1);

		lblNumero2= new JLabel();
		lblNumero2.setText("Ingrese el segundo número");
		lblNumero2.setBounds(90,35,160,20);
		add(lblNumero2);
		txtNumero2 = new JTextField ();
		txtNumero2.setBounds(270,35,160,20);
		add(txtNumero2);

		lblResultado= new JLabel();
		lblResultado.setText("Resultado");
		lblResultado.setBounds(90,60,160,20);
		add(lblResultado);
		txtResultado = new JTextField ();
		txtResultado.setBounds(270,60,160,20);
		add(txtResultado);

		btnGuardar= new JButton();
		btnGuardar.setText("Guardar");
		btnGuardar.setBounds(270,85,100,20);
		add(btnGuardar);

		btnGuardar.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e){
		System.out.println("Realizar suma");

		Calculadora cal= new Calculadora(0);
		cal.suma(Double.parseDouble(txtNumero1.getText()),
			Double.parseDouble(txtNumero2.getText()));

		txtResultado.setText(String.valueOf(cal.getResultado()));
	}
}