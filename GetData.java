import javax.swing.JOptionPane;

public class GetData 
{
	static double getDouble(String s) 
	{
		return Double.parseDouble(getWord(s));
	}
	static int getInt(String s)
	{
		return Integer.parseInt(getWord(s));
	}
	static String getWord(String s)
	{
		return JOptionPane.showInputDialog(s);
	}
}

