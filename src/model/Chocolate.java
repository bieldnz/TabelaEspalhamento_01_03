package model;

import java.util.Objects;

public class Chocolate {
	
	public int volume;
	public int peso;
	@Override
	public int hashCode() {
		if(volume >= 50 & volume <= 60) {
			peso = 60;
			return 0;
		}
		if(volume >= 100 & volume <= 110) {
			peso = 115;
			return 1;
		}
		if(volume >= 150 & volume <= 165) {
			peso = 160;
			return 2;
		}
		if(volume >= 200 & volume <= 220) {
			peso =  215;
			return 3;
		}
		if(volume >= 260 & volume <= 280) {
			peso = 280;
			return 4;
		}
		return 0;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chocolate other = (Chocolate) obj;
		return peso == other.peso && volume == other.volume;
	}

	
	
}
