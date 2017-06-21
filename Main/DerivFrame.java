import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Young on 22/6/17.
 */


public class DerivFrame extends JFrame {
    private final JLabel welcomeText;
    private final JLabel explanationText;
    private final JTextField functionInput;
    private final JButton analyseButton;

    public DerivFrame(){
        //might have to define specific variables to make analysation process easier TODO
        super("Function Caculator");
        setLayout(new BorderLayout());
        welcomeText = new JLabel("Welcome");
        add(welcomeText,BorderLayout.PAGE_START);
        explanationText = new JLabel("Please input function in text box to be interperted");
        add(explanationText,BorderLayout.LINE_START);
        functionInput = new JTextField();
        add(functionInput,BorderLayout.CENTER);

        Font font = new Font("Arial", Font.BOLD,16);
        analyseButton = new JButton("Analyse function");
        add(analyseButton,BorderLayout.LINE_END);

        ButtonHandler handler = new ButtonHandler();
        analyseButton.addActionListener(handler);

    }
    private class ButtonHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event){
            if(event.getSource() == analyseButton){
                Analyse analyse = new Analyse(functionInput.getText());
                System.out.println(functionInput.getText()); //TODO get rid of this debug code
            }
        }

    }




}
