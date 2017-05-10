package com.bit.array01;

public class Pythagoras {

	public static void main(String[] args) {

		for(int i = 2 ; i < 1000;i++){
			for(int j = 2 ; j < 1000; j++){
				for(int k = 2 ; k < 1000; k++){

					if(i+j+k == 1000) {
						if( (i*i) + (j*j) == (k*k)) {
							System.out.printf("%d  %d  %d\n",i,j,k);
							break;
							
						}
					}
				}
			}
		}
	}
}
