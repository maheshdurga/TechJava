package com.looping;

public class LoopingPrograms {
	public void loop() {
		char ch='A';
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=6-i;j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}

	}
	
	
	public void loop1() {
		char ch='A';
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}

	} 
	public void loop2() {
		char ch='A';
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}

	}
	public void loop3() {
		char ch='A';
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(' ');
				
			}
			for(int j=1;j<=6-i;j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}

	}
	public void loop4() {
		
		for(int i=1;i<=5;i++) {
			char ch='A';
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}

	}
	public void loop5() {
		char ch='A';
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
				
			}
			ch++;
			System.out.println();
		}

	}
	public void loop6() {
		char ch='A';
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=6-i;j++) {
				System.out.print(" ");
				
			}
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}

	}
	public void loop7() {
		char ch='A';
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=6-i;j++) {
				System.out.print(" ");
				
			}
			for(int j=1;j<=(2*i)-1;j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}

	}
	public void loop8() {
		char ch='A';
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=6-i;j++) {
				System.out.print(" ");
				
			}
			for(int j=0;j<(i-1)*2;j++) {
				System.out.print(ch);
			}
			ch++;
			System.out.println();
		}

	}
	
	
	
	

	

	public static void main(String[] args) {
		LoopingPrograms lp=new LoopingPrograms();
				lp.loop();
				lp.loop1();
				lp.loop2();
				lp.loop3();
				lp.loop4();
				lp.loop5();
				lp.loop6();
				lp.loop7();
				lp.loop8();

	}}
