package chapter09.sec01.exam01;

class A {
	A(){System.out.println("A ��ü�� ������");}
	
	class B{
		B(){System.out.println("B ��ü�� ������");}
		int field1;
		//static int field2;
		void method1() {}
		//static void method(){}
	}
	
	static class C{
		C(){System.out.println("C ��ü�� ������");}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	void method() {
		class D{
			D(){System.out.println("D ��ü�� ������");}
			int field1;
			//static int field2;
			void method1() {}
			//static void method2(){}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}

}
