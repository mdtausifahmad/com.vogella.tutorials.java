public interface A {
	default void m() {}
}

public interface B {
	default void m() {}
}

public class C implements A, B {
	@Override
	public void m() {}
}
