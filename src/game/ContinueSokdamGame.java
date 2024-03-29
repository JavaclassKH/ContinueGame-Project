package game;
 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
 
public class ContinueSokdamGame extends JFrame {
    private JTextField textSokdam;
    private JPanel pn1 , pn2 , pn3;
    private JLabel lblSokdamTitle , lblScore , lblScoreBoard , lblSokdamFront;
    private JButton btSokdamStart , btSokdamExit;
    
    ContinueGameDAO dao = new ContinueGameDAO();
    ContinueGameVO vo = null;
    
    
    public ContinueSokdamGame() {
        super("속담맞추기 게임!");
        setSize(850 , 650);
        getContentPane().setLayout(null);
 
        pn1 = new JPanel();
        pn1.setBackground(new Color(244, 164, 96));
        pn1.setBounds(0, 0, 623, 114);
        getContentPane().add(pn1);
        pn1.setLayout(null);
        
        lblSokdamTitle = new JLabel("속  담  이  어  말  하  기");
        lblSokdamTitle.setBounds(12, 10, 599, 94);
        lblSokdamTitle.setFont(new Font("문체부 훈민정음체", Font.BOLD, 35));
        lblSokdamTitle.setHorizontalAlignment(SwingConstants.CENTER);
        pn1.add(lblSokdamTitle);
        
        pn2 = new JPanel();
        pn2.setBounds(624, 0, 210, 611);
        getContentPane().add(pn2);
        pn2.setLayout(null);
        
        btSokdamExit = new JButton("게 임 종 료");
        btSokdamExit.setForeground(new Color(255, 0, 0));
        btSokdamExit.setFont(new Font("문체부 훈민정음체", Font.BOLD, 19));
        btSokdamExit.setBounds(12, 490, 186, 111);
        pn2.add(btSokdamExit);
        
        lblScore = new JLabel("점   수");
        lblScore.setFont(new Font("문체부 훈민정음체", Font.BOLD, 20));
        lblScore.setHorizontalAlignment(SwingConstants.CENTER);
        lblScore.setBounds(12, 38, 186, 76);
        pn2.add(lblScore);
        
        lblScoreBoard = new JLabel("점 수 출 력 부");
        lblScoreBoard.setHorizontalAlignment(SwingConstants.CENTER);
        lblScoreBoard.setBounds(12, 124, 186, 52);
        pn2.add(lblScoreBoard);
        
        btSokdamStart = new JButton("게 임 종 료");
        btSokdamStart.setForeground(Color.RED);
        btSokdamStart.setFont(new Font("문체부 훈민정음체", Font.BOLD, 19));
        btSokdamStart.setBounds(12, 309, 186, 108);
        pn2.add(btSokdamStart);
        
        pn3 = new JPanel();
        pn3.setBounds(0, 117, 623, 494);
        getContentPane().add(pn3);
        pn3.setLayout(null);
        
        textSokdam = new JTextField();
        textSokdam.setBounds(12, 299, 586, 120);
        pn3.add(textSokdam);
        textSokdam.setColumns(10);
        
        lblSokdamFront = new JLabel("속담 앞부분 출력부");
        lblSokdamFront.setHorizontalAlignment(SwingConstants.CENTER);
        lblSokdamFront.setBounds(12, 109, 586, 180);
        pn3.add(lblSokdamFront);
        
        
// ================= UI ====================
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
// =============== Method ==================
        
        // 속담게임 
        btSokdamStart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String ans = "";
                
                dao.SokdamPrint(ans);
            
            }
        });
        
        // 종료 버튼(마우스/메인으로)
        btSokdamExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new ContinueGameMain();
            }
        });
        
        // 종료 버튼(키보드 엔터/메인으로)
        btSokdamExit.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                dispose();
                new ContinueGameMain();
            }
        });
        
        
        
        
    }
    
    
    
    public static void main(String[] args) { new ContinueSokdamGame(); }
}