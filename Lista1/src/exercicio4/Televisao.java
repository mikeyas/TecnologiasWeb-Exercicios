package exercicio4;

public class Televisao {

	private Integer canal;
	private Integer volume;
	
	public Integer getCanal() {
		return canal;
	}
	
	public void setCanal(Integer canal) {
		this.canal = canal;
	}
	
	public Integer getVolume() {
		return volume;
	}
	
	public void setVolume(Integer volume) {
		this.volume = volume;
	}
	
	public Televisao (Integer canal,Integer volume){
		this.setCanal(canal);
		this.setVolume(volume);
	}
}
