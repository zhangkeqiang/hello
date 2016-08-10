package kata.handler;

public class A1Handler extends AHandler {
    
    @Override
    protected int analyzeJobStep1(String jobName) {
        return 1004;
    }

	/**@method function1
	 * @description 
	 * @return int
	*/
	public int function1(int i) {
		return i;
	}

}
