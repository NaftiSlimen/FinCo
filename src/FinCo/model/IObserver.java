package FinCo.model;

public interface IObserver {
	public default String update() {
		System.out.println("hey");
		return "yo";
	}
}
