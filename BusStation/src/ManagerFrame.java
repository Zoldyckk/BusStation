import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JFrame;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import javax.swing.plaf.synth.SynthSeparatorUI;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Panel;
import java.awt.SystemColor;
import java.awt.Label;
import java.awt.Color;
import javax.swing.Icon;

public class ManagerFrame {

	private JFrame frame;
	private JFrame frametest;
	private JTextField textField;
	private JPasswordField passwordField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerFrame window = new ManagerFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ManagerFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 786, 449);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(Color.WHITE);
		panel.setVisible(true);
		
		Panel bgpanel = new Panel();
		bgpanel.setBounds(0, 0, 772, 412);
		frame.getContentPane().add(bgpanel);
		bgpanel.setBackground(Color.WHITE);
		bgpanel.setVisible(true);
		bgpanel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(250, 139, 420, 31);
		textField.setBorder(null);
		bgpanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblAdminLogin = new JLabel("Login System\r\n");
		lblAdminLogin.setBounds(210, 33, 163, 47);
		bgpanel.add(lblAdminLogin);
		lblAdminLogin.setFont(new Font("Microsoft JhengHei", Font.BOLD, 24));
		
		passwordField = new JPasswordField();
		passwordField.setBounds(250, 198, 420, 31);
		passwordField.setBorder(null);
		bgpanel.add(passwordField);
		
		JButton btnAdminLogin = new JButton("Admin\r\nLogin");
		btnAdminLogin.setForeground(Color.WHITE);
		btnAdminLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnAdminLogin.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnAdminLogin.setBackground(SystemColor.black);
			}
			@Override
			public void mousePressed(MouseEvent arg0) {
				btnAdminLogin.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
			}
		});
		btnAdminLogin.setBackground(Color.BLACK);
		btnAdminLogin.setBounds(38, 272, 190, 109);
		btnAdminLogin.setBorder(null);
		bgpanel.add(btnAdminLogin);
		btnAdminLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				String user = textField.getText();
				String pass = passwordField.getText();
				if (user.equals("Ahmed Mahmoud") && pass.equals("kosom"))
				{
					JOptionPane.showMessageDialog(null,"Welcome " + textField.getText(),"title: Welcome", JOptionPane.INFORMATION_MESSAGE);
				bgpanel.setVisible(false);
				}
			else
				JOptionPane.showMessageDialog(null,"WRONG USERNAMR OR PASSWORD","title: ERROR!!!", JOptionPane.ERROR_MESSAGE);
			}
		});
		btnAdminLogin.setFont(new Font("Microsoft JhengHei", Font.BOLD, 22));
		
		JButton btnReset = new JButton("Reset\r\n");
		btnReset.setForeground(Color.WHITE);
		btnReset.setBackground(Color.BLACK);
		btnReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnReset.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnReset.setBackground(SystemColor.black);
			}
			@Override
			public void mousePressed(MouseEvent arg0) {
				btnReset.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
			}
		});
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
				passwordField.setText(null);
			}
		});
		btnReset.setBounds(502, 303, 142, 47);
		bgpanel.add(btnReset);
		btnReset.setFont(new Font("Microsoft JhengHei", Font.BOLD, 22));
		
		JLabel lblAdminName = new JLabel(new ImageIcon("C:\\Users\\lenovo\\Documents\\Downloads\\Compressed\\Bus Station Reservation System\\src\\System\\images\\Bus_96px.png"));
		lblAdminName.setBounds(33, 128, 135, 121);
		bgpanel.add(lblAdminName);
		lblAdminName.setFont(new Font("Arial", Font.BOLD, 24));
		
		JButton btnlogin = new JButton("Login");
		btnlogin.setForeground(Color.WHITE);
		btnlogin.setBackground(Color.BLACK);
		btnlogin.setBounds(290, 303, 142, 47);
		bgpanel.add(btnlogin);
		btnlogin.setFont(new Font("Microsoft JhengHei", Font.BOLD, 22));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(new Color(32, 178, 170));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBounds(250, 168, 420, 6);
		bgpanel.add(lblNewLabel_1);
		
		JLabel label = new JLabel("");
		label.setOpaque(true);
		label.setBackground(new Color(32, 178, 170));
		label.setBounds(250, 234, 420, 5);
		bgpanel.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setOpaque(true);
		label_1.setBackground(new Color(32, 178, 170));
		label_1.setBounds(180, 99, 5, 150);
		bgpanel.add(label_1);
		
		JLabel lblimguser = new JLabel(new ImageIcon("C:\\Users\\lenovo\\Documents\\Downloads\\Compressed\\Bus Station Reservation System\\src\\System\\images\\User Male_96px.png"));
		lblimguser.setBounds(210, 139, 30, 31);
		bgpanel.add(lblimguser);
		
		JLabel lblimgpass = new JLabel(new ImageIcon("C:\\Users\\lenovo\\Documents\\Downloads\\Compressed\\Bus Station Reservation System\\src\\System\\images\\Lock_96px.png"));
		lblimgpass.setBounds(210, 198, 30, 31);
		bgpanel.add(lblimgpass);
		btnlogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnlogin.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnlogin.setBackground(SystemColor.black);
			}
			@Override
			public void mousePressed(MouseEvent arg0) {
				btnlogin.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
			}
		});
		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel.setBounds(0, 1, 772, 411);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bus Reservation System");
		lblNewLabel.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 36));
		lblNewLabel.setBounds(108, 33, 473, 106);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Welcome ya zebala");
		lblNewLabel_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 16));
		lblNewLabel_2.setBounds(389, 125, 252, 55);
		panel.add(lblNewLabel_2);
	}

	public JFrame getFrametest() {
		return frametest;
	}

	public void setFrametest(JFrame frametest) {
		this.frametest = frametest;
	}
}
