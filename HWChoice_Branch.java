import javax.swing.JOptionPane;
public class Main{
	public static void main(String[] args){
		String choice = JOptionPane.showInputDialog(null, "Você quer que apareca Hello World na sua tela? (S/N)");
        char choiceChar= choice.toUpperCase().charAt(0);
        switch (choiceChar) {
            case 'S':
                JOptionPane.showMessageDialog(null,"Hello World");
                break;
            case 'N':
                JOptionPane.showMessageDialog(null,"Volte Sempre");
                break;
        }
	}
}