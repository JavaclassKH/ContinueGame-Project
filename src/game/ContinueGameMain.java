package game;
 
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
 
public class ContinueGameMain extends JFrame {
    private JPanel pn1 , pn2 , pn3;
    private JButton btExit , btSokdamGame , btLyricGame , btJoonbijung;
    private JLabel lbltitle , lblImage;
    
    public ContinueGameMain() {
        super("이어말하기 게임~~");
        setSize(850 , 650);
        getContentPane().setLayout(null);
        
        pn1 = new JPanel();
        pn1.setBackground(new Color(255, 218, 185));
        pn1.setBounds(0, 0, 834, 80);
        getContentPane().add(pn1);
        pn1.setLayout(null);
        
        lbltitle = new JLabel("이어말하기 게임");
        lbltitle.setFont(new Font("문체부 훈민정음체", Font.BOLD, 35));
        lbltitle.setHorizontalAlignment(SwingConstants.CENTER);
        lbltitle.setBounds(0, 0, 677, 80);
        pn1.add(lbltitle);
        
        btExit = new JButton("게 임 종 료");
        btExit.setFont(new Font("문체부 훈민정음체", Font.PLAIN, 18));
        btExit.setForeground(new Color(255, 0, 0));
        btExit.setBounds(689, 10, 133, 60);
        pn1.add(btExit);
        
        pn3 = new JPanel();
        pn3.setBounds(0, 531, 834, 80);
        getContentPane().add(pn3);
        pn3.setLayout(null);
        
        btSokdamGame = new JButton("속  담  게  임");
        btSokdamGame.setFont(new Font("문체부 훈민정음체", Font.BOLD, 18));
        btSokdamGame.setBounds(40, 10, 207, 60);
        pn3.add(btSokdamGame);
        
        btLyricGame = new JButton("가  사  게  임");
        btLyricGame.setFont(new Font("문체부 훈민정음체", Font.BOLD, 18));
        btLyricGame.setBounds(313, 10, 207, 60);
        pn3.add(btLyricGame);
        
        btJoonbijung = new JButton("준  비  중");
        btJoonbijung.setForeground(new Color(255, 0, 0));
        btJoonbijung.setFont(new Font("문체부 훈민정음체", Font.BOLD, 18));
        btJoonbijung.setBounds(586, 10, 207, 60);
        pn3.add(btJoonbijung);
        
        pn2 = new JPanel();
        pn2.setBounds(0, 80, 834, 453);
        getContentPane().add(pn2);
        pn2.setLayout(null);
        
        lblImage = new JLabel("사  진  출  력  부");
        lblImage.setHorizontalAlignment(SwingConstants.CENTER);
        lblImage.setBounds(0, 0, 834, 453);
        pn2.add(lblImage);
        
// ================= UI ====================
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
// =============== Method ==================
        
        // 종료버튼(마우스)
        btExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        // 종료버튼(키보드 엔터)
        btExit.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                System.exit(0);                
            }
        });
        
        // 준비중 버튼(마우스)
        btJoonbijung.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "즐거운 새 게임을 준비중입니다!!");
                JOptionPane.showMessageDialog(null, "속담게임과 가사게임을 즐겨주세요~~");                
            }
        });
        
        // 준비중 버튼(키보드 엔터)
        btJoonbijung.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                JOptionPane.showMessageDialog(null, "즐거운 새 게임을 준비중입니다!!");
                JOptionPane.showMessageDialog(null, "속담게임과 가사게임을 즐겨주세요~~");                    
            }
        });
        
        
        // 속담게임 버튼(마우스)
        btSokdamGame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new ContinueSokdamGame();
            }
        });
        
        
        // 속담게임 버튼(키보드 엔터)
        btSokdamGame.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                dispose();
                new ContinueSokdamGame();
            }
        });
        
        
        // 가사게임 버튼(마우스)
        btLyricGame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
//                new LyricGame();                
            }
        });            
        
        // 가사게임 버튼(키보드 엔터)
        btLyricGame.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                dispose();
//            new LyricGame();        
            }
        });
        
        
        
 
    }
    
    public static void main(String[] args) { new ContinueGameMain(); }
}