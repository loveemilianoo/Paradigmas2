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
		super.setSize(500,450);
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
		btnGuardar.setBounds(270,365,160,20);
		add(btnGuardar);

		//labels y txt de tarea
		JLabel lblRfc = new JLabel ("RFC");
		lblRfc.setBounds (90,115, 160,20);
		add(lblRfc);
		JTextField txtRfc= new JTextField ();
		txtRfc.setBounds(270,115,160,20);
		add(txtRfc);

		JLabel lblCurp = new JLabel("CURP");
		lblCurp.setBounds(90,140,160,20);
		add(lblCurp);
		JTextField txtCurp = new JTextField();
		txtCurp.setBounds(270,140,160,20);
		add(txtCurp);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(90,165,160,20);
		add(lblNombre);
		JTextField txtNombre = new JTextField();
		txtNombre.setBounds(270,165,160,20);
		add(txtNombre);

		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(90,190,160,20);
		add(lblEdad);
		JTextField txtEdad = new JTextField();
		txtEdad.setBounds(270,190,160,20);
		add(txtEdad);

		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(90,215,160,20);
		add(lblSexo);
		JTextField txtSexo = new JTextField();
		txtSexo.setBounds(270,215,160,20);
		add(txtSexo);

		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setBounds(90,240,160,20);
		add(lblCorreo);
		JTextField txtCorreo = new JTextField();
		txtCorreo.setBounds(270,240,160,20);
		add(txtCorreo);

		JLabel lblNoCliente = new JLabel("No. Cliente");
		lblNoCliente.setBounds(90,265,160,20);
		add(lblNoCliente);
		JTextField txtNoCliente = new JTextField();
		txtNoCliente.setBounds(270,265,160,20);
		add(txtNoCliente);

		JLabel lblTarjeta = new JLabel("Tarjeta");
		lblTarjeta.setBounds(90,290,160,20);
		add(lblTarjeta);
		JTextField txtTarjeta = new JTextField();
		txtTarjeta.setBounds(270,290,160,20);
		add(txtTarjeta);

		JLabel lblNip = new JLabel("NIP");
		lblNip.setBounds(90,315,160,20);
		add(lblNip);
		JTextField txtNip = new JTextField();
		txtNip.setBounds(270,315,160,20);
		add(txtNip);

		JLabel lblSaldo = new JLabel("Saldo");
		lblSaldo.setBounds(90,340,160,20);
		add(lblSaldo);
		JTextField txtSaldo = new JTextField();
		txtSaldo.setBounds(270,340,160,20);
		add(txtSaldo);

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