package projetoThread;

import java.util.Calendar;

public class principal {

	public static void main(String[] args) {
		downloadArquivo d = new downloadArquivo();
		monitorDownload m = new monitorDownload(d);
		
		Thread t=new Thread(d);
		Thread f=new Thread(m);
		t.start();
		f.start();


	}

}
