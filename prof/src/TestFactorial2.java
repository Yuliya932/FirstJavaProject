import junit.framework.TestCase;

/*public class TestFactorial2 extends TestCase {
	public void testFactorial2() {
			int cases[] = { 11, 12, 13, 14, 66 };
			long f1, f2;
			for (int i = 0; i < cases.length; i++) {
				f1 = metStirling(cases[i]);
				f2 = Factorial.fact(cases[i]);
				assertTrue("������ ������ ���������", 
				Math.abs((f1-f2)/Math.max(f1,f2))<0.01);
			}
		}
	
	public long metStirling(int n ) {
		double d = 1, z=n/Math.exp(1);
		for (int i=1; i<=n; i++) d=d*z;
		return Math.round(Math.sqrt(2*Math.PI*n)*d);
	}
}*/
//https://www.youtube.com/watch?v=VFDi6AA6fY4