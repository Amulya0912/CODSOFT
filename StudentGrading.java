import java.util.Scanner;

public class StudentGrading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("STUDENT GARDE CALCULATOR");
        System.out.println("-------------------------");
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        while(n <=0 ){
            System.out.println("Number of subjects should be more than 0.");
            n = sc.nextInt();
        }
        int total = 0;
        for(int i=0;i<n;i++){
            System.out.print("Enter marks in subject "+(i+1)+": ");
            int marks = sc.nextInt();
            while(marks < 0 || marks > 100){
                System.out.println("Marks should be between 0 and 100 only.Enter correct marks.");
                marks = sc.nextInt();
            }
            total +=marks;
        }
        double avg = (double) total/n;
        System.out.println();
        System.out.println("----------------------------");
        System.out.println("Total marks: "+total);
        System.out.println("Average Percentage: "+avg+"%");
        grade(avg);
        System.out.println("----------------------------");
        sc.close();
        
        
    }
    static void grade(double avg){
        if(avg >=90)
        System.out.println("Grade:A");
        else if(avg >=80)
        System.out.println("Grade:B");
        else if(avg >=70)
        System.out.println("Grade:C");
        else if(avg >=60)
        System.out.println("Grade:D");
        else if(avg >=50)
        System.out.println("Grade:E");
        else
        System.out.println("Grade:F");
    }
    
}
