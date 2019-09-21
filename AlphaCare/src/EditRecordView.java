
public class EditRecordView extends JFrame {

    private JButton saveRecordButton;
    private JTextField medicalRecordField;

    //private RecordModel model;

    EditRecordView(RecordModel model) {
        this.model = model;

        this.medicalRecordField = new JTextField(20);
        this.saveRecordButton = new JButton("Save Record");

        JPanel content = new JPanel();
        content.setLayout(null);
        content.add(this.medicalRecordField);
        content.add(this.editRecordButton);

        //setting positions and dimensions of everything
        medicalRecordField.setBounds(5, 5, 300, 50);
        saveRecordButton.setBounds(5, 60, 200, 50);

        this.setContentPane(content);
        this.setTitle("Record");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(800, 600);
    }

    /**
     * Adds actionlistener to saveRecordButton
     * @param al ActionListener that will save updated information and switch view form 'EditRecordView' to 'SaveRecordView'
     */
    public void addSaveRecordButtonListener(ActionListener al) {
        saveRecordButton.addActionListener(al);
    }

    /**
     * Fills in medical info throughout the view
     * @param mr medical record to populate the view
     */
    public void enterMedicalInfo(Record mr){
    }

}
