package com.imooc;

public class Bus extends Transport {
	public int max;
	public void Zuoren(){
		System.out.println("��������������"+max+"��");
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bus other = (Bus) obj;
		if (max != other.max)
			return false;
		return true;
	}
}
