
public class ViewRecordView extends JFrame {

    private JButton editRecordButton;
    private JTextField medicalRecordField;
    private MedicalRecord medicalRecord;

    private RecordModel model;

    ViewRecordView(RecordModel model) {
        this.model = model;

        currentWordField = new JTextField(20);
        getWordButton = new JButton("Get new word");

        enterWordField = new JTextField(20);
        putWordButton = new JButton("Enter new word");

        JPanel content = new JPanel();
        content.setLayout(null);
        content.add(currentWordField);
        content.add(getWordButton);
        content.add(enterWordField);
        content.add(putWordButton);

        //setting positions and dimensions of everything
        currentWordField.setBounds(5, 5, 300, 50);
        getWordButton.setBounds(5, 60, 200, 50);
        enterWordField.setBounds(350, 5, 300, 50);
        putWordButton.setBounds(350, 60, 200, 50);

        this.setContentPane(content);
        this.pack();
        this.setTitle("Fancy Random Word MVC Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(800, 600);
    }

    @Override
    public String getGivenWord() {
        return enterWordField.getText();
    }

    @Override
    public void addGetWordButtonListener(ActionListener al) {
        getWordButton.addActionListener(al);
    }

    @Override
    public void setCurrentWord(String newWord) {
        currentWordField.setText(newWord);
    }

    @Override
    public void addPutWordButtonListener(ActionListener al) {
        putWordButton.addActionListener(al);
    }

}
