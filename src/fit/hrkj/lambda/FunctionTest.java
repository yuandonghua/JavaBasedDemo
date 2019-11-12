package fit.hrkj.lambda;

import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;

public class FunctionTest {
	public static void main(String[] args) {
		test(value -> {
			IntTool intTool = new IntTool();

			DoubleToIntFunction doubleToIntFunction = intTool;
			doubleToIntFunction.applyAsInt(Integer.valueOf(10));
			DoubleToLongFunction doubleToLongFunction = intTool;

			return 10;
		});
	}

//	public static void test(IntTool intTool) {
//
//	}
	public static void test(DoubleToIntFunction intTool) {

	}

}

class IntTool implements DoubleToIntFunction, DoubleToLongFunction {

	@Override
	public int applyAsInt(double value) {
		// TODO Auto-generated method stub

		return (int) value * 10;
	}

	@Override
	public long applyAsLong(double value) {
		// TODO Auto-generated method stub

		return (long) value;
	}

}
