package com.in28minutes.oops.level2.interfaces;

public class Project {
	
	interface Test {
		void nothing();
		default void nothing1() {
			// default가 들어가면 override가 필요 없음
			
		}
	}
	
	class Class1 implements Test {

		@Override
		public void nothing() {
			// TODO Auto-generated method stub
			
		}
		
	}

	class Class2 implements Test {
		
		@Override
		public void nothing() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public static void main(String[] args) {
//		ComplexAlgorithm algorithm = new DummyAlgorithm();
		ComplexAlgorithm algorithm = new RealAlgorithm();
		System.out.println(algorithm.complexAlgorithm(10, 20));
	}
}
