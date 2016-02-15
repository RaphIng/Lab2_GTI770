
public class Application {


	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	
		//args[0] Ficher a tester : Ficher d'entree
		WekaIO weka = new WekaIO();
		weka.Read(args[0]);
		System.out.println("lu");
		
		//args[1] Solution la plus performante : Ficher de sortie
		
		
		//args[2] Solution la moins performante : Ficher de sortie

	}

}
