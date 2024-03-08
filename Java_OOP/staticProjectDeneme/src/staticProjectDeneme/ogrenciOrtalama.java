package staticProjectDeneme;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class ogrenciOrtalama {
	int vize,finall;
	public static double ort;
	
	public ogrenciOrtalama(int vize,int finall) {
		this.vize=vize;
		this.finall=finall;
	}
	public  double hsp() {
		return vize*0.4+finall*0.6;
	}
	public static void hesapla() {
		ogrenciOrtalama.ort=10;
	}
}
