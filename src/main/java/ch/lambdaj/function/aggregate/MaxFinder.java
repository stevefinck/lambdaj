package ch.lambdaj.function.aggregate;


public class MaxFinder<T> extends Chooser<T> {

	@Override
	public Comparable<T> choose(Comparable<T> first, Comparable<T> second) {
		return first.compareTo((T)second) > 0 ? first : second;
	}
}