import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import javax.swing.JMenuItem;
public class Notepad implements ActionListener{

	public static void main(String[] args) {
		new Notepad();
		
		

	}
	
	JTextArea txtarea = new JTextArea();
	JScrollPane sp = new JScrollPane(txtarea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	Font fo = new Font("Arial",Font.PLAIN,20);
	JFrame jf = new JFrame();
	JMenuBar jmb = new JMenuBar();
	JMenu file = new JMenu("File");
	JMenu edit = new JMenu("Edit");
	JMenu format = new JMenu("Format");
	JMenu help = new JMenu("Help");
	JMenu view = new JMenu("View");
	JMenuItem neww = new JMenuItem("New");
	JMenuItem newwindow = new JMenuItem("New Window");
	JMenuItem open = new JMenuItem("Open");
	JMenuItem save = new JMenuItem("Save");
	JMenuItem saveas = new JMenuItem("Save As");
	JMenuItem pagestup = new JMenuItem("Page Setup");
	JMenuItem print = new JMenuItem("Print");
	JMenuItem exit = new JMenuItem("Exit");
	JMenuItem undo = new JMenuItem("Undo");
	JMenuItem cut = new JMenuItem("Cut");
	JMenuItem copy = new JMenuItem("Copy");
	JMenuItem paste = new JMenuItem("Paste");
	JMenuItem del = new JMenuItem("Delete");
	JMenuItem search = new JMenuItem("Search with Bing");
	JMenuItem f = new JMenuItem("Find");
	JMenuItem fn = new JMenuItem("Find Next");
	JMenuItem fp = new JMenuItem("Find Previous");
	JMenuItem replace = new JMenuItem("Replace");
	JMenuItem go = new JMenuItem("Go to");
	JMenuItem selecta = new JMenuItem("Select All");
	JMenuItem td = new JMenuItem("Time/Date");
	JMenuItem ww = new JMenuItem("Word Wrap");
	JMenuItem front = new JMenuItem("Front...");
	JMenuItem sb = new JMenuItem("Status Bar");
	JMenuItem vh = new JMenuItem("View Help");
	JMenuItem an = new JMenuItem("About Notepad");
	
	public Notepad()
	
	{  neww.addActionListener(this);
		help.add(vh);
		help.add(an);
		view.add(sb);
		format.add(ww);
	format.add(front);
		edit.add(undo);
		sp.setSize(800, 900);
		txtarea.setFont(fo);
		txtarea.setLineWrap(true);
		txtarea.setWrapStyleWord(true);
	    edit.add(cut);
	    edit.add(copy);
	    edit.add(paste);
	    edit.add(del);
	    edit.add(search);
	    edit.add(f);
	    edit.add(fn);
	    edit.add(fp);
	    edit.add(go);
	    edit.add(selecta);
	    edit.add(td);
		file.add(neww);
		file.add(newwindow);
		file.add(open);
		file.add(save);
		file.add(saveas);
		file.add(pagestup);
		file.add(print);
		file.add(exit);
		jmb.add(file);
		jmb.add(edit);
		jmb.add(format);
		jmb.add(view);
		jmb.add(help);
		jf.add(sp);
		jf.setJMenuBar(jmb);
		jf.setSize(700, 800);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
          if(e.getSource().equals(neww))
          {
        	  jf.setVisible(false);
        	  New n = new New();
          }
	}
	

}
