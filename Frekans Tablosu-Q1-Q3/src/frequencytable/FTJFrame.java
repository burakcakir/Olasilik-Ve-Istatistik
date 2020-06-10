package frequencytable;

import java.util.Arrays;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author burak
 */
public class FTJFrame extends javax.swing.JFrame {

    public static String[] Titles = { "Sınıf Limitleri", "Sınıf Sınırları", "Sınıf Frekansı", "Sınıf Orta Noktası", "Sınıf Eklenik Frekansı", "Oransal Frekans", "Oransal Eklenik Frekans" };
    public JTextField[][] Fields = new JTextField[9][100];
            
    boolean tableCreated = false;


    public FTJFrame() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Frekans Tablosu");

        jTextPane2.setText("Bu alana sayı boşluk , sayı şekliden değer giriniz.  (Örnek : 10 , 20 , 30)");
        jScrollPane3.setViewportView(jTextPane2);

        jButton1.setText("Hesapla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);

        jLabel1.setText("R");

        jTextField2.setEditable(false);

        jLabel2.setText("K");

        jTextField3.setEditable(false);

        jLabel3.setText("H");

        jLabel5.setText("Q1");

        jTextField5.setEditable(false);

        jLabel6.setText("Q3");

        jTextField6.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField2)))))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(313, 313, 313))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(308, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        String[] valuesS = jTextPane2.getText().split(", ");
        Float[] valuesF = new Float[valuesS.length];

        for (int i = 0; i < valuesS.length; i++) {
            valuesF[i] = Float.parseFloat(valuesS[i]);
        }

        Arrays.sort(valuesF);

        for (int i = 0;i < 9;i++) {
            for (int j = 0;j < 100;j++) {
                if (Fields[i][j] != null) {
                    this.remove(Fields[i][j]);
                    Fields[i][j] = null;
                }
            }
        }

        if (!tableCreated)
        {
            for (int i = 0;i < 7;i++) {
                JTextField jtf = new JTextField();
                jtf.setEditable(false);
                jtf.setText(Titles[i]);
                jtf.setBounds(45 + (i * 150), 250, 150, i > 1 ? 50 : 25);
                jtf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                this.add(jtf);
            }

            for (int i = 0;i < 4;i++) {
                JTextField jtf = new JTextField();
                jtf.setEditable(false);
                jtf.setText(i % 2 == 0 ? "Alt" : "Üst");
                jtf.setBounds(45 + (i * 75), 275, 75, 25);
                jtf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                this.add(jtf);
            }
        }
        tableCreated = true;

        Float min = valuesF[0];
        Float max = valuesF[valuesF.length - 1];
        Float difference = max - min;
        double classCountD = Math.sqrt(valuesF.length);
        Integer classCountI = classCountD == (int)classCountD ? (int)classCountD : (int)classCountD + 1;
        float classWidthF = (float)difference / classCountI;
        Integer classWidthI = classWidthF == (int)classWidthF ? (int)classWidthF : (int)classWidthF + 1;

        jTextPane2.setText(cutPointZero(Arrays.toString(valuesF).substring(1, Arrays.toString(valuesF).length() - 1).split(", ")));
        jTextField1.setText(cutPointZero(difference.toString()));
        jTextField2.setText(classCountI.toString());
        jTextField3.setText(classWidthI.toString());

        Integer lvd = 0;
        for (int i = 0;i < valuesF.length;i++) {
            String number = valuesF[i].toString();
            Integer index = number.indexOf(".");
            String decimal = number.substring(index + 1, number.length());

            if (!decimal.equals("0") && lvd < decimal.length())
                lvd = decimal.length();
        }

        //jTextField4.setText(lvd.toString());

        for (int i = 0;i < 9;i++) {
            for (int j = 0; j < classCountI; j++) {
                JTextField jtf = new JTextField();
                jtf.setEditable(false);
                jtf.setBounds(45 + (i > 3 ? (i - 2) * 150 : i * 75), 300 + (j * 25), i > 3 ? 150 : 75, 25);
                jtf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                this.add(jtf);

                Fields[i][j] = jtf;
            }
        }

        this.update(this.getGraphics());

        for (int j = 0; j < classCountI; j++) {
            Float limit = min + (classWidthI * j);

            Fields[0][j].setText(cutPointZero(limit.toString()));
        }

        for (int j = 0; j < classCountI; j++) {
            Float limit = min + (classWidthI * (j + 1) - 1);

            Fields[1][j].setText(cutPointZero(limit.toString()));
        }

        for (int j = 0; j < classCountI; j++) {
            Float edge = Float.parseFloat(Fields[0][j].getText()) - (float)0.5 / over(10, lvd);

            Fields[2][j].setText(edge.toString());
        }

        for (int j = 0; j < classCountI; j++) {
            Float edge = Float.parseFloat(Fields[1][j].getText()) + (float)0.5 / over(10, lvd);

            Fields[3][j].setText(edge.toString());
        }

        for (int j = 0; j < classCountI; j++) {
            Integer frequency = 0;
            Float minEdge = Float.parseFloat(Fields[2][j].getText());
            Float maxEdge = Float.parseFloat(Fields[3][j].getText());

            for (int i = 0; i < valuesF.length; i++)
            {
                if (valuesF[i] > minEdge && valuesF[i] < maxEdge)
                    frequency++;
            }

            Fields[4][j].setText(frequency.toString());
        }

        for (int j = 0; j < classCountI; j++) {
            Float centerPoint = (Float.parseFloat(Fields[0][j].getText()) + Float.parseFloat(Fields[1][j].getText())) / 2;

            Fields[5][j].setText(centerPoint.toString());
        }

        for (int j = 0; j < classCountI; j++) {
            Integer addedFrequency = Integer.parseInt(Fields[4][j].getText());
            for (int i = 0; i < j; i++)
            {
                addedFrequency += Integer.parseInt(Fields[4][i].getText());
            }

            Fields[6][j].setText(addedFrequency.toString());
        }

        for (int j = 0; j < classCountI; j++) {
            Float rationalFrequency = Float.parseFloat(Fields[4][j].getText()) / valuesF.length;

            Fields[7][j].setText(rationalFrequency.toString());
        }
        
        for (int j = 0; j < classCountI; j++) {
            Float rationalAddedFrequency = Float.parseFloat(Fields[6][j].getText()) / valuesF.length;

            Fields[8][j].setText(rationalAddedFrequency.toString());
        }

        Float[] lowerHalf = new Float[valuesF.length / 2];
        Float[] upperHalf = new Float[valuesF.length / 2];
        
        for (int i = 0; i < valuesF.length / 2; i++) {
            lowerHalf[i] = valuesF[i];

            if (valuesF.length % 2 == 0)
                upperHalf[i] = valuesF[i + (valuesF.length / 2)];
            else
                upperHalf[i] = valuesF[i + 1 + (valuesF.length / 2)];
        }
        
        Float lowerQ = calculateMedian(lowerHalf);
        Float upperQ = calculateMedian(upperHalf);

        int lowerClass1 = 0;
        int lowerClass3 = 0;
        Float lowerLimit1 = 0f;
        Float lowerLimit3 = 0f;
        int lowerFreq1 = 0;
        int lowerFreq3 = 0;
        for (int j = 0; j < classCountI; j++)
        {
            Float ll = Float.parseFloat(Fields[2][j].getText());
            if (lowerQ > ll)
            {
                lowerLimit1 = ll;
                lowerClass1 = j;
                lowerFreq1 = Integer.parseInt(Fields[4][j].getText());
            }
            if (upperQ > ll)
            {
                lowerLimit3 = ll;
                lowerClass3 = j;
                lowerFreq3 = Integer.parseInt(Fields[4][j].getText());
            }
        }

        int n1 = lowerClass1 == 0 ? 0 : Integer.parseInt(Fields[6][lowerClass1 - 1].getText());
        int n3 = lowerClass3 == 0 ? 0 : Integer.parseInt(Fields[6][lowerClass3 - 1].getText());
        int j1 = (valuesF.length / 4) - n1;
        int j3 = ((3 * valuesF.length) / 4) - n3;
        Float q1 = lowerLimit1 + ((j1 * classWidthI) / lowerFreq1);
        Float q3 = lowerLimit3 + ((j3 * classWidthI) / lowerFreq3);

        System.out.println((valuesF.length / 4));
        System.out.println((3 * valuesF.length / 4));
        System.out.println(upperQ);
        System.out.println(lowerQ);
        System.out.println(n1);
        System.out.println(n3);
        System.out.println(j1);
        System.out.println(j3);
        System.out.println(q1);
        System.out.println(q3);
        System.out.println(lowerLimit1);
        System.out.println(lowerLimit3);
        System.out.println(lowerFreq1);
        System.out.println(lowerFreq3);
        
        jTextField5.setText(q1.toString());
        jTextField6.setText(q3.toString());
    }//GEN-LAST:event_jButton1ActionPerformed

    public String cutPointZero(String number)
    {
        if (".0".equals(number.substring(number.length() - 1, number.length())))
            return number.substring(0, number.length() - 1);
        else
            return number;
    }

    public String cutPointZero(String[] numbers)
    {
        String string = "";
        for (int i = 0; i < numbers.length; i++) {
            if (".0".equals(numbers[i].substring(numbers[i].length() - 1, numbers[i].length())))
                string = string + numbers[i].substring(0, numbers[i].length() - 1);
            else
                string = string + numbers[i];
            
            if (i != numbers.length - 1)
                string = string + ", ";
        }

        return string;
    }
    
    public int over(int x, int y)
    {
        int result = 1;
        for (int i = 0; i < y; i++)
        {
            result *= x;
        }

        return result;
    }

    private Float calculateMedian(Float[] valuesF) {
        Float med = 0f;
        if (valuesF.length % 2 == 0)
            med = (valuesF[valuesF.length / 2] + valuesF[(valuesF.length / 2) - 1]) / 2;
        else
            med = valuesF[(valuesF.length / 2)];

        return med;
    }


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FTJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextPane jTextPane2;
    // End of variables declaration//GEN-END:variables
}
