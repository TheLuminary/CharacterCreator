import javax.swing.SwingUtilities;

public class CharacterCreator {
    public static void main(String[] args) {
    	
    	//Initial Data List Setup work:
    	@SuppressWarnings("unused")
		GenerateSourceData sourceData = new GenerateSourceData(); 
	    
	    SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MainFrame();
			}
	    });
    }
}