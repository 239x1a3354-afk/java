

public class student {
    String stdName;
    int RegNum;
    String Branch;
    double Percentage;
    public static void main(String[] args) {
        student s1=new student();
    	s1.stdName="Scott";
    	s1.RegNum=1001;
    	s1.Branch="CSM";
    	s1.Percentage=89.9;
    	System.out.println("Stdent Name :"+s1.stdName);
    	System.out.println("Reister Number :"+s1.RegNum);
    	System.out.println("Branch :"+s1.Branch);
    	System.out.println("Percentage :"+s1.Percentage);
    	student s2=new student();
    	s2.stdName="Smith";
    	s2.RegNum=1002;
    	s2.Branch="CSE";
    	s2.Percentage=99.9;
    	System.out.println("Stdent Name :"+s2.stdName);
    	System.out.println("Reister Number :"+s2.RegNum);
    	System.out.println("Branch :"+s2.Branch);
    	System.out.println("Percentage :"+s2.Percentage);
    }
        

}
