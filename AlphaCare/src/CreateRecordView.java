
public class ViewRecordView extends JFrame {

    private JButton createRecordButton;
    private JTextField medicalRecordField;
    private Record medicalRecord;

    ViewRecordView() {
        this.medicalRecordField = new JTextField(20);
        this.createRecordButton = new JButton("Create Record");

        JPanel content = new JPanel();
        content.setLayout(null);
        content.add(this.medicalRecordField);
        content.add(this.editRecordButton);

        //setting positions and dimensions of everything
        medicalRecordField.setBounds(5, 5, 300, 50);
        createRecordButton.setBounds(5, 60, 200, 50);

        this.setContentPane(content);
        this.setTitle("Record");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(800, 600);
    }

    /**
     * Adds actionlistener to createRecordButton
     * Will use information from medicalRecordField to update medicalRecord
     * @param al ActionListener that will save updated information and switch view form 'CreateRecordView' to 'ViewRecordView'
     */
    public void addCreateRecordButtonListener(ActionListener al) {
        createRecordButton.addActionListener(al);
    }

}
