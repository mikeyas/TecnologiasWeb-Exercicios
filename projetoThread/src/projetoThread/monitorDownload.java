package projetoThread;
public class monitorDownload extends downloadArquivo implements Runnable{

downloadArquivo i;
	public monitorDownload(downloadArquivo d) {
		i = d;
	}
	public void run() {
		System.out.print("Iniciando...|");
		while(true){
			try {
								if(i.totalDownload<100){
									Thread.sleep(5000);
					System.out.print(" "+i.totalDownload+"% ");
				}else{
					System.out.print("|Download Concluido!");
					break;
				}
			} catch (InterruptedException e) {
				System.out.println("erro 2");
			}
		}
		
	}

}
