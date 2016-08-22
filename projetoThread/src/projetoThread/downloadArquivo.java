package projetoThread;
public class downloadArquivo implements Runnable {

	public int totalDownload=0;
	public void run() {
		try {
				for(int i=0;i<=100;i=i+2){
					Thread.sleep(500);
					System.out.print(">");
					totalDownload=i;
				}
		} catch (Exception e) {
				System.out.println("erro 1");
			
			}
	}
}