package kata.handler;

public class AHandler implements Handler {

    public int analyzeJob(String jobName) {
        int step1 = analyzeJobStep1(jobName);
        return step1;
    }
    
    
    protected int analyzeJobStep1(String jobName) {
        
        return 1;
    }


    public int analyzePerson(String personName) {
        return 0;
    }

}
